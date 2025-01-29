package com.studio.primoprogetto.converter;

import com.studio.primoprogetto.model.dto.ProductDTO;
import com.studio.primoprogetto.model.persistence.ProductPO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DTOConverter {

    public ProductPO convertDtoToPo(ProductDTO productDTO){
        ProductPO result = new ProductPO();

        result.setId(productDTO.getId());
        result.setNome(productDTO.getNome());
        result.setCategoria(productDTO.getCategoria());
        result.setIva(productDTO.getIva());
        result.setUnitaMisura(productDTO.getUnitaMisura());
        result.setPrezzoUnitario(productDTO.getPrezzoUnitario());
        result.setDescrizione(productDTO.getDescrizione());

        return result;
    }
}
