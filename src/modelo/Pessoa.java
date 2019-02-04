/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author italo
 */
public class Pessoa {

    private String                 caminhoImagem;
    private String                 nome;
    private String                 codigo;
    private char[]                 senha;
    private String                 codigoDeBarras;
    private final ArrayList<Chave> listaChavePega = new ArrayList<>();

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public String getNome() {
        return nome;
    }

    /**
     * Seta um nome para esta pessoa;
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    /**
     * Seta um código único da pessoa; este código pode ser uma matrícula, siape
     * ou outro.
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public ArrayList<Chave> getListaChavePega() {
        return listaChavePega;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    public String toString() {
        return getNome();
    }

    
}
