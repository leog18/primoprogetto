package com.studio.primoprogetto.repository;

import com.studio.primoprogetto.model.persistence.ProductPO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class ProductRepository {

    public void addNewProduct(ProductPO productPO) {
        log.info("--- addNewProduct start with -> {}", productPO);

        log.info("--- addNewProduct END");
    }

    public void updateProduct(ProductPO productPO) {
        log.info("--- updateProduct start with -> {}", productPO);

        log.info("--- updateProduct END");
    }

    public void getProduct(ProductPO productPO) {
        log.info("--- getProduct start with -> {}", productPO);

        log.info("--- getProduct END");
    }

    public void deleteProduct(ProductPO productPO) {
        log.info("--- deleteProduct start with -> {}", productPO);

        log.info("--- deleteProduct END");
    }
}
