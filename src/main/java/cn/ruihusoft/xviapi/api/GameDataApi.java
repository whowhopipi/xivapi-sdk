package cn.ruihusoft.xviapi.api;

import cn.ruihusoft.xviapi.core.ContentType;
import cn.ruihusoft.xviapi.core.EnumExpander;
import cn.ruihusoft.xviapi.pojo.ContentResponse;
import cn.ruihusoft.xviapi.pojo.common.QueryParam;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

public interface GameDataApi {

    @RequestLine("GET /content")
    List<String> content();

    @RequestLine("GET /{content}")
    ContentResponse contentList(
            @Param(value = "content",expander= EnumExpander.class) ContentType content,
            @QueryMap QueryParam param
    );

    @RequestLine("GET /servers")
    List<String> servers();

    @RequestLine("GET /servers/dc")
    Map<String, List<String>> dc();

}
