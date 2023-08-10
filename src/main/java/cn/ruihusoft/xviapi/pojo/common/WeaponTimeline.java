package cn.ruihusoft.xviapi.pojo.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeaponTimeline {

    @JsonProperty("File")
    private String file;
    @JsonProperty("File_en")
    private String fileEn;
    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("NextWeaponTimeline")
    private String nextWeaponTimeline;
}