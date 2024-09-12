package org.restaurante.FondoGob;

import java.time.LocalDate;

public class Proyectos {
private Tipoproyectoss tipoproyectoss;
private double FondoAsignado;
private LocalDate plazoproyecto;


    @Override
    public String toString() {
        return "Proyectos{" +
                "tipoproyectoss=" + tipoproyectoss +
                ", FondoAsignado=" + FondoAsignado +
                ", plazoproyecto=" + plazoproyecto +
                '}';
    }

    public Proyectos(Tipoproyectoss tipoproyectoss, LocalDate plazoproyecto, double fondoAsignado) {
        this.tipoproyectoss = tipoproyectoss;
        this.plazoproyecto = plazoproyecto;
        FondoAsignado = fondoAsignado;
    }

    public Tipoproyectoss getTipoproyectoss() {
        return tipoproyectoss;
    }

    public void setTipoproyectoss(Tipoproyectoss tipoproyectoss) {
        this.tipoproyectoss = tipoproyectoss;
    }

    public LocalDate getPlazoproyecto() {
        return plazoproyecto;
    }

    public void setPlazoproyecto(LocalDate plazoproyecto) {
        this.plazoproyecto = plazoproyecto;
    }

    public double getFondoAsignado() {
        return FondoAsignado;
    }

    public void setFondoAsignado(double fondoAsignado) {
        FondoAsignado = fondoAsignado;
    }
}
