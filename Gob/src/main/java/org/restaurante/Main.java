package org.restaurante;

import org.restaurante.FondoGob.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final Origen origen = crearOrigen(20000.00,5000.00);
        final CuentaCordoba cuentaCordoba = crearCuentaCordoba(Divisa.CORDOBA,100000.000);
        final CuentaDolares cuentaDolares = crearCuentaDolares(Divisa.DOLARES,80000);
        final Instituciones instituciones = crearInstituciones(TipoTransf.CHEQUES,70000.00,"MINED","Organismos engargado de administrar el sistema educativo","MINED");
        final Proyectos proyectos = crearProyectos(Tipoproyectoss.ESCUELAS,LocalDate.now(),10000);
        final DetallesProyectos detallesProyectos = crearDetallesProyectos(proyectos,cuentaCordoba);
        System.out.println(detallesProyectos);
        }

     public static CuentaCordoba crearCuentaCordoba(Divisa divisa, double cantidadCordobas) {

     return new CuentaCordoba(divisa, cantidadCordobas);
    }

    public static CuentaDolares crearCuentaDolares(Divisa divisa, double cantidadDolares) {
        return new CuentaDolares(divisa, cantidadDolares);
    }

  public static Origen crearOrigen(Double impuestos, Double contribuyentes) {
        return new Origen(impuestos, contribuyentes);
  }

  public static Proyectos crearProyectos(Tipoproyectoss tipoproyectoss, LocalDate plazoproyecto, double fondoAsignado) {
        return new Proyectos(tipoproyectoss, plazoproyecto, fondoAsignado);
  }

  public static Instituciones crearInstituciones(TipoTransf tipo, double montoInstitucion, String institucion, String descripcionInstitucion, String nombreInstitucion){
        return new Instituciones(tipo,montoInstitucion,institucion,descripcionInstitucion,nombreInstitucion);
  }

  public static DetallesProyectos crearDetallesProyectos(Proyectos proyecto, CuentaCordoba cuentaCordoba){
        return new DetallesProyectos(proyecto, cuentaCordoba);
  }



}

//bimbimbambam