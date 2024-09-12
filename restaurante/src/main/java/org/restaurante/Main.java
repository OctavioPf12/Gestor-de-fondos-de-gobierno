package org.restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main (String[] args) {

    ArrayList pizza = new ArrayList();
    ArrayList cliente = new ArrayList();

    Scanner entrada = new Scanner(System.in);
    int numero = 0;

    while (numero != 6) {
        System.out.println("1. Registro de pizza");
        System.out.println("2. Registro de cliente");

        numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Ingrese el nombre del pizza: ");
                Scanner entradaNombreProducto = new Scanner(System.in);
                String nombre_producto = entradaNombreProducto.nextLine();
                int id_producto = pizza.toArray().length +1;
                pizza.add(new cProcutos(id_producto, nombre_producto));
                System.out.println("Ingrese el nombre del pizza: ");
                break;

                case 2:
                    System.out.println("Ingrese el nombre del cliente: ");
                    break;
                    default:
                        System.out.println("Ingrese un numero valido: ");
        }

    }
}
  }
