/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Grupo;

/**
 *
 * @author italo
 */
public class DaoGrupo extends DaoGeneric {

    public void elevarOrdemDePrioridade(Grupo grupo) {
        grupo.setOrdemDePrioridade(grupo.getOrdemDePrioridade() + 1);
        cadastrar(grupo);
    }
}
