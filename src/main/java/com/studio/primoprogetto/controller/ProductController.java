package com.studio.primoprogetto.controller;

import com.studio.primoprogetto.converter.RequestConverter;
import com.studio.primoprogetto.model.dto.ProductDTO;
import com.studio.primoprogetto.model.persistence.ProductPO;
import com.studio.primoprogetto.model.request.*;
import com.studio.primoprogetto.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private RequestConverter requestConverter;

    @GetMapping("/products")
    public ResponseEntity<Object> getProducts(){
        log.info("- getProduct start with -> {}");

        List<ProductPO> productPOList = productService.getProducts();

        log.info("- getProduct end");
        return new ResponseEntity<>(productPOList,HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<Object> addNewProduct(@RequestBody InsertProductRequest insertProductRequest){
        log.info("- addNewProduct start with -> {}", insertProductRequest);

        ProductDTO productDTO = requestConverter.convertInsertRequestToDto(insertProductRequest);
        productService.addNewProduct(productDTO);

        log.info("- addNewProduct end");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/product")
    public ResponseEntity<Object> getProduct(String productId){
        log.info("- getProduct start with -> {}", productId);

        productService.getProduct(new ProductDTO());

        log.info("- getProduct end");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/product")
    public ResponseEntity<Object> updateProduct(UpdateProductRequest updateProductRequest){
        log.info("- putProduct start with -> {}", updateProductRequest);

        productService.updateProduct(new ProductDTO());

        log.info("- putProduct end");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/product")
        public ResponseEntity<Object> deleteProduct(String productId) {
        log.info("- deleteProduct start with -> {}", productId);

        productService.deleteProduct(new ProductDTO());

        log.info("- deleteProduct end");
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

