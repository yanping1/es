import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CRUD {


    private RestHighLevelClient client;

    @Before
    public void init() {
        client = ClientUtil.getInstance();
    }

    //创建索引
    @Test
    public void index1() throws IOException {


        IndexRequest request = new IndexRequest(
                "posts", //Index
                "doc", //Type
                "2"); //Document id
        String jsonString = "{" +
                "\"user\":\"kimchy\"," +
                "\"postDate\":\"2013-11-30\"," +
                "\"message\":\"trying out Elasticsearch\"" +
                "}";

        request.source(jsonString, XContentType.JSON);//指定文档来源，此处为json
//        Map<String, Object> jsonMap = new HashMap<>();
//        jsonMap.put("user", "kimchy");
//        jsonMap.put("postDate", new Date());
//        jsonMap.put("message", "trying out Elasticsearch");
//        IndexRequest indexRequest = new IndexRequest("posts", "doc", "1"
//        ).source(jsonMap); //Map 作为文档源，它可以自动转换为 JSON 格式。
//        IndexResponse response = client.index(request);
        IndexResponse response = client.index(request, RequestOptions.DEFAULT);
    }

    /**
     * 文档更新
     * 文档在Elasticsearch中是不可变的——我们不能修改他们。如果需要更新已存在的文档，我
     * 们可以使用index API 重建索引(reindex) 或者替换掉它。
     * 在内部，Elasticsearch已经标记旧文档为删除并添加了一个完整的新文档。旧版本文档不会
     * 立即消失，但你也不能去访问它。Elasticsearch会在你继续索引更多数据时清理被删除的文
     * 档。
     * 在本章的后面，我们将会在《局部更新》中探讨 update API。这个API 似乎 允许你修改文档
     * 的局部，但事实上Elasticsearch遵循与之前所说完全相同的过程，这个过程如下：
     * 1. 从旧文档中检索JSON
     * 2. 修改它
     * 3. 删除旧文档
     * 4. 索引新文档
     * 唯一的不同是 update API完成这一过程只需要一个客户端请求既可，不再需
     * 要 get 和 index 请求了。
     */
    @Test
    public void update01() throws Exception {
        UpdateRequest updateRequest1 = new UpdateRequest("posts", //Index
                "doc", //Type
                "1");
        Map map = new HashMap();
        map.put("user", "tom");//存在的标量字段被覆盖，新字段被添加
        updateRequest1.doc(map, XContentType.JSON);
        UpdateResponse updateResponse = client.update(updateRequest1, RequestOptions.DEFAULT);

    }


}
