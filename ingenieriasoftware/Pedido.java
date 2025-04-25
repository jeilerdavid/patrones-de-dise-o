package com.mycompany.ingenieriasoftware;

import java.time.LocalDate;
import java.util.ArrayList;

//Clase que representa un pedido realizado por un cliente.

public class Pedido {

    private Cliente cliente;
    private ArrayList<Producto> productos;
    private LocalDate fecha;
    private int numeroTarjetaCredito;

    private Pedido(Cliente cliente, ArrayList<Producto> productos, LocalDate fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    // Muestra los detalles del pedido.
     
    public void mostrarPedido() {
        System.out.println("Pedido de: " + cliente.getNombre() + " - Cedula: " + cliente.getCedula());
        System.out.println("Fecha: " + fecha + " | Tarjeta: ****" + String.valueOf(numeroTarjetaCredito).substring(4));
        System.out.println("Productos:");
        for (Producto p : productos) {
            p.mostrarInformacion();
        }
    }

    
      //Builder para crear objetos Pedido de forma flexible.
     
    public static class PedidoBuilder {

        private Cliente cliente;
        private ArrayList<Producto> productos = new ArrayList<>();
        private LocalDate fecha;
        private int numeroTarjetaCredito;

        public PedidoBuilder conCliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public PedidoBuilder conProductos(ArrayList<Producto> productos) {
            this.productos = productos;
            return this;
        }

        public PedidoBuilder agregarProducto(Producto producto) {
            this.productos.add(producto);
            return this;
        }

        public PedidoBuilder conFecha(LocalDate fecha) {
            this.fecha = fecha;
            return this;
        }

        public PedidoBuilder conNumeroTarjeta(int numeroTarjeta) {
            this.numeroTarjetaCredito = numeroTarjeta;
            return this;
        }

        public Pedido build() {
            return new Pedido(cliente, productos, fecha, numeroTarjetaCredito);
        }
    }
}