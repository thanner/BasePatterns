/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.plugin;

import br.edu.ifes.sr.les.basepatterns.separatedinterface.modelo.Usuario;
import br.edu.ifes.sr.les.basepatterns.separatedinterface.modelo.UsuarioDAO;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Thanner Soares Silva <thannersoares@gmail.com>
 */
public class UsuarioDAOImplArquivo implements UsuarioDAO {

    public void insert(Usuario u) throws IOException {
        File arquivo = new File("/home/jadson/temp/Usuario.txt");
        FileWriter writer = new FileWriter(arquivo, true);
        PrintWriter saida = new PrintWriter(writer);
        saida.println("<<" + u.getClass().getSimpleName() + ">>");
        saida.println(u.getLogin() + " - " + u.getSenha());
        saida.close();
    }

}
