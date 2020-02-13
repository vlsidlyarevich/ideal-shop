package com.github.vlsidlyarevich.idealshop.searchservice.web.rest.dto;

import com.github.vlsidlyarevich.idealshop.searchservice.domain.SearchResult;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SearchResponse {

    private String result;
    private long amount;

    public static SearchResponse fromDomain(SearchResult result) {
        if(result == null) return null;

        return new SearchResponse(result.getResult(), result.getAmount());
    }
}
