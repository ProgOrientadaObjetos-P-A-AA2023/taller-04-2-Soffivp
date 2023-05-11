/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author sofiv
 */
public class Provincia {

    private String nombre;
    private double numhabitantes;

    public Provincia() {
        nombre = "NN";
        numhabitantes = 0;
    }

    public Provincia(String n, double num) {
        nombre = n;
        numhabitantes = num;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerNumero() {
        return numhabitantes;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerNumero(double numero) {
        this.numhabitantes = numero;
    }

}
