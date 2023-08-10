package cn.ruihusoft.xviapi.pojo.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ContentResult {

    @JsonProperty("ID")
    private int id;

    @JsonProperty("Icon")
    private String icon;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Url")
    private String url;

}
