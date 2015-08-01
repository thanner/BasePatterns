/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.money;

import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author T
 */
public class Teste {

    public static void main(String[] args) {

        Money money = new Money(20.00, Currency.getInstance(Locale.US));
        money = money.add(new Money(33.00, Currency.getInstance(Locale.US)));
        System.out.println(money.toString());
    }
}
