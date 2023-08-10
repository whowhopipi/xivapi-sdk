package cn.ruihusoft.xviapi.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemResponse {

    @JsonProperty("ID")
    private Integer id;

    @JsonProperty("Name")
    private String	name;

    @JsonProperty("Name_cn")
    private String	nameCn;

    @JsonProperty("Name_de")
    private String	nameDe;

    @JsonProperty("Name_en")
    private String	nameEn;

    @JsonProperty("Name_fr")
    private String	nameFr;

    @JsonProperty("Name_ja")
    private String	nameJa;

    @JsonProperty("Name_kr")
    private String	nameKr;
}
