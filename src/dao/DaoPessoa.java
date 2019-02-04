/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.db4o.query.Query;
import modelo.Pessoa;

/**
 *
 * @author italo
 */
public class DaoPessoa extends DaoGeneric{
    
    public Pessoa getPessoaByCodeBar(String codeBar){
        Query q = ConexaoBanco.getBanco().query();
        q.constrain(Pessoa.class);
        q.descend("codigoDeBarras").constrain(codeBar).equal();
        return (Pessoa) q.execute().next();
    }
}
