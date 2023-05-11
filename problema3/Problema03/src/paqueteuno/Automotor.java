/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.Fabricante;

/**
 *
 * @author sofiv
 */
public class Automotor {

    private String cedula;
    private String marca;
    private int anio;
    private double valorVehiculo;
    private double valorMatricula;
    private Fabricante frabicante;

    public Automotor(String ced) {
        cedula = ced;
    }

    public Automotor(String ced, String m, int a, double valorV, Fabricante fra) {
        cedula = ced;
        marca = m;
        anio = a;
        valorVehiculo = valorV;
        frabicante = fra;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnio() {
        return anio;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    public Fabricante obtenerFrabicante() {
        return frabicante;
    }

    public void establecerCedula(String ced) {
        this.cedula = ced;
    }

    public void establecerMarca(String m) {
        this.marca = m;
    }

    public void establecerAnio(int a) {
        this.anio = a;
    }

    public void establecerValorVehiculo(double valorV) {
        this.valorVehiculo = valorV;
    }

    public void calcularValorMatricula() {
        valorMatricula = (0.00002 * valorVehiculo) * (2023 - anio);
    }

    public void establecerFrabicante(Fabricante frabicante) {
        this.frabicante = frabicante;
    }
        @Override
    public String toString() {

        String cadena = String.format("""
                                      Cedula: %s
                                      Marca del Vehiculo: %s
                                      Año de Fabricacion: %d
                                      Valor del Vehiculo: %.2f
                                      Valor de la Matricula: %.2f
                                      Nombre de fabricante: %s
                                      Ciudad de origen: %s
                                      """,
                obtenerCedula(),
                obtenerMarca(),
                obtenerAnio(),
                obtenerValorVehiculo(),
                obtenerValorMatricula(),
                frabicante.obtenerNombre(),
                frabicante.obtenerCiudad());
        
        return cadena;

    }

}
