package cn.ruihusoft.xviapi.pojo.action;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ActionTimelineHit {

    @JsonProperty("ActionTimelineIDMode")
    private Integer actionTimelineIDMode;
    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("IsLoop")
    private Integer isLoop;
    @JsonProperty("IsMotionCanceledByMoving")
    private Integer isMotionCanceledByMoving;
    @JsonProperty("Key")
    private String key;
    @JsonProperty("Key_en")
    private String keyEn;
    @JsonProperty("KillUpper")
    private Integer killUpper;
    @JsonProperty("LoadType")
    private Integer loadType;
    @JsonProperty("LookAtMode")
    private Integer lookAtMode;
    @JsonProperty("Pause")
    private Integer pause;
    @JsonProperty("Priority")
    private Integer priority;
    @JsonProperty("Resident")
    private Integer resident;
    @JsonProperty("ResidentPap")
    private Integer residentPap;
    @JsonProperty("Slot")
    private Integer slot;
    @JsonProperty("Stance")
    private Integer stance;
    @JsonProperty("StartAttach")
    private Integer startAttach;
    @JsonProperty("Type")
    private Integer type;
    @JsonProperty("WeaponTimeline")
    private Object weaponTimeline;
    // FIXME 类型不确定：WeaponTimeline
    @JsonProperty("WeaponTimelineTarget")
    private String weaponTimelineTarget;
    @JsonProperty("WeaponTimelineTargetID")
    private Integer weaponTimelineTargetID;
}