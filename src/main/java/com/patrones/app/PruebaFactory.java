package com.patrones.app;

import com.patrones.factory.OrdenFactory;
import com.patrones.model.OrdenMantenimiento;
import com.patrones.model.Vehiculo;

/**
 * Prueba individual del patron Factory Method.
 * Es una clase temporal de apoyo, el Main final del sistema es aparte.
 */
public class PruebaFactory {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota", "Yaris");

        OrdenMantenimiento preventiva = OrdenFactory.crearOrden("PREVENTIVA", vehiculo);
        OrdenMantenimiento correctiva = OrdenFactory.crearOrden("CORRECTIVA", vehiculo);

        imprimir(preventiva);
        imprimir(correctiva);
    }

    private static void imprimir(OrdenMantenimiento orden) {
        System.out.println(orden.descripcion() + " | Costo base: S/ " + orden.costoBase());
    }
}
