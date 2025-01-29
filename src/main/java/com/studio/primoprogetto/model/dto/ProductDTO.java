package com.studio.primoprogetto.model.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private String id;
    private String nome;
    private String categoria;
    private String iva;
    private String unitaMisura;
    private double prezzoUnitario;
    private String descrizione;
}
