package com.github.vlsidlyarevich.idealshop.searchservice.services;

import com.github.vlsidlyarevich.idealshop.searchservice.domain.SearchResult;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SearchService {

    private final ProductService productService;

    public SearchResult search() {
        var amount = productService.getAmount();
        var result = doSomeLogic();
        result.setAmount(amount.getCount());

        return result;
    }

    private SearchResult doSomeLogic() {
        return new SearchResult();
    }
}
