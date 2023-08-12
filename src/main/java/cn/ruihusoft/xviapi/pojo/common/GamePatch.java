package cn.ruihusoft.xviapi.pojo.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GamePatch{

    @JsonProperty("ID")
    private Integer	id;

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

    @JsonProperty("ReleaseDate")
    private Integer	releaseDate;

    @JsonProperty("Version")
    private String	version;

    @JsonProperty("Banner")
    private String	banner;

    @JsonProperty("ExName")
    private String	exName;

    @JsonProperty("ExVersion")
    private Integer	exVersion;

}
