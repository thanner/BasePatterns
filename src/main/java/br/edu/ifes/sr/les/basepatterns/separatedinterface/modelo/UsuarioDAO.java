/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.separatedinterface.modelo;

import br.edu.ifes.sr.les.basepatterns.plugin.PluginFactory;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Thanner Soares Silva <thannersoares@gmail.com>
 */
public interface UsuarioDAO {

    public static final UsuarioDAO INSTANCIA
            = (UsuarioDAO) PluginFactory.getPlugin(UsuarioDAO.class);

    public void insert(Usuario u) throws SQLException, IOException;
}
