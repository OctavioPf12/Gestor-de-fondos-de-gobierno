package org.restaurante.FondoGob;

public class CuentaDolares {

    private Divisa divisa;

    private double CantidadDolares;

    public CuentaDolares(Divisa divisa, double cantidadDolares) {
        this.divisa = divisa;
        CantidadDolares = cantidadDolares;
    }

    public Divisa getDivisa() {
        return divisa;
    }

    public void setDivisa(Divisa divisa) {
        this.divisa = divisa;
    }

    public double getCantidadDolares() {
        return CantidadDolares;
    }

    public void setCantidadDolares(double cantidadDolares) {
        CantidadDolares = cantidadDolares;
    }

    @Override
    public String toString() {
        return "CuentaDolares{" +
                "divisa=" + divisa +
                ", CantidadDolares=" + CantidadDolares +
                '}';
    }
}

