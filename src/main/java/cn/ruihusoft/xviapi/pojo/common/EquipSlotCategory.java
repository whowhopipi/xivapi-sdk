package cn.ruihusoft.xviapi.pojo.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EquipSlotCategory {

    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("Body")
    private Integer body;
    @JsonProperty("Ears")
    private Integer ears;
    @JsonProperty("Feet")
    private Integer feet;
    @JsonProperty("FingerL")
    private Integer fingerL;
    @JsonProperty("FingerR")
    private Integer fingerR;
    @JsonProperty("Gloves")
    private Integer gloves;
    @JsonProperty("Head")
    private Integer head;
    @JsonProperty("Legs")
    private Integer legs;
    @JsonProperty("MainHand")
    private Integer mainHand;
    @JsonProperty("Neck")
    private Integer neck;
    @JsonProperty("OffHand")
    private Integer offHand;
    @JsonProperty("SoulCrystal")
    private Integer soulCrystal;
    @JsonProperty("Waist")
    private Integer waist;
    @JsonProperty("Wrists")
    private Integer wrists;
}
