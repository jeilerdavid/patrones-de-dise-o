package com.mycompany.ingenieriasoftware;


  //Clase abstracta que representa un producto genérico.

public abstract class Producto {

    
      //Número identificador del producto.
     
    protected int numero;

    
      //Constructor de Producto.
     
    public Producto(int numero) {
        this.numero = numero;
    }

    
      //Obtiene el número del producto.
    
    public int getNumero() {
        return numero;
    }

    
      //Establece el número del producto.
     
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
     // Muestra información del producto (debe ser implementado por las subclases).
     
    public abstract void mostrarInformacion();
}