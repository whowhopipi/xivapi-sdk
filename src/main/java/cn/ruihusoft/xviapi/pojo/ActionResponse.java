package cn.ruihusoft.xviapi.pojo;

import cn.ruihusoft.xviapi.pojo.action.*;
import cn.ruihusoft.xviapi.pojo.classjob.ClassJobCategory;
import cn.ruihusoft.xviapi.pojo.common.GameContentLinks;
import cn.ruihusoft.xviapi.pojo.common.GamePatch;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ActionResponse {

    @JsonProperty("ActionCategory")
    private ActionCategory actionCategory;
    @JsonProperty("ActionCategoryTarget")
    private String actionCategoryTarget;
    @JsonProperty("ActionCategoryTargetID")
    private Integer actionCategoryTargetID;
    @JsonProperty("ActionCombo")
    private Object actionCombo;
    // FIXME 类型不确定：ActionCombo
    @JsonProperty("ActionComboTarget")
    private String actionComboTarget;
    @JsonProperty("ActionComboTargetID")
    private Integer actionComboTargetID;
    @JsonProperty("ActionProcStatus")
    private Object actionProcStatus;
    // FIXME 类型不确定：ActionProcStatus
    @JsonProperty("ActionProcStatusTarget")
    private String actionProcStatusTarget;
    @JsonProperty("ActionProcStatusTargetID")
    private Integer actionProcStatusTargetID;
    @JsonProperty("ActionTimelineHit")
    private ActionTimelineHit actionTimelineHit;
    @JsonProperty("ActionTimelineHitTarget")
    private String actionTimelineHitTarget;
    @JsonProperty("ActionTimelineHitTargetID")
    private Integer actionTimelineHitTargetID;
    @JsonProperty("AdditionalCooldownGroup")
    private Integer additionalCooldownGroup;
    @JsonProperty("AffectsPosition")
    private Integer affectsPosition;
    @JsonProperty("AnimationEnd")
    private Object animationEnd;
    // FIXME 类型不确定：AnimationEnd
    @JsonProperty("AnimationEndTarget")
    private String animationEndTarget;
    @JsonProperty("AnimationEndTargetID")
    private String animationEndTargetID;
    @JsonProperty("AnimationStart")
    private Object animationStart;
    // FIXME 类型不确定：AnimationStart
    @JsonProperty("AnimationStartTarget")
    private String animationStartTarget;
    @JsonProperty("AnimationStartTargetID")
    private Integer animationStartTargetID;
    @JsonProperty("Aspect")
    private Integer aspect;
    @JsonProperty("AttackType")
    private Object attackType;
    // FIXME 类型不确定：AttackType
    @JsonProperty("AttackTypeTarget")
    private String attackTypeTarget;
    @JsonProperty("AttackTypeTargetID")
    private String attackTypeTargetID;
    @JsonProperty("BehaviourType")
    private Integer behaviourType;
    @JsonProperty("CanTargetDead")
    private Integer canTargetDead;
    @JsonProperty("CanTargetFriendly")
    private Integer canTargetFriendly;
    @JsonProperty("CanTargetHostile")
    private Integer canTargetHostile;
    @JsonProperty("CanTargetParty")
    private Integer canTargetParty;
    @JsonProperty("CanTargetSelf")
    private Integer canTargetSelf;
    @JsonProperty("Cast100ms")
    private Integer cast100ms;
    @JsonProperty("CastType")
    private Integer castType;
    @JsonProperty("ClassJob")
    private Object classJob;
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
    @JsonProperty("CooldownGroup")
    private Integer cooldownGroup;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("DescriptionJSON_cn")
    private Object descriptionJSONCn;
    // FIXME 类型不确定：DescriptionJSON_cn
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
    @JsonProperty("EffectRange")
    private Integer effectRange;
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
    @JsonProperty("IsPlayerAction")
    private Integer isPlayerAction;
    @JsonProperty("IsPvP")
    private Integer isPvP;
    @JsonProperty("IsRoleAction")
    private Integer isRoleAction;
    @JsonProperty("MaxCharges")
    private Integer maxCharges;
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
    @JsonProperty("Omen")
    private Object omen;
    // FIXME 类型不确定：Omen
    @JsonProperty("OmenTarget")
    private String omenTarget;
    @JsonProperty("OmenTargetID")
    private Integer omenTargetID;
    @JsonProperty("Patch")
    private Integer patch;
    @JsonProperty("PreservesCombo")
    private Integer preservesCombo;
    @JsonProperty("PrimaryCostType")
    private Integer primaryCostType;
    @JsonProperty("PrimaryCostValue")
    private Integer primaryCostValue;
    @JsonProperty("Range")
    private String range;
    @JsonProperty("Recast100ms")
    private Integer recast100ms;
    @JsonProperty("SecondaryCostType")
    private Integer secondaryCostType;
    @JsonProperty("SecondaryCostValue")
    private Integer secondaryCostValue;
    @JsonProperty("StatusGainSelf")
    private Object statusGainSelf;
    // FIXME 类型不确定：StatusGainSelf
    @JsonProperty("StatusGainSelfTarget")
    private String statusGainSelfTarget;
    @JsonProperty("StatusGainSelfTargetID")
    private Integer statusGainSelfTargetID;
    @JsonProperty("TargetArea")
    private Integer targetArea;
    @JsonProperty("UnlockLink")
    private Integer unlockLink;
    @JsonProperty("Url")
    private String url;
    @JsonProperty("VFX")
    private Object vfx;
    // FIXME 类型不确定：VFX
    @JsonProperty("VFXTarget")
    private String vfxtarget;
    @JsonProperty("VFXTargetID")
    private Integer vfxtargetID;
    @JsonProperty("XAxisModifier")
    private Integer xaxisModifier;
}