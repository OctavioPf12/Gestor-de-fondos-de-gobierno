package org.restaurante;

public class Pizzas extends Base {

    private int id;

    public Pizzas(int id, String nombre) {
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