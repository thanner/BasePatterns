/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.valueobject;

import java.util.Objects;

/**
 *
 * @author T
 */
public class Carro {
    private String cor;
    private String ano;

    Carro(Carro carro) {
        this.cor = carro.getCor();
        this.ano = carro.getAno();
    }

    Carro() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.cor);
        hash = 67 * hash + Objects.hashCode(this.ano);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
    
    
}
