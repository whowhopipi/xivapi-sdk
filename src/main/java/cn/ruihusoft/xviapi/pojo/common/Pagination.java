package cn.ruihusoft.xviapi.pojo.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Pagination {

    @JsonProperty("Page")
    private Integer	page;

    @JsonProperty("PageNext")
    private Integer	pageNext;

    @JsonProperty("PagePrev")
    private String	pagePrev;

    @JsonProperty("PageTotal")
    private Integer	pageTotal;

    @JsonProperty("Results")
    private Integer	results;

    @JsonProperty("ResultsPerPage")
    private Integer	resultsPerPage;

    @JsonProperty("ResultsTotal")
    private Integer	resultsTotal;

}
