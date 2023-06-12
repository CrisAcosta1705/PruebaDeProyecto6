package Proyecto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Producto {
    private String nombre;
    private double precio;
    private int unidades;

    public Producto(String nombre, double precio, int unidades) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }


	}

class ProductoElectronico extends Producto {
    private String modelo;

    public ProductoElectronico(String nombre, double precio, int unidades, String modelo) {
        super(nombre, precio, unidades);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

class ProductoAlimenticio extends Producto {
    private Date fechaCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int unidades, Date fechaCaducidad) {
        super(nombre, precio, unidades);
        this.fechaCaducidad = fechaCaducidad;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}

class Venta extends Producto {
	private LocalDate fechaVenta;
    private int cantidad;
    private double gananciasVenta;

    public Venta(String nombre, LocalDate fechaVenta, int cantidad, double gananciasVenta, String modelo) {
        super(nombre, 0, cantidad); 
        this.fechaVenta = fechaVenta;
        this.cantidad = cantidad;
        this.gananciasVenta = gananciasVenta;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getGananciasVenta() {
        return gananciasVenta;
    }

    public void setGananciasVenta(double gananciasVenta) {
        this.gananciasVenta = gananciasVenta;
    }


	}
	
	class Factura extends Producto {
		private static final Factura[] factura = null;
		private double gananciaTotal;
	
		public String Cliente;


		public double getGananciaTotal() {
			return gananciaTotal;
		}


		public void setGananciaTotal(double gananciaTotal) {
			this.gananciaTotal = gananciaTotal;
		}



		public String getCliente() {
			return Cliente;
		}


		public void setCliente(String cliente) {
			Cliente = cliente;
		}


		public Factura(String nombre, double precio, int unidades, String modelo) {
			super(nombre, precio, unidades);
			this.getNombre();
			this.getPrecio();
			this.getUnidades();
		}
	}
	