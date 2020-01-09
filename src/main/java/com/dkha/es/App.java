package com.dkha.es;

import org.apache.http.HttpHost;
import org.apache.ibatis.annotations.Mapper;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.dkha.es.mapper")
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }

    //初始化ESClient
    @Bean
    public RestHighLevelClient getBean() {
        RestHighLevelClient restHighLevelClient = new RestHighLevelClient(RestClient.builder(

                new HttpHost("192.168.3.240", 9202, "http"),
                new HttpHost("192.168.3.240", 9201, "http"),
                new HttpHost("192.168.3.240", 9200, "http")));

        return restHighLevelClient;
    }
}
