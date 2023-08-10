package cn.ruihusoft.xviapi.api;

import cn.ruihusoft.xviapi.pojo.ItemResponse;
import feign.Param;
import feign.RequestLine;

public interface GameDataDetailApi {

    @RequestLine("GET /Item/{id}")
    ItemResponse itemDetail(@Param("id") Integer id);
}
