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
public class Registry {

    private static Registry getInstance() {
        return soleInstance;
    }
    private static Registry soleInstance = new Registry();
    protected PersonFinderStub personFinderStub = new PersonFinderStub();

    public static PersonFinderStub personFinder() {
        return getInstance().personFinderStub;
    }

    public static void initialize() {
        soleInstance = new Registry();
    }

    public static void initializeStub() {
        soleInstance = new RegistryStub();
    }
}
