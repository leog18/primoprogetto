package com.studio.primoprogetto.service;

import com.studio.primoprogetto.model.request.NewProductRequest;
import com.studio.primoprogetto.repository.ProdottoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProdottoService {

    @Autowired
    private ProdottoRepository prodottoRepository;

    public void addNewProduct(NewProductRequest newProductRequest){
        log.info("Service - addNewProduct start with -> {}",newProductRequest);
        prodottoRepository.peppe2();
    }
}
