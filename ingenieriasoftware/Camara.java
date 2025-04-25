package com.mycompany.ingenieriasoftware;


 // Clase que representa una cámara como producto.
 
public class Camara extends Producto {

    private String marca;
    private String modelo;

    
    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    
     //Muestra información específica de la cámara.
     
    @Override
    public void mostrarInformacion() {
        System.out.println("Producto: Camara #" + numero + " - Marca: " + marca + ", Modelo: " + modelo);
    }
}