package com.studio.primoprogetto.repository;

import com.studio.primoprogetto.model.persistence.ProductPO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class ProductRepository {

    List<ProductPO> fakeDb = new ArrayList<>();

    public void addNewProduct(ProductPO productPO) {
        log.info("--- addNewProduct start with -> {}", productPO);
        fakeDb.add(productPO);
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

    public List<ProductPO>  getProducts() {
        log.info("--- getProduct start with -> {}");

        log.info("--- getProduct END");

        return fakeDb;
    }
}
