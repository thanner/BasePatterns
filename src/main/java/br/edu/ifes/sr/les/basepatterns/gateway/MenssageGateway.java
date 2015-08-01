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
public class MenssageGateway {

    protected static final String CONFIRMACAO = "CNFRM";
    private MenssageSender sender = new MenssageSender();

    public void sendConfirmacao(String orderID, int amount,
            String symbol) {
        Object[] args = new Object[]{orderID, new Integer(amount),
            symbol};
        send(CONFIRMACAO, args);
    }

    private void send(String msg, Object[] args) {
        int returnCode = doSend(msg, args);
        if (returnCode == MenssageSender.PARAMETRO_NULO) {
            throw new NullPointerException("Parametro null: " + msg);
        }
        if (returnCode == MenssageSender.TIPO_MENSAGEM_DESCONHECIDA) {
            throw new IllegalStateException(
                    "Inesperado erro do sistema de mensagem #:" + returnCode);
        }
        if (returnCode == MenssageSender.SUCESSO) {
            System.out.println("Sucesso");
        }
    }

    protected int doSend(String msg, Object[] args) {
        assert (msg != null);
        return sender.send(msg, args);
    }
}
