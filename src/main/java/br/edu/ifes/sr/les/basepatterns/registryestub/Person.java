/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.registryestub;

/**
 *
 * @author Thanner Soares Silva <thannersoares@gmail.com>
 */
public class Person {

    private String nome;
    private String sobrenome;
    private int i;

    Person(String sobrenome, String nome, int i) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.i = i;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

}
