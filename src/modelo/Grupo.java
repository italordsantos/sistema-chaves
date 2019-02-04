/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author italo
 */
public class Grupo {

    private String nome;
    private String descricao;
    /**
     * Ondens de processamento menores terão preferências maiores; Por exemplo:
     * caso tenha um grupo para Administradores e um para UsuáriosSecundários, e
     * suas ordens sejam, respectivamente, 1 e 2; supondo a existência de um
     * usuário em ambos os grupos, este usuário terá preferência de acesso por
     * parte do grupo com menor ordem de processamento no qual faz parte, logo,
     * caso o grupo UsuariosSecundários possa somente visualizar, enquanto o
     * grupo Administradores tenha acesso completo, este usuário terá acesso
     * completo, e não somente visualização, no entanto, caso esta ordem seja
     * trocada, o mesmo poderá somente visualizar.
     */
    private int ordemDePrioridade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getOrdemDePrioridade() {
        return ordemDePrioridade;
    }

    public void setOrdemDePrioridade(int ordemDePrioridade) {
        this.ordemDePrioridade = ordemDePrioridade;
    }

}
