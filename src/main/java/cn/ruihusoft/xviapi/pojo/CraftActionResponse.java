package cn.ruihusoft.xviapi.pojo;

import cn.ruihusoft.xviapi.pojo.classjob.ClassJob;
import cn.ruihusoft.xviapi.pojo.classjob.ClassJobCategory;
import cn.ruihusoft.xviapi.pojo.common.AnimationEnd;
import cn.ruihusoft.xviapi.pojo.common.AnimationStart;
import cn.ruihusoft.xviapi.pojo.common.GameContentLinks;
import cn.ruihusoft.xviapi.pojo.common.GamePatch;
import cn.ruihusoft.xviapi.pojo.craft.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CraftActionResponse {

    @JsonProperty("ALC")
    private Object alc;
    // FIXME 类型不确定：ALC
    @JsonProperty("ALCTarget")
    private String alctarget;
    @JsonProperty("ALCTargetID")
    private Integer alctargetID;
    @JsonProperty("ARM")
    private ARM arm;
    @JsonProperty("ARMTarget")
    private String armtarget;
    @JsonProperty("ARMTargetID")
    private Integer armtargetID;
    @JsonProperty("AnimationEnd")
    private AnimationEnd animationEnd;
    @JsonProperty("AnimationEndTarget")
    private String animationEndTarget;
    @JsonProperty("AnimationEndTargetID")
    private Integer animationEndTargetID;
    @JsonProperty("AnimationStart")
    private AnimationStart animationStart;
    @JsonProperty("AnimationStartTarget")
    private String animationStartTarget;
    @JsonProperty("AnimationStartTargetID")
    private Integer animationStartTargetID;
    @JsonProperty("BSM")
    private BSM bsm;
    @JsonProperty("BSMTarget")
    private String bsmtarget;
    @JsonProperty("BSMTargetID")
    private Integer bsmtargetID;
    @JsonProperty("CRP")
    private CRP crp;
    @JsonProperty("CRPTarget")
    private String crptarget;
    @JsonProperty("CRPTargetID")
    private Integer crptargetID;
    @JsonProperty("CUL")
    private CUL cul;
    @JsonProperty("CULTarget")
    private String cultarget;
    @JsonProperty("CULTargetID")
    private Integer cultargetID;
    @JsonProperty("ClassJob")
    private ClassJob classJob;
    @JsonProperty("ClassJobCategory")
    private ClassJobCategory classJobCategory;
    @JsonProperty("ClassJobCategoryTarget")
    private String classJobCategoryTarget;
    @JsonProperty("ClassJobCategoryTargetID")
    private Integer classJobCategoryTargetID;
    @JsonProperty("ClassJobLevel")
    private Integer classJobLevel;
    @JsonProperty("ClassJobTarget")
    private String classJobTarget;
    @JsonProperty("ClassJobTargetID")
    private Integer classJobTargetID;
    @JsonProperty("Cost")
    private Integer cost;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("DescriptionJSON")
    private List<String> descriptionJSON;
    @JsonProperty("DescriptionJSON_cn")
    private Object descriptionJSONCn;
    // FIXME 类型不确定：DescriptionJSON_cn
    @JsonProperty("DescriptionJSON_de")
    private List<String> descriptionJSONDe;
    @JsonProperty("DescriptionJSON_en")
    private List<String> descriptionJSONEn;
    @JsonProperty("DescriptionJSON_fr")
    private List<String> descriptionJSONFr;
    @JsonProperty("DescriptionJSON_ja")
    private List<String> descriptionJSONJa;
    @JsonProperty("DescriptionJSON_kr")
    private Object descriptionJSONKr;
    // FIXME 类型不确定：DescriptionJSON_kr
    @JsonProperty("Description_cn")
    private Object descriptionCn;
    // FIXME 类型不确定：Description_cn
    @JsonProperty("Description_de")
    private String descriptionDe;
    @JsonProperty("Description_en")
    private String descriptionEn;
    @JsonProperty("Description_fr")
    private String descriptionFr;
    @JsonProperty("Description_ja")
    private String descriptionJa;
    @JsonProperty("Description_kr")
    private Object descriptionKr;
    // FIXME 类型不确定：Description_kr
    @JsonProperty("GSM")
    private GSM gsm;
    @JsonProperty("GSMTarget")
    private String gsmtarget;
    @JsonProperty("GSMTargetID")
    private Integer gsmtargetID;
    @JsonProperty("GameContentLinks")
    private GameContentLinks gameContentLinks;
    @JsonProperty("GamePatch")
    private GamePatch gamePatch;
    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("IconHD")
    private String iconHD;
    @JsonProperty("IconID")
    private Integer iconID;
    @JsonProperty("LTW")
    private LTW ltw;
    @JsonProperty("LTWTarget")
    private String ltwtarget;
    @JsonProperty("LTWTargetID")
    private Integer ltwtargetID;
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
    @JsonProperty("Patch")
    private Integer patch;
    @JsonProperty("QuestRequirement")
    private Object questRequirement;
    // FIXME 类型不确定：QuestRequirement
    @JsonProperty("QuestRequirementTarget")
    private String questRequirementTarget;
    @JsonProperty("QuestRequirementTargetID")
    private Integer questRequirementTargetID;
    @JsonProperty("Specialist")
    private Integer specialist;
    @JsonProperty("Url")
    private String url;
    @JsonProperty("WVR")
    private WVR wvr;
    @JsonProperty("WVRTarget")
    private String wvrtarget;
    @JsonProperty("WVRTargetID")
    private Integer wvrtargetID;
}