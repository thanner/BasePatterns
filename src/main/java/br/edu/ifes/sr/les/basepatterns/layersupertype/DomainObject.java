/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.sr.les.basepatterns.layersupertype;

/**
 *
 * @author Thanner Soares Silva <thannersoares@gmail.com>
 */
public class DomainObject {

    private Long ID;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        // assert.notNull("Cannot set a null ID", ID);
        this.ID = ID;
    }

    public DomainObject(Long ID) {
        this.ID = ID;
    }

    public DomainObject() {

    }
}
