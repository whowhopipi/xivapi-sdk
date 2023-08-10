package cn.ruihusoft.xviapi.pojo.action;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ActionCategory {

    @JsonProperty("ID")
    private Integer id;
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
}