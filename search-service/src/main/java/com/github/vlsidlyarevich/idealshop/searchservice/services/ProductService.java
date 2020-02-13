package com.github.vlsidlyarevich.idealshop.searchservice.services;

import com.github.vlsidlyarevich.idealshop.searchservice.clients.ProductClient;
import com.github.vlsidlyarevich.idealshop.searchservice.clients.dto.ProductAmount;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProductService {

    final ProductClient client;

    public ProductAmount getAmount() {
        return client.getAmount();
    }
}
