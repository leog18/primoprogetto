package com.studio.primoprogetto.controller;

import com.studio.primoprogetto.model.request.NewProductRequest;
import com.studio.primoprogetto.service.ProdottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdottoController {

    @Autowired
    private ProdottoService prodottoService;

    @PostMapping("/product")
    public ResponseEntity<Object> addNewProduct(@RequestBody NewProductRequest newProductRequest){

        prodottoService.peppe();

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
