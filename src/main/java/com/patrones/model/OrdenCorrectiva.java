package com.patrones.model;

/**
 * Orden por falla detectada en el vehiculo (mantenimiento correctivo).
 */
public class OrdenCorrectiva extends OrdenMantenimiento {

    private static final double COSTO_BASE = 150.0;

    public OrdenCorrectiva(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String descripcion() {
        return "Orden correctiva | " + vehiculo;
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
