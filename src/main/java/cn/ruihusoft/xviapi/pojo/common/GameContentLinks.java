package cn.ruihusoft.xviapi.pojo.common;

import cn.ruihusoft.xviapi.pojo.action.PvPActionSort;
import cn.ruihusoft.xviapi.pojo.quest.Quest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GameContentLinks {

    @JsonProperty("PvPActionSort")
    private PvPActionSort pvPActionSort;
    @JsonProperty("Quest")
    private Quest quest;
}