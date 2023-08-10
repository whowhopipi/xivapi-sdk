package cn.ruihusoft.xviapi.pojo.classjob;

import cn.ruihusoft.xviapi.pojo.item.ItemSoulCrystal;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClassJobRepair {

    @JsonProperty("Abbreviation")
    private String abbreviation;
    @JsonProperty("Abbreviation_de")
    private String abbreviationDe;
    @JsonProperty("Abbreviation_en")
    private String abbreviationEn;
    @JsonProperty("Abbreviation_fr")
    private String abbreviationFr;
    @JsonProperty("Abbreviation_ja")
    private String abbreviationJa;
    @JsonProperty("BattleClassIndex")
    private String battleClassIndex;
    @JsonProperty("CanQueueForDuty")
    private Integer canQueueForDuty;
    @JsonProperty("ClassJobCategory")
    private ClassJobCategory classJobCategory;
    @JsonProperty("ClassJobCategoryTarget")
    private String classJobCategoryTarget;
    @JsonProperty("ClassJobCategoryTargetID")
    private Integer classJobCategoryTargetID;
    // FIXME 类型不确定
    @JsonProperty("ClassJobParent")
    private Object classJobParent;
    @JsonProperty("ClassJobParentTarget")
    private String classJobParentTarget;
    @JsonProperty("ClassJobParentTargetID")
    private Integer classJobParentTargetID;
    @JsonProperty("DohDolJobIndex")
    private Integer dohDolJobIndex;
    @JsonProperty("ExpArrayIndex")
    private Integer expArrayIndex;
    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("IsLimitedJob")
    private Integer isLimitedJob;
    @JsonProperty("ItemSoulCrystal")
    private ItemSoulCrystal itemSoulCrystal;
    @JsonProperty("ItemSoulCrystalTarget")
    private String itemSoulCrystalTarget;
    @JsonProperty("ItemSoulCrystalTargetID")
    private Integer itemSoulCrystalTargetID;
    // FIXME 类型不确定
    @JsonProperty("ItemStartingWeapon")
    private Object itemStartingWeapon;
    @JsonProperty("ItemStartingWeaponTarget")
    private String itemStartingWeaponTarget;
    @JsonProperty("ItemStartingWeaponTargetID")
    private Integer itemStartingWeaponTargetID;
    @JsonProperty("JobIndex")
    private Integer jobIndex;
    // FIXME 类型不确定
    @JsonProperty("LimitBreak1")
    private Object limitBreak1;
    @JsonProperty("LimitBreak1Target")
    private String limitBreak1Target;
    @JsonProperty("LimitBreak1TargetID")
    private Integer limitBreak1TargetID;
    // FIXME 类型不确定
    @JsonProperty("LimitBreak2")
    private Object limitBreak2;
    @JsonProperty("LimitBreak2Target")
    private String limitBreak2Target;
    @JsonProperty("LimitBreak2TargetID")
    private Integer limitBreak2TargetID;
    // FIXME 类型不确定
    @JsonProperty("LimitBreak3")
    private Object limitBreak3;
    @JsonProperty("LimitBreak3Target")
    private String limitBreak3Target;
    @JsonProperty("LimitBreak3TargetID")
    private Integer limitBreak3TargetID;
    @JsonProperty("ModifierDexterity")
    private Integer modifierDexterity;
    @JsonProperty("ModifierHitPoints")
    private Integer modifierHitPoints;
    @JsonProperty("ModifierIntelligence")
    private Integer modifierIntelligence;
    @JsonProperty("ModifierManaPoints")
    private Integer modifierManaPoints;
    @JsonProperty("ModifierMind")
    private Integer modifierMind;
    @JsonProperty("ModifierPiety")
    private Integer modifierPiety;
    @JsonProperty("ModifierStrength")
    private Integer modifierStrength;
    @JsonProperty("ModifierVitality")
    private Integer modifierVitality;
    // FIXME 类型不确定
    @JsonProperty("MonsterNote")
    private Object monsterNote;
    @JsonProperty("MonsterNoteTarget")
    private String monsterNoteTarget;
    @JsonProperty("MonsterNoteTargetID")
    private Integer monsterNoteTargetID;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("NameEnglish")
    private String nameEnglish;
    @JsonProperty("NameEnglish_de")
    private String nameEnglishDe;
    @JsonProperty("NameEnglish_en")
    private String nameEnglishEn;
    @JsonProperty("NameEnglish_fr")
    private String nameEnglishFr;
    @JsonProperty("NameEnglish_ja")
    private String nameEnglishJa;
    @JsonProperty("Name_de")
    private String nameDe;
    @JsonProperty("Name_en")
    private String nameEn;
    @JsonProperty("Name_fr")
    private String nameFr;
    @JsonProperty("Name_ja")
    private String nameJa;
    @JsonProperty("PartyBonus")
    private Integer partyBonus;
    // FIXME 类型不确定
    @JsonProperty("Prerequisite")
    private Object prerequisite;
    @JsonProperty("PrerequisiteTarget")
    private String prerequisiteTarget;
    @JsonProperty("PrerequisiteTargetID")
    private Integer prerequisiteTargetID;
    @JsonProperty("PrimaryStat")
    private Integer primaryStat;
    @JsonProperty("PvPActionSortRow")
    private Integer pvPActionSortRow;
    // FIXME 类型不确定
    @JsonProperty("RelicQuest")
    private Object relicQuest;
    @JsonProperty("RelicQuestTarget")
    private String relicQuestTarget;
    @JsonProperty("RelicQuestTargetID")
    private Integer relicQuestTargetID;
    @JsonProperty("Role")
    private Integer role;
    @JsonProperty("StartingLevel")
    private Integer startingLevel;
    // FIXME 类型不确定
    @JsonProperty("StartingTown")
    private Object startingTown;
    @JsonProperty("StartingTownTarget")
    private String startingTownTarget;
    @JsonProperty("StartingTownTargetID")
    private Integer startingTownTargetID;
    @JsonProperty("UIPriority")
    private Integer uipriority;
    // FIXME 类型不确定
    @JsonProperty("UnlockQuest")
    private Object unlockQuest;
    @JsonProperty("UnlockQuestTarget")
    private String unlockQuestTarget;
    @JsonProperty("UnlockQuestTargetID")
    private Integer unlockQuestTargetID;
}