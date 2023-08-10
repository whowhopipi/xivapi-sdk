package cn.ruihusoft.xviapi.pojo.classjob;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClassJobUse {

    @JsonProperty("Abbreviation")
    private String Abbreviation;
    @JsonProperty("Abbreviation_De")
    private String abbreviationDe;
    @JsonProperty("Abbreviation_En")
    private String abbreviationEn;
    @JsonProperty("Abbreviation_Fr")
    private String abbreviationFr;
    @JsonProperty("Abbreviation_Ja")
    private String abbreviationJa;
    @JsonProperty("BattleClassIndex")
    private String battleClassIndex;
    @JsonProperty("CanQueueForDuty")
    private Integer canQueueForDuty;
    @JsonProperty("ClassJobCategory")
    private Integer classJobCategory;
    @JsonProperty("ClassJobParent")
    private Integer classJobParent;
    @JsonProperty("DohDolJobIndex")
    private Integer dohDolJobIndex;
    @JsonProperty("expArrayIndex")
    private Integer ExpArrayIndex;
    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("IsLimitedJob")
    private Integer isLimitedJob;
    @JsonProperty("ItemSoulCrystal")
    private Integer itemSoulCrystal;
    @JsonProperty("ItemStartingWeapon")
    private Integer itemStartingWeapon;
    @JsonProperty("JobIndex")
    private Integer jobIndex;
    @JsonProperty("LimitBreak1")
    private Integer limitBreak1;
    @JsonProperty("LimitBreak2")
    private Integer limitBreak2;
    @JsonProperty("LimitBreak3")
    private Integer limitBreak3;
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
    @JsonProperty("MonsterNote")
    private Integer monsterNote;
    @JsonProperty("name")
    private String Name;
    @JsonProperty("NameEnglish")
    private String nameEnglish;
    @JsonProperty("NameEnglish_De")
    private String nameEnglishDe;
    @JsonProperty("NameEnglish_En")
    private String nameEnglishEn;
    @JsonProperty("NameEnglish_Fr")
    private String nameEnglishFr;
    @JsonProperty("NameEnglish_Ja")
    private String nameEnglishJa;
    @JsonProperty("Name_De")
    private String nameDe;
    @JsonProperty("Name_En")
    private String nameEn;
    @JsonProperty("Name_Fr")
    private String nameFr;
    @JsonProperty("Name_Ja")
    private String nameJa;
    @JsonProperty("PartyBonus")
    private Integer partyBonus;
    @JsonProperty("Prerequisite")
    private Integer prerequisite;
    @JsonProperty("PrimaryStat")
    private Integer primaryStat;
    @JsonProperty("PvPActionSortRow")
    private Integer pvPActionSortRow;
    @JsonProperty("RelicQuest")
    private Integer relicQuest;
    @JsonProperty("Role")
    private Integer role;
    @JsonProperty("StartingLevel")
    private Integer startingLevel;
    @JsonProperty("StartingTown")
    private Integer startingTown;
    @JsonProperty("UIPriority")
    private Integer uiPriority;
    @JsonProperty("unlockQuest")
    private Integer UnlockQuest;

}

