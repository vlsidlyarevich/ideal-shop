package com.github.vlsidlyarevich.idealshop.searchservice.web.rest.controllers;

import com.github.vlsidlyarevich.idealshop.searchservice.services.SearchService;
import com.github.vlsidlyarevich.idealshop.searchservice.web.rest.dto.SearchResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SearchController {

    private SearchService searchService;

    @PostMapping
    public ResponseEntity<SearchResponse> search() {
        final SearchResponse response = SearchResponse.fromDomain(searchService.search());

        return ResponseEntity.ok(response);
    }
}
