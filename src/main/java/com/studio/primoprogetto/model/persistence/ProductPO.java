package com.studio.primoprogetto.model.persistence;

import lombok.Data;

@Data
public class ProductPO {
    private String id;
    private String nome;
    private String categoria;
    private String iva;
    private String unitaMisura;
    private double prezzoUnitario;
    private String descrizione;
}
