package com.studio.primoprogetto.converter;

import com.studio.primoprogetto.model.dto.ProductDTO;
import com.studio.primoprogetto.model.request.InsertProductRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RequestConverter {

    int counter = 0;

    public ProductDTO convertInsertRequestToDto(InsertProductRequest insertProductRequest){
        ProductDTO result = new ProductDTO();

        result.setId(String.valueOf(counter ++));
        result.setNome(insertProductRequest.getNome());
        result.setCategoria(insertProductRequest.getCategoria());
        result.setIva(insertProductRequest.getIva());
        result.setUnitaMisura(insertProductRequest.getUnitaMisura());
        result.setPrezzoUnitario(insertProductRequest.getPrezzoUnitario());
        result.setDescrizione(insertProductRequest.getDescrizione());

        return result;
    }
}
