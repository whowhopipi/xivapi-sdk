package cn.ruihusoft.xviapi.pojo.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemSortCategory {

    @JsonProperty("ID")
    private Integer	id;
    @JsonProperty("Param")
    private Integer	param;
}
