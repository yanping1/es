package com.dkha.es.controller;

import com.alibaba.fastjson.JSON;
import com.dkha.es.entity.Labor;
import com.dkha.es.mapper.LaborMapper;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class TestController {
    @Resource
    private LaborMapper laborMapper;
    @Resource
    private RestHighLevelClient client;

    @GetMapping("/es")
    public void Index() throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(20);
        for (int i = 2650441 ; i < 4556050; i = i + 1000) {
            List<Labor> list = laborMapper.page(i, 1000);
            service.submit(new ImportEs(list, client));
        }

    }

}

class ImportEs implements Runnable {
    private List<Labor> list;

    public ImportEs(List<Labor> list, RestHighLevelClient client) {
        this.list = list;
        this.client = client;
    }

    private RestHighLevelClient client;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始执行");
        BulkRequest bulkRequest = new BulkRequest();
        try {
            for (Labor labor : list) {


                IndexRequest request = new IndexRequest("employ", "labor", labor.getIdLabor());
                request.source(JSON.toJSONString(labor), XContentType.JSON);
                bulkRequest.add(request);
            }
            BulkResponse response = client.bulk(bulkRequest, RequestOptions.DEFAULT);
            System.out.println(Thread.currentThread().getName() + "导入数据成功");
        } catch (Exception e) {
            e.printStackTrace();


        }

    }
}