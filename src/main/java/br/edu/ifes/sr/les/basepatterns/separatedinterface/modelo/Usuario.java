/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.separatedinterface.modelo;

import br.edu.ifes.sr.les.basepatterns.separatedinterface.dao.UsuarioDAOImpl;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Thanner Soares Silva <thannersoares@gmail.com>
 */
public class Usuario {

    private String login;
    private String senha;

    public void insereUsuario() throws SQLException, IOException {
        if (login != null && senha != null) {
            UsuarioDAO dao = new UsuarioDAOImpl();
            dao.insert(this);
        }
    }

    public void insereUsuarioComPlugin() throws SQLException, IOException {
        if (login != null && senha != null) {
            UsuarioDAO.INSTANCIA.insert(this);
        }
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
    
    
}
