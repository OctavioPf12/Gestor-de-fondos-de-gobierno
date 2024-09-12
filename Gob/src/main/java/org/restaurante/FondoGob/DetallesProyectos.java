package org.restaurante.FondoGob;

public class DetallesProyectos {
    private Proyectos proyecto;
    private CuentaCordoba cuentaCordoba;

private Proyectos getproyecto() {
    return proyecto;
}

    @Override
    public String toString() {
        return "DetallesProyectos{" +
                "proyecto=" + proyecto +
                ", cuentaCordoba=" + cuentaCordoba +
                '}';
    }

    private void setproyecto(Proyectos proyecto) {
    this.proyecto = proyecto;
}

    public DetallesProyectos(Proyectos proyecto, CuentaCordoba cuentaCordoba) {
        this.proyecto = proyecto;
        this.cuentaCordoba = cuentaCordoba;
    }

    public Proyectos getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyectos proyecto) {
        this.proyecto = proyecto;
    }

    public CuentaCordoba getCuentaCordoba() {
        return cuentaCordoba;
    }

    public void setCuentaCordoba(CuentaCordoba cuentaCordoba) {
        this.cuentaCordoba = cuentaCordoba;
    }
}
