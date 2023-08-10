package cn.ruihusoft.xviapi.pojo;

import cn.ruihusoft.xviapi.pojo.common.Pagination;
import cn.ruihusoft.xviapi.pojo.content.ContentResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ContentResponse {

    @JsonProperty("Pagination")
    private Pagination pagination;

    @JsonProperty("Results")
    private List<ContentResult> results;
}
