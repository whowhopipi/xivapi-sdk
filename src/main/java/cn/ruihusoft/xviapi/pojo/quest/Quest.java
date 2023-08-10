package cn.ruihusoft.xviapi.pojo.quest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Quest {

    @JsonProperty("SystemReward1")
    private List<Integer> systemReward1;
}