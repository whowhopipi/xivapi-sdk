package cn.ruihusoft.xviapi.pojo.item;

import cn.ruihusoft.xviapi.pojo.classjob.ClassJobCategory;
import cn.ruihusoft.xviapi.pojo.classjob.ClassJobRepair;
import cn.ruihusoft.xviapi.pojo.classjob.ClassJobUse;
import cn.ruihusoft.xviapi.pojo.common.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Item {

    @JsonProperty("AdditionalData")
    private Integer additionalData;
    @JsonProperty("Adjective")
    private Integer adjective;
    @JsonProperty("AetherialReduce")
    private Integer aetherialReduce;
    @JsonProperty("AlwaysCollectable")
    private Integer alwaysCollectable;
    @JsonProperty("Article")
    private Integer article;
    @JsonProperty("BaseParam0")
    private BaseParam baseParam0;
    @JsonProperty("BaseParam0Target")
    private String baseParam0Target;
    @JsonProperty("BaseParam0TargetID")
    private Integer baseParam0TargetID;
    @JsonProperty("BaseParam1")
    private BaseParam baseParam1;
    @JsonProperty("BaseParam1Target")
    private String baseParam1Target;
    @JsonProperty("BaseParam1TargetID")
    private Integer baseParam1TargetID;
    @JsonProperty("BaseParam2")
    private BaseParam baseParam2;
    @JsonProperty("BaseParam2Target")
    private String baseParam2Target;
    @JsonProperty("BaseParam2TargetID")
    private Integer baseParam2TargetID;
    @JsonProperty("BaseParam3")
    private BaseParam baseParam3;
    @JsonProperty("BaseParam3Target")
    private String baseParam3Target;
    @JsonProperty("BaseParam3TargetID")
    private Integer baseParam3TargetID;
    @JsonProperty("BaseParam4")
    private BaseParam baseParam4;
    @JsonProperty("BaseParam4Target")
    private String baseParam4Target;
    @JsonProperty("BaseParam4TargetID")
    private Integer baseParam4TargetID;
    @JsonProperty("BaseParam5")
    private BaseParam baseParam5;
    @JsonProperty("BaseParam5Target")
    private String baseParam5Target;
    @JsonProperty("BaseParam5TargetID")
    private Integer baseParam5TargetID;
    @JsonProperty("BaseParamModifier")
    private Integer baseParamModifier;
    @JsonProperty("BaseParamSpecial0")
    private BaseParam baseParamSpecial0;
    @JsonProperty("BaseParamSpecial0Target")
    private String baseParamSpecial0Target;
    @JsonProperty("BaseParamSpecial0TargetID")
    private Integer baseParamSpecial0TargetID;
    @JsonProperty("BaseParamSpecial1")
    private BaseParam baseParamSpecial1;
    @JsonProperty("BaseParamSpecial1Target")
    private String baseParamSpecial1Target;
    @JsonProperty("BaseParamSpecial1TargetID")
    private Integer baseParamSpecial1TargetID;
    @JsonProperty("BaseParamSpecial2")
    private BaseParam baseParamSpecial2;
    @JsonProperty("BaseParamSpecial2Target")
    private String baseParamSpecial2Target;
    @JsonProperty("BaseParamSpecial2TargetID")
    private Integer baseParamSpecial2TargetID;
    @JsonProperty("BaseParamSpecial3")
    private BaseParam baseParamSpecial3;
    @JsonProperty("BaseParamSpecial3Target")
    private String baseParamSpecial3Target;
    @JsonProperty("BaseParamSpecial3TargetID")
    private Integer baseParamSpecial3TargetID;
    @JsonProperty("BaseParamSpecial4")
    private BaseParam baseParamSpecial4;
    @JsonProperty("BaseParamSpecial4Target")
    private String baseParamSpecial4Target;
    @JsonProperty("BaseParamSpecial4TargetID")
    private Integer baseParamSpecial4TargetID;
    @JsonProperty("BaseParamSpecial5")
    private BaseParam baseParamSpecial5;
    @JsonProperty("BaseParamSpecial5Target")
    private String baseParamSpecial5Target;
    @JsonProperty("BaseParamSpecial5TargetID")
    private Integer baseParamSpecial5TargetID;
    @JsonProperty("BaseParamValue0")
    private Integer baseParamValue0;
    @JsonProperty("BaseParamValue1")
    private Integer baseParamValue1;
    @JsonProperty("BaseParamValue2")
    private Integer baseParamValue2;
    @JsonProperty("BaseParamValue3")
    private Integer baseParamValue3;
    @JsonProperty("BaseParamValue4")
    private Integer baseParamValue4;
    @JsonProperty("BaseParamValue5")
    private Integer baseParamValue5;
    @JsonProperty("BaseParamValueSpecial0")
    private Integer baseParamValueSpecial0;
    @JsonProperty("BaseParamValueSpecial1")
    private Integer baseParamValueSpecial1;
    @JsonProperty("BaseParamValueSpecial2")
    private Integer baseParamValueSpecial2;
    @JsonProperty("BaseParamValueSpecial3")
    private Integer baseParamValueSpecial3;
    @JsonProperty("BaseParamValueSpecial4")
    private Integer baseParamValueSpecial4;
    @JsonProperty("BaseParamValueSpecial5")
    private Integer baseParamValueSpecial5;
    @JsonProperty("Block")
    private Integer block;
    @JsonProperty("BlockRate")
    private Integer blockRate;
    @JsonProperty("CanBeHq")
    private Integer canBeHq;
    @JsonProperty("CastTimeS")
    private Integer castTimeS;
    @JsonProperty("ClassJobCategory")
    private ClassJobCategory classJobCategory;
    @JsonProperty("ClassJobCategoryTarget")
    private String classJobCategoryTarget;
    @JsonProperty("ClassJobCategoryTargetID")
    private Integer classJobCategoryTargetID;
    @JsonProperty("ClassJobRepair")
    private ClassJobRepair classJobRepair;
    @JsonProperty("ClassJobRepairTarget")
    private String classJobRepairTarget;
    @JsonProperty("ClassJobRepairTargetID")
    private Integer classJobRepairTargetID;
    @JsonProperty("ClassJobUse")
    private ClassJobUse classJobUse;
    @JsonProperty("ClassJobUseTarget")
    private String classJobUseTarget;
    @JsonProperty("ClassJobUseTargetID")
    private Integer classJobUseTargetID;
    @JsonProperty("CooldownS")
    private Integer cooldownS;
    @JsonProperty("DamageMag")
    private Integer damageMag;
    @JsonProperty("DamagePhys")
    private Integer damagePhys;
    @JsonProperty("DefenseMag")
    private Integer defenseMag;
    @JsonProperty("DefensePhys")
    private Integer defensePhys;
    @JsonProperty("DelayMs")
    private Integer delayMs;
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
    @JsonProperty("Desynth")
    private Integer desynth;
    @JsonProperty("EquipRestriction")
    private Integer equipRestriction;
    @JsonProperty("EquipSlotCategory")
    private EquipSlotCategory equipSlotCategory;
    @JsonProperty("EquipSlotCategoryTarget")
    private String equipSlotCategoryTarget;
    @JsonProperty("EquipSlotCategoryTargetID")
    private Integer equipSlotCategoryTargetID;
    @JsonProperty("FilterGroup")
    private Integer filterGroup;
    // FIXME 类型不确定
    @JsonProperty("GrandCompany")
    private Object grandCompany;
    @JsonProperty("GrandCompanyTarget")
    private String grandCompanyTarget;
    @JsonProperty("GrandCompanyTargetID")
    private Integer grandCompanyTargetID;
    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("Icon")
    private String icon;
    @JsonProperty("IconHD")
    private String iconHD;
    @JsonProperty("IconID")
    private Integer iconID;
    @JsonProperty("IsAdvancedMeldingPermitted")
    private Integer isAdvancedMeldingPermitted;
    @JsonProperty("IsCollectable")
    private Integer isCollectable;
    @JsonProperty("IsCrestWorthy")
    private Integer isCrestWorthy;
    @JsonProperty("IsDyeable")
    private Integer isDyeable;
    @JsonProperty("IsGlamourous")
    private Integer isGlamourous;
    @JsonProperty("IsIndisposable")
    private Integer isIndisposable;
    @JsonProperty("IsPvP")
    private Integer isPvP;
    @JsonProperty("IsUnique")
    private Integer isUnique;
    @JsonProperty("IsUntradable")
    private Integer isUntradable;
    // FIXME 类型不确定
    @JsonProperty("ItemAction")
    private Object itemAction;
    @JsonProperty("ItemActionTarget")
    private String itemActionTarget;
    @JsonProperty("ItemActionTargetID")
    private Integer itemActionTargetID;
    // FIXME 类型不确定
    @JsonProperty("ItemGlamour")
    private Object itemGlamour;
    @JsonProperty("ItemGlamourTarget")
    private String itemGlamourTarget;
    @JsonProperty("ItemGlamourTargetID")
    private Integer itemGlamourTargetID;
    @JsonProperty("ItemRepair")
    private ItemRepair itemRepair;
    @JsonProperty("ItemRepairTarget")
    private String itemRepairTarget;
    @JsonProperty("ItemRepairTargetID")
    private Integer itemRepairTargetID;
    @JsonProperty("ItemSearchCategory")
    private ItemSearchCategory itemSearchCategory;
    @JsonProperty("ItemSearchCategoryTarget")
    private String itemSearchCategoryTarget;
    @JsonProperty("ItemSearchCategoryTargetID")
    private Integer itemSearchCategoryTargetID;
    // FIXME 类型不确定
    @JsonProperty("ItemSeries")
    private Object itemSeries;
    @JsonProperty("ItemSeriesTarget")
    private String itemSeriesTarget;
    @JsonProperty("ItemSeriesTargetID")
    private Integer itemSeriesTargetID;
    @JsonProperty("ItemSortCategory")
    private ItemSortCategory itemSortCategory;
    @JsonProperty("ItemSortCategoryTarget")
    private String itemSortCategoryTarget;
    @JsonProperty("ItemSortCategoryTargetID")
    private Integer itemSortCategoryTargetID;
    @JsonProperty("ItemSpecialBonus")
    private ItemSpecialBonus itemSpecialBonus;
    @JsonProperty("ItemSpecialBonusParam")
    private Integer itemSpecialBonusParam;
    @JsonProperty("ItemSpecialBonusTarget")
    private String itemSpecialBonusTarget;
    @JsonProperty("ItemSpecialBonusTargetID")
    private Integer itemSpecialBonusTargetID;
    @JsonProperty("ItemUICategory")
    private ItemUICategory itemUICategory;
    @JsonProperty("ItemUICategoryTarget")
    private String itemUICategoryTarget;
    @JsonProperty("ItemUICategoryTargetID")
    private Integer itemUICategoryTargetID;
    @JsonProperty("LevelEquip")
    private Integer levelEquip;
    @JsonProperty("LevelItem")
    private Integer levelItem;
    @JsonProperty("Lot")
    private Integer lot;
    @JsonProperty("MateriaSlotCount")
    private Integer materiaSlotCount;
    @JsonProperty("MaterializeType")
    private Integer materializeType;
    @JsonProperty("ModelMain")
    private String modelMain;
    @JsonProperty("ModelSub")
    private String modelSub;
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
    @JsonProperty("Plural")
    private String plural;
    @JsonProperty("Plural_de")
    private String pluralDe;
    @JsonProperty("Plural_en")
    private String pluralEn;
    @JsonProperty("Plural_fr")
    private String pluralFr;
    @JsonProperty("Plural_ja")
    private String pluralJa;
    @JsonProperty("PossessivePronoun")
    private Integer possessivePronoun;
    @JsonProperty("PriceLow")
    private Integer priceLow;
    @JsonProperty("PriceMid")
    private Integer priceMid;
    @JsonProperty("Pronoun")
    private Integer pronoun;
    @JsonProperty("Rarity")
    private Integer rarity;
    @JsonProperty("Singular")
    private String singular;
    @JsonProperty("Singular_de")
    private String singularDe;
    @JsonProperty("Singular_en")
    private String singularEn;
    @JsonProperty("Singular_fr")
    private String singularFr;
    @JsonProperty("Singular_ja")
    private String singularJa;
    @JsonProperty("StackSize")
    private Integer stackSize;
    @JsonProperty("StartsWithVowel")
    private Integer startsWithVowel;
    @JsonProperty("SubStatCategory")
    private Integer subStatCategory;
}