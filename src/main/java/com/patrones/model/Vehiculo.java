package com.patrones.model;

/**
 * Datos del vehiculo que ingresa al taller.
 */
public class Vehiculo {

    private final String placa;
    private final String marca;
    private final String modelo;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " " + placa;
    }
}
