package cn.ruihusoft.xviapi.pojo.action;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PvPActionSort {

    @JsonProperty("Action")
    private List<String> action;
}