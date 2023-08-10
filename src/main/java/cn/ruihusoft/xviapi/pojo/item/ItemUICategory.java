package cn.ruihusoft.xviapi.pojo.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemUICategory {

    @JsonProperty("ID")
    private Integer	id;
    @JsonProperty("Icon")
    private String	icon;
    @JsonProperty("IconHD")
    private String	iconHD;
    @JsonProperty("IconID")
    private Integer	iconID;
    @JsonProperty("name")
    private String	Name;
    @JsonProperty("Name_De")
    private String	nameDe;
    @JsonProperty("Name_En")
    private String	nameEn;
    @JsonProperty("Name_Fr")
    private String	nameFr;
    @JsonProperty("Name_Ja")
    private String	nameJa;
    @JsonProperty("OrderMajor")
    private Integer	orderMajor;
    @JsonProperty("OrderMinor")
    private Integer	orderMinor;
}
