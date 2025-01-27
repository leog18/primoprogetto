package com.studio.primoprogetto.service;

import com.studio.primoprogetto.repository.ProdottoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdottoService {

    @Autowired
    private ProdottoRepository prodottoRepository;

    public void peppe(){
        prodottoRepository.peppe2();
    }
}
