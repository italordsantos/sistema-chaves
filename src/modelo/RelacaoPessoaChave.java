/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author italo
 */
public class RelacaoPessoaChave {
    
    private Pessoa pessoa;
    private Chave  chave;
    private Date   dataPegou;
    private Date   dataDevolveu;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Chave getChave() {
        return chave;
    }

    public void setChave(Chave chave) {
        this.chave = chave;
    }

    public Date getDataPegou() {
        return dataPegou;
    }

    public void setDataPegou(Date dataPegou) {
        this.dataPegou = dataPegou;
    }

    public Date getDataDevolveu() {
        return dataDevolveu;
    }

    public void setDataDevolveu(Date dataDevolveu) {
        this.dataDevolveu = dataDevolveu;
    }
    
}
