/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import com.db4o.ObjectSet;
import dao.DaoChave;
import javax.swing.JOptionPane;
import modelo.Chave;

/**
 *
 * @author italo
 */
public class ControleChave extends DaoChave {

    @Override
    public boolean cadastrar(Object object) {
        if (super.cadastrar(object)) {
            System.out.println("Cadastrado com sucesso");
        } else {
            System.out.println("Não foi possível cadastrar");
        }
        return true;
    }

    @Override
    public boolean exist(Chave chave) {
        return super.exist(chave);
    }

    @Override
    public ObjectSet listarTudo(Chave chave) {
        for(Object cFor : super.listarTudo(chave)){
            System.out.println("Existe: " + ((Chave) cFor).getNome());
        }
        return null;
    }

}
