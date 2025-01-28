package com.studio.primoprogetto.service;

import com.studio.primoprogetto.model.dto.ProdottoDTO;
import com.studio.primoprogetto.model.persistence.ProdottoPO;
import com.studio.primoprogetto.model.request.*;
import com.studio.primoprogetto.repository.ProdottoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProdottoService {

    @Autowired
    private ProdottoRepository prodottoRepository;

    public void addNewProduct(ProdottoDTO prodottoDTO) {
        log.debug("-- addNewProduct start with -> {}", prodottoDTO);

        prodottoRepository.addNewProduct(new ProdottoPO());

        log.debug("-- addNewProduct END");
    }

    public void updateProduct(ProdottoDTO prodottoDTO) {
        log.debug("-- updateProduct start with -> {}", prodottoDTO);

        prodottoRepository.updateProduct(new ProdottoPO());

        log.debug("-- updateProduct END");
    }

    public void getProduct(ProdottoDTO prodottoDTO) {
        log.debug("-- getProduct start with -> {}", prodottoDTO);

        prodottoRepository.getProduct(new ProdottoPO());

        log.debug("-- getProduct END");
    }

    public void deleteProduct(ProdottoDTO prodottoDTO) {
        log.debug("-- deleteProduct start with -> {}", prodottoDTO);

        prodottoRepository.deleteProduct(new ProdottoPO());

        log.debug("-- deleteProduct END");
    }
}