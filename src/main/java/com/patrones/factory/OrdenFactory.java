package com.patrones.factory;

import com.patrones.model.OrdenCorrectiva;
import com.patrones.model.OrdenMantenimiento;
import com.patrones.model.OrdenPreventiva;
import com.patrones.model.Vehiculo;

/**
 * Patron Factory Method.
 * Centraliza la creacion de las ordenes: el resto del sistema pide una orden
 * por su tipo y no necesita conocer la clase concreta que se instancia.
 */
public class OrdenFactory {

    public static final String PREVENTIVA = "PREVENTIVA";
    public static final String CORRECTIVA = "CORRECTIVA";

    private OrdenFactory() {
    }

    /**
     * Devuelve la orden que corresponde al tipo indicado.
     *
     * @param tipo     PREVENTIVA o CORRECTIVA (no distingue mayusculas)
     * @param vehiculo vehiculo al que pertenece la orden
     */
    public static OrdenMantenimiento crearOrden(String tipo, Vehiculo vehiculo) {
        if (tipo == null) {
            throw new IllegalArgumentException("El tipo de orden es obligatorio");
        }
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehiculo es obligatorio");
        }

        return switch (tipo.trim().toUpperCase()) {
            case PREVENTIVA -> new OrdenPreventiva(vehiculo);
            case CORRECTIVA -> new OrdenCorrectiva(vehiculo);
            default -> throw new IllegalArgumentException("Tipo de orden no valido: " + tipo);
        };
    }
}
