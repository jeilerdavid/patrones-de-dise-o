package com.mycompany.ingenieriasoftware;


//Clase que representa una foto.
 
public class Foto {

    private String fichero;

    
    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    
      //Simula la impresión de una foto.
     
    public void print() {
        System.out.println("Imprimiendo foto: " + fichero);
    }
}