package org.restaurante.FondoGob;

public class Instituciones {

    public TipoTransf tipo;
    public String NombreInstitucion;
    public String DescripcionInstitucion;
    public String Institucion;
    private double MontoInstitucion;


    public Instituciones(TipoTransf tipo, double montoInstitucion, String institucion, String descripcionInstitucion, String nombreInstitucion) {
        this.tipo = tipo;
        MontoInstitucion = montoInstitucion;
        Institucion = institucion;
        DescripcionInstitucion = descripcionInstitucion;
        NombreInstitucion = nombreInstitucion;
    }

    public TipoTransf getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransf tipo) {
        this.tipo = tipo;
    }

    public String getDescripcionInstitucion() {
        return DescripcionInstitucion;
    }

    public void setDescripcionInstitucion(String descripcionInstitucion) {
        DescripcionInstitucion = descripcionInstitucion;
    }

    public String getNombreInstitucion() {
        return NombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        NombreInstitucion = nombreInstitucion;
    }

    public String getInstitucion() {
        return Institucion;
    }

    public void setInstitucion(String institucion) {
        Institucion = institucion;
    }

    public double getMontoInstitucion() {
        return MontoInstitucion;
    }

    public void setMontoInstitucion(double montoInstitucion) {
        MontoInstitucion = montoInstitucion;
    }

    @Override
    public String toString() {
        return "Instituciones{" +
                "tipo=" + tipo +
                ", NombreInstitucion='" + NombreInstitucion + '\'' +
                ", DescripcionInstitucion='" + DescripcionInstitucion + '\'' +
                ", Institucion='" + Institucion + '\'' +
                ", MontoInstitucion=" + MontoInstitucion +
                '}';
    }
}
