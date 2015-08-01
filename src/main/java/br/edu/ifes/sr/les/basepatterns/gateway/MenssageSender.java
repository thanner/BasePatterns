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
public class MenssageSender {

    public final static int PARAMETRO_NULO = -1;
    public final static int TIPO_MENSAGEM_DESCONHECIDA = -2;
    public final static int SUCESSO = 0;

    public int send(String msg, Object[] args) {
        return 0;
    }

}
