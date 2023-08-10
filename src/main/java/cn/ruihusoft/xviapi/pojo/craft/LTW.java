package cn.ruihusoft.xviapi.pojo.craft;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LTW {

    @JsonProperty("ALC")
    private Integer alc;
    @JsonProperty("ARM")
    private Integer arm;
    @JsonProperty("AnimationEnd")
    private Integer animationEnd;
    @JsonProperty("AnimationStart")
    private Integer animationStart;
    @JsonProperty("BSM")
    private Integer bsm;
    @JsonProperty("CRP")
    private Integer crp;
    @JsonProperty("CUL")
    private Integer cul;
    @JsonProperty("ClassJob")
    private Integer classJob;
    @JsonProperty("ClassJobCategory")
    private Integer classJobCategory;
    @JsonProperty("ClassJobLevel")
    private Integer classJobLevel;
    @JsonProperty("Cost")
    private Integer cost;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Description_de")
    private String descriptionDe;
    @JsonProperty("Description_en")
    private String descriptionEn;
    @JsonProperty("Description_fr")
    private String descriptionFr;
    @JsonProperty("Description_ja")
    private String descriptionJa;
    @JsonProperty("GSM")
    private Integer gsm;
    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("IconHD")
    private String iconHD;
    @JsonProperty("IconID")
    private Integer iconID;
    @JsonProperty("LTW")
    private Integer ltw;
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
    @JsonProperty("QuestRequirement")
    private Integer questRequirement;
    @JsonProperty("Specialist")
    private Integer specialist;
    @JsonProperty("WVR")
    private Integer wvr;
}