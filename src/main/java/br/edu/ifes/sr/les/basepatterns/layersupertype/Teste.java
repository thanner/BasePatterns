/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.layersupertype;

/**
 *
 * @author Thanner Soares Silva <thannersoares@gmail.com>
 */
public class Teste {

    public static void main(String[] args) {
        DomainObject domainExample = new DomainExample(Long.valueOf("2"));
        System.out.println(domainExample.getClass());
    }
}
