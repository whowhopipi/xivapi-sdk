package cn.ruihusoft.xviapi.pojo.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemSearchCategory {

    @JsonProperty("Category")
    private Integer category;
    @JsonProperty("ClassJob")
    private Integer classJob;
    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("IconHD")
    private String iconHD;
    @JsonProperty("IconID")
    private Integer iconID;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Name_de")
    private String nameDe;
    @JsonProperty("Name_en")
    private String nameEn;
    @JsonProperty("Name_fr")
    private String nameFr;
    @JsonProperty("Name_ja")
    private String nameJa;
    @JsonProperty("Order")
    private Integer order;
}