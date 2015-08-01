/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.plugin;

import java.util.Properties;

/**
 *
 * @author Thanner Soares Silva <thannersoares@gmail.com>
 */
public class PluginFactory {

    private static Properties props = new Properties();

    static {
        try {
            props.load(PluginFactory.class.getResourceAsStream("/home/jadson/temp/plugins.properties"));
        } catch (Exception ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Object getPlugin(Class interfaceClass) {
        String implName = props.getProperty(interfaceClass.getName());
        if (implName == null) {
            throw new RuntimeException("Implemenatacao nao exite: "
                    + interfaceClass.getName());
        }
        try {
            return Class.forName(implName).newInstance();
        } catch (Exception ex) {
            throw new RuntimeException("Nao conseguiu criar uma "
                    + " nova instancia: "
                    + interfaceClass.getName());
        }
    }
}
