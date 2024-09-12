package org.restaurante;

import java.util.ArrayList;

public class Clientes extends Base {
    private ArrayList<cProcutos> ProductosClientes;
    private String tDocumentos;
    private int documentos;

     public Clientes(String nombre, String tDocumentos, int documentos) {
         super(nombre);
         this.tDocumentos = tDocumentos;
         this.documentos = documentos;
         this.ProductosClientes = new ArrayList<cProcutos>();

     }
     public ArrayList getProductosClientes() {
         return ProductosClientes;
     }

     public void addProducto(cProcutos producto) {
         this.ProductosClientes.add(producto);
     }

     public void setProductosClientes(ArrayList<cProcutos> productosClientes) {
         ProductosClientes = productosClientes;

     }

     public void settDocumentos(String tDocumentos) {
         this.tDocumentos = tDocumentos;
     }




   }




