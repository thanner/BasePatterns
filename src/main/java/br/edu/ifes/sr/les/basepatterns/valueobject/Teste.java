/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.valueobject;

/**
 *
 * @author T
 */
public class Teste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setAno("1990");
        carro1.setCor("azul");
        Carro carro2 = new Carro(carro1);
        System.out.println(carro1.equals(carro2));
    }
}
