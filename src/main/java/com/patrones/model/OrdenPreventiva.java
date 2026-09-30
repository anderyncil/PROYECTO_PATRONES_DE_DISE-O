package com.patrones.model;

/**
 * Orden de revision programada (mantenimiento preventivo).
 */
public class OrdenPreventiva extends OrdenMantenimiento {

    private static final double COSTO_BASE = 80.0;

    public OrdenPreventiva(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String descripcion() {
        return "Orden preventiva | " + vehiculo;
    }

    @Override
    public double costo() {
        return COSTO_BASE;
    }

    @Override
    public double costoBase() {
        return COSTO_BASE;
    }
}
