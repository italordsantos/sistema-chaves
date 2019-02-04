/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

/**
 *
 * @author italo
 */
public class ConexaoBanco {

    private static final ObjectContainer OBJECT_CONTAINER = Db4oEmbedded.openFile("database.batata");

    public static ObjectContainer getBanco() {
        return OBJECT_CONTAINER;
    }
    
}
