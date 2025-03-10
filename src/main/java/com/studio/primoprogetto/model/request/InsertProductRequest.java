package com.studio.primoprogetto.model.request;

import lombok.Data;

@Data
public class InsertProductRequest {
    private String nome;
    private String unitaMisura;
    private String categoria;
    private String iva;
    private double prezzoUnitario;
    private String descrizione;
}
