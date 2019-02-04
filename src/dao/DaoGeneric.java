/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author italo
 */
public class DaoGeneric {

    public boolean cadastrar(Object object) {
        ConexaoBanco.getBanco().store(object);
        ConexaoBanco.getBanco().commit();
        return true;
    }

    public ArrayList searchAll(Class clazz) {
        return new ArrayList(ConexaoBanco.getBanco().query(clazz));
    }
}
