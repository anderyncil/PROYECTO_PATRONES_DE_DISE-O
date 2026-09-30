package com.patrones.model;

/**
 * Abstraccion comun de una orden de mantenimiento.
 * Sobre esta clase trabajan el Factory (la crea) y el Decorator (la envuelve).
 */
public abstract class OrdenMantenimiento {

    protected Vehiculo vehiculo;

    protected OrdenMantenimiento(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /** Texto que describe la orden. */
    public abstract String descripcion();

    /** Costo acumulado de la orden. */
    public abstract double costo();

    /**
     * Costo de la orden sin servicios adicionales.
     * Por defecto coincide con el costo de la orden recien creada.
     */
    public double costoBase() {
        return costo();
    }
}
