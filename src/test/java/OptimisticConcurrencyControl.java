import org.elasticsearch.ElasticsearchStatusException;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

//乐观并发控制
public class OptimisticConcurrencyControl {
    private Logger logger = LoggerFactory.getLogger(OptimisticConcurrencyControl.class);
    private RestHighLevelClient client;

    @Before
    public void init() {
        client = ClientUtil.getInstance();
    }

    @Test
    public void Teat01() throws Exception {
        try {

            GetRequest getRequest = new GetRequest("posts", //Index
                    "doc", //Type
                    "1");

            GetResponse response = client.get(getRequest, RequestOptions.DEFAULT);
            long version = response.getVersion();//查询出当前版本号

            Map map = response.getSource();
            UpdateRequest updateRequest = new UpdateRequest("posts", //Index
                    "doc", //Type
                    "1");
            map.put("user", "hhhccccgggg");
            updateRequest.doc(map, XContentType.JSON);
            updateRequest.version(version - 1);//提交修改的时候指定版本号，如果在修改时版本号发生了变化，会抛出ElasticsearchStatusException异常
            UpdateResponse updateResponse = client.update(updateRequest, RequestOptions.DEFAULT);

        } catch (ElasticsearchStatusException e) {
            logger.error(e.getMessage());
        }
    }


}
