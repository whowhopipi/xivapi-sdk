package cn.ruihusoft.xviapi.pojo.craft;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CraftAction {

    @JsonProperty("ALC")
    private List<Integer> alc;
}