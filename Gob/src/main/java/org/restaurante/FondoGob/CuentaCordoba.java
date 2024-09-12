package org.restaurante.FondoGob;


public class CuentaCordoba{

    private Divisa divisa;
    private double CantidadCordobas;

    public CuentaCordoba(Divisa divisa, double cantidadCordobas) {
        this.divisa = divisa;
        CantidadCordobas = cantidadCordobas;
    }

    public Divisa getDivisa() {
        return divisa;
    }
//bimbimbambam
    public void setDivisa(Divisa divisa) {
        this.divisa = divisa;
    }

    public double getCantidadCordobas() {
        return CantidadCordobas;
    }

    public void setCantidadCordobas(double cantidadCordobas) {
        CantidadCordobas = cantidadCordobas;
    }

    @Override
    public String toString() {
        return "CuentaCordoba{" +
                "divisa=" + divisa +
                ", CantidadCordobas=" + CantidadCordobas +
                '}';
    }
}
