package com.studio.primoprogetto.controller;

import com.studio.primoprogetto.model.request.NewProductRequest;
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
    public ResponseEntity<Object> addNewProduct(@RequestBody NewProductRequest newProductRequest){
        log.info("Controller - addNewProduct start with -> {}",newProductRequest);

        newProductRequest.setNome("peppe");
        prodottoService.addNewProduct(newProductRequest);

        log.info("Controller - addNewProduct end");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping  ("/product")
    public ResponseEntity<Object> getProduct(){
        log.info("Controller - getProduct start with -> {}");
        log.info("Controller - getProduct end");
        return new ResponseEntity<>(HttpStatus.CREATED);@
    }
    @PutMapping  ("/product")
    public ResponseEntity<Object> putProduct(){
        log.info("Controller - putProduct start with -> {}");
        log.info("Controller - putProduct end");
        return new ResponseEntity<>(HttpStatus.CREATED);
}
@DeleteMapping  ("/product")
    public ResponseEntity<Object> deleteProduct(){
        log.info("Controller - deleteProduct start with -> {}");
        log.info("Controller - deleteProduct end");
        return new ResponseEntity<>(HttpStatus.CREATED);
