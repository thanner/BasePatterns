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
public class PersonFinderStub {

    public Person find(long id) {
        if (id == 1) {
            return new Person("Soares", "Thanner", 10);
        }
        throw new IllegalArgumentException("Con't find id: " + String.valueOf(id));
    }
}
