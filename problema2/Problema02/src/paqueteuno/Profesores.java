/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteuno;

import paquetedos.Provincia;

/**
 *
 * @author sofiv
 */
public class Profesores {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private int cedula;
    private Provincia p;

    public Profesores(double sueldob) {
        sueldoBasico = sueldob;
    }

    public Profesores(String nom, String ap, double sb, int ced, Provincia prov) {
        nombre = nom;
        apellido = ap;
        sueldoBasico = sb;
        cedula = ced;
        p = prov;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public int obtenerCedula() {
        return cedula;
    }

    public Provincia obtenerProvincia() {
        return p;
    }

    public void establecerNombre(String nomb) {
        this.nombre = nomb;
    }

    public void establecerApellido(String ap) {
        this.apellido = ap;
    }

    public void establecerSueldoBasico(double sb) {
        this.sueldoBasico = sb;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
    }

    public void establecerCedula(int ced) {
        this.cedula = ced;
    }

    public void establecerProvincia(Provincia p) {
        this.p = p;
    }

    @Override
    public String toString() {

        String cadena = String.format("""
                                      Nombre: %s
                                      Apellido: %s
                                      Sueldo Basico: %.2f
                                      Sueldo Total: %.2f
                                      Cédula: %d
                                      Provincia: %s
                                      Numero de habitantes: %s
                                      """,
                obtenerNombre(),
                obtenerApellido(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal(),
                obtenerCedula(),
                p.obtenerNombre(),
                p.obtenerNumero());
        return cadena;
    }

}
