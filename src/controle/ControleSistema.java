/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ConexaoBanco;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;
import modelo.Chave;
import modelo.Pessoa;

/**
 *
 * @author italo
 */
public class ControleSistema {

    private final ControleTela controleTela = new ControleTela(this);
    private ControlePessoa     controlePessoa;
    private ControleChave      controleChave;
    private ControleGrupo      controleGrupo;

    public ControleTela getControleTela() {
        return controleTela;
    }
    
    public ControlePessoa getControlePessoa() {
        if (controlePessoa == null) {
            controlePessoa = new ControlePessoa();
        }
        return controlePessoa;
    }
    
    public ControleChave getControleChave() {
        if (controleChave == null) {
            controleChave = new ControleChave();
        }
        return controleChave;
    }
    
    public ControleGrupo getControleGrupo() {
        if (controleGrupo == null) {
            controleGrupo = new ControleGrupo();
        }
        return controleGrupo;
    }
    
    public void inicializaSistema() {
        getControleTela();
    }

    public void encerraSistema() {
        ConexaoBanco.getBanco().close();
        System.exit(0);
    }

    public static void main(String[] args) {
        new ControleSistema().inicializaSistema();
    }

    // O T H E R S \(*w*)/
    public String gerarCodigoBarras() {
        int iASCII = 0, iMax = 0;
        char cLetra;
        String sSenha = "";
        Random rRandom = new Random();
        while (iMax <= 9) {
            iMax++;
            /*iASCII = rRandom.nextInt(25) + 97; // letras minúsculas
            cLetra = (char) iASCII;
            sSenha += cLetra;*/
            iASCII = rRandom.nextInt(9) + 48; // números
            cLetra = (char) iASCII;
            sSenha += cLetra;
            /*iASCII = rRandom.nextInt(25) + 65; // LETRAS MAIÚSCULAS
            cLetra = (char) iASCII;
            sSenha += cLetra;*/
        }
        return sSenha;
    }

    public DefaultListModel setDefaultListModel(ArrayList lista) {
        DefaultListModel dlm = new DefaultListModel();
        if (!lista.isEmpty()) {
            if (lista.get(0) instanceof Pessoa) {
                for (Pessoa trabalhoFor : (ArrayList<Pessoa>) lista) {
                    dlm.addElement(trabalhoFor.toString());
                }
            }
            if (lista.get(0) instanceof Chave) {
                for (Chave trabalhoFor : (ArrayList<Chave>) lista) {
                    dlm.addElement(trabalhoFor.toString());
                }
            }
        }
        return dlm;
    }
}
