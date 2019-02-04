/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.ignorar;

/**
 *
 * @author italo
 */
public enum TipoLaboratorio {

    INFORMATICA(0),
    REDES(1),
    QUIMICA(2),
    FISICA(3),
    BIOLOGIA(4),
    DESENHO_TECNICO(5);

    private final int id;

    private TipoLaboratorio(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
