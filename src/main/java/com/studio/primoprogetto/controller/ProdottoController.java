package com.studio.primoprogetto.controller;

import com.studio.primoprogetto.model.dto.ProdottoDTO;
import com.studio.primoprogetto.model.request.*;
import com.studio.primoprogetto.service.ProdottoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class ProdottoController {

    @Autowired
    private ProdottoService prodottoService;

    @PostMapping("/product")
    public ResponseEntity<Object> addNewProduct(@RequestBody InsertProductRequest insertProductRequest){
        log.info("- addNewProduct start with -> {}", insertProductRequest);

        prodottoService.addNewProduct(new ProdottoDTO());

        log.info("- addNewProduct end");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/product")
    public ResponseEntity<Object> getProduct(String productId){
        log.info("- getProduct start with -> {}", productId);

        prodottoService.getProduct(new ProdottoDTO());

        log.info("- getProduct end");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/product")
    public ResponseEntity<Object> updateProduct(UpdateProductRequest updateProductRequest){
        log.info("- putProduct start with -> {}", updateProductRequest);

        prodottoService.updateProduct(new ProdottoDTO());

        log.info("- putProduct end");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/product")
        public ResponseEntity<Object> deleteProduct(String productId) {
        log.info("- deleteProduct start with -> {}", productId);

        prodottoService.deleteProduct(new ProdottoDTO());

        log.info("- deleteProduct end");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}

