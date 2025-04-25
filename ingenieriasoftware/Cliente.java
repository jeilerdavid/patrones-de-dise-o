package com.mycompany.ingenieriasoftware;

import java.util.ArrayList;
import java.util.Scanner;


 //Clase que representa a un cliente.
 
public class Cliente {

    private String cedula;
    private String nombre;

   
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    //Método principal para simular una orden de productos.
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        Cliente cliente = null;
    
        System.out.println("=== Bienvenido ===");
    
        while (true) {
            System.out.println("\nMenú principal:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
    
            switch (opcion) {
                case 1:
                    // Pedir datos del cliente solo una vez
                    if (cliente == null) {
                        System.out.println("\n=== Datos del Cliente ===");
                        System.out.print("Ingrese cédula: ");
                        String cedula = scanner.nextLine();
                        System.out.print("Ingrese nombre: ");
                        String nombre = scanner.nextLine();
                        cliente = new Cliente(cedula, nombre);
                    }
    
                    System.out.println("\n¿Qué producto desea agregar?");
                    System.out.println("1. Cámara");
                    System.out.println("2. Impresión");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer
    
                    System.out.print("Número de producto: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
    
                    if (tipo == 1) {
                        System.out.print("Marca: ");
                        String marca = scanner.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = scanner.nextLine();
                        productos.add(new Camara(numero, marca, modelo));
                    } else if (tipo == 2) {
                        System.out.print("Color o Blanco y Negro?: ");
                        String color = scanner.nextLine();
                        Impresion impresion = new Impresion(numero, color);
    
                        System.out.print("¿Cuántas fotos desea agregar?: ");
                        int cantidad = scanner.nextInt();
                        scanner.nextLine();
    
                        for (int i = 1; i <= cantidad; i++) {
                            System.out.print("Nombre del archivo de la foto " + i + ": ");
                            String fichero = scanner.nextLine();
                            impresion.agregarFoto(new Foto(fichero));
                        }
    
                        productos.add(impresion);
                    } else {
                        System.out.println("Opción inválida.");
                    }
                    break;
    
                case 2:
                    if (cliente == null || productos.isEmpty()) {
                        System.out.println("\nNo hay productos registrados.");
                    } else {
                        System.out.println("\n=== Productos agregados por " + cliente.getNombre() + " ===");
                        for (Producto p : productos) {
                            p.mostrarInformacion();
                        }
                    }
                    break;
    
                case 3:
                    System.out.println("Saliendo del programa. ¡Gracias!");
                    scanner.close();
                    return;
    
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }}
    