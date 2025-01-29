package com.studio.primoprogetto.service;

import com.studio.primoprogetto.model.dto.ProductDTO;
import com.studio.primoprogetto.model.persistence.ProductPO;
import com.studio.primoprogetto.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addNewProduct(ProductDTO productDTO) {
        log.debug("-- addNewProduct start with -> {}", productDTO);

        productRepository.addNewProduct(new ProductPO());

        log.debug("-- addNewProduct END");
    }

    public void updateProduct(ProductDTO productDTO) {
        log.debug("-- updateProduct start with -> {}", productDTO);

        productRepository.updateProduct(new ProductPO());

        log.debug("-- updateProduct END");
    }

    public void getProduct(ProductDTO productDTO) {
        log.debug("-- getProduct start with -> {}", productDTO);

        productRepository.getProduct(new ProductPO());

        log.debug("-- getProduct END");
    }

    public void deleteProduct(ProductDTO productDTO) {
        log.debug("-- deleteProduct start with -> {}", productDTO);

        productRepository.deleteProduct(new ProductPO());

        log.debug("-- deleteProduct END");
    }
}