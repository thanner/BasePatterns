/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.registryestub;

import br.edu.ifes.sr.les.basepatterns.registryestub.PersonFinderStub;
import br.edu.ifes.sr.les.basepatterns.registryestub.Registry;

/**
 *
 * @author Thanner Soares Silva <thannersoares@gmail.com>
 */
public class RegistryStub extends Registry {

    public RegistryStub() {
        personFinderStub = new PersonFinderStub();
    }
}
