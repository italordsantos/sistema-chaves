/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import com.db4o.query.Query;
import dao.ConexaoBanco;
import dao.DaoChave;
import java.util.ArrayList;
import java.util.Collection;
import modelo.RelacaoGrupoPessoa;

/**
 *
 * @author italo
 */
public class ControleGrupo extends DaoChave {

    public Collection searchAllPeoples(){
        Query query = ConexaoBanco.getBanco().query();
        query.constrain(RelacaoGrupoPessoa.class);
        query.descend("listaPessoaAcessoPermitido");
        return new ArrayList(query.execute());
    }
    
    public Collection searchAllChaves(){
        Query query = ConexaoBanco.getBanco().query();
        query.constrain(RelacaoGrupoPessoa.class);
        query.descend("listaChavePermitida");
        return new ArrayList(query.execute());
    }
}
