/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import modelo.Chave;

/**
 *
 * @author italo
 */
public class DaoChave extends DaoGeneric {

    public Chave getChaveByCodeBar(String codeBar){
        Query q = ConexaoBanco.getBanco().query();
        q.constrain(Chave.class);
        q.descend("codigoDeBarras").constrain(codeBar).equal();
        
        return (Chave) q.execute().next();
    }
    
    public boolean exist(Chave chave){
        Query q = ConexaoBanco.getBanco().query();
        q.descend("nome").constrain(chave.getNome()).like();
        return q.execute().hasNext();
    }
    
    public ObjectSet listarTudo(Chave chave){
        return ConexaoBanco.getBanco().queryByExample(chave);
    }
    
}
