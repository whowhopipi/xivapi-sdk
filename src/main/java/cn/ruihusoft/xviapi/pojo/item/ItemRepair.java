package cn.ruihusoft.xviapi.pojo.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemRepair {

    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("Item")
    private Item item;
    @JsonProperty("ItemTarget")
    private String itemTarget;
    @JsonProperty("ItemTargetID")
    private Integer itemTargetID;
}