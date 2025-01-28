package com.studio.primoprogetto.service;

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

    public void addNewProduct(NewProductRequest newProductRequest) {
        log.info("Service - addNewProduct start with -> {}", newProductRequest);
        prodottoRepository.addNewProduct();
    }

    public void updateProduct(UpdateProductRequest updateProductRequest) {
        log.info("Service - updateProduct start with -> {}", updateProductRequest);
        prodottoRepository.updateProduct ();
    }

    public void getProduct(GetProductRequest GetProductRequest) {
        log.info("Service - getProduct start with -> {}", GetProductRequest);
        prodottoRepository.getProduct();
    }

    public void putProduct(PutProductRequest putProduct) {
        log.info("Service - putProduct start with -> {}", putProduct);
        prodottoRepository.putProduct();
    }

    public void deleteProduct(DeleteProductRequest deleteProduct) {
        log.info("Service - deleteProduct start with -> {}", deleteProduct);
        prodottoRepository.deleteProduct();
    }
}