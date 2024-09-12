package org.restaurante;

public class cProcutos extends Base {

    private int id;

    public cProcutos(int id, String nombre) {
        super(nombre);
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
