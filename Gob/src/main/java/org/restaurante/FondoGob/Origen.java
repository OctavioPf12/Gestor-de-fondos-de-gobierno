package org.restaurante.FondoGob;

public class Origen {
    private Double Impuestos;
    private Double Contribuyentes;


    @Override
    public String toString() {
        return "Origen{" +
                "Impuestos=" + Impuestos +
                ", Contribuyentes=" + Contribuyentes +
                '}';
    }

    public Origen(Double impuestos, Double contribuyentes) {
        Impuestos = impuestos;
        Contribuyentes = contribuyentes;
    }

    public Double getImpuestos() {
        return Impuestos;
    }

    public void setImpuestos(Double impuestos) {
        Impuestos = impuestos;
    }

    public Double getContribuyentes() {
        return Contribuyentes;
    }

    public void setContribuyentes(Double contribuyentes) {
        Contribuyentes = contribuyentes;
    }
}
