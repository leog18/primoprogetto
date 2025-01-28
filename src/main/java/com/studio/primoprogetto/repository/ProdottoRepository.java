package com.studio.primoprogetto.repository;

import com.studio.primoprogetto.model.persistence.ProdottoPO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class ProdottoRepository {

    public void addNewProduct(ProdottoPO prodottoPO) {
        log.info("--- addNewProduct start with -> {}", prodottoPO);

        log.info("--- addNewProduct END");
    }

    public void updateProduct(ProdottoPO prodottoPO) {
        log.info("--- updateProduct start with -> {}", prodottoPO);

        log.info("--- updateProduct END");
    }

    public void getProduct(ProdottoPO prodottoPO) {
        log.info("--- getProduct start with -> {}", prodottoPO);

        log.info("--- getProduct END");
    }

    public void deleteProduct(ProdottoPO prodottoPO) {
        log.info("--- deleteProduct start with -> {}", prodottoPO);

        log.info("--- deleteProduct END");
    }
}
