/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.specialcase;

/**
 *
 * @author T
 */
public class Teste {

    public static void main(String[] args) {
        Employee employee = new NullEmployee();
        System.out.println(employee.getName());
    }
}
