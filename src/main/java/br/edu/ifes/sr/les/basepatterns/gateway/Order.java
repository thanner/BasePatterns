/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.gateway;

/**
 *
 * @author Thanner Soares Silva <thannersoares@gmail.com>
 */
public class Order {

    private int valorTotal = 100;
    public static final String SIMBOLO = "R$";
    private String idOrder = "10";

    public void sendConfirmacao() {
        MenssageGateway msg = new MenssageGateway();
        msg.sendConfirmacao(idOrder, valorTotal, SIMBOLO);
    }

}
