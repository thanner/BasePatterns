/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.separatedinterface.dao;

import br.edu.ifes.sr.les.basepatterns.separatedinterface.modelo.UsuarioDAO;
import br.edu.ifes.sr.les.basepatterns.separatedinterface.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Thanner Soares Silva <thannersoares@gmail.com>
 */
public class UsuarioDAOImpl implements UsuarioDAO {

    private Connection con;

    public void setConnection(Connection con) {
        this.con = con;
    }

    public void insert(Usuario u) throws SQLException {
        PreparedStatement st = con.prepareStatement("INSERT INTO USUARIO (login, senha) values (?, ?)");
        st.setString(1, u.getLogin());
        st.setString(2, u.getSenha());
        st.executeUpdate();
        st.close();
    }
}
