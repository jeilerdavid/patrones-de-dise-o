package com.mycompany.ingenieriasoftware;

import java.util.ArrayList;


 // Clase que representa una impresión como producto.
 
public class Impresion extends Producto {

    private String color;
    private ArrayList<Foto> fotos;

    
    public Impresion(int numero, String color) {
        super(numero);
        this.color = color;
        this.fotos = new ArrayList<>();
    }

    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    public String getColor() {
        return color;
    }

    public ArrayList<Foto> getFotos() {
        return fotos;
    }

    
     //Muestra información específica de la impresión y sus fotos.
     
    @Override
    public void mostrarInformacion() {
        System.out.println("Producto: Impresion #" + numero + " - Color: " + color);
        for (Foto foto : fotos) {
            foto.print();
        }
    }
}