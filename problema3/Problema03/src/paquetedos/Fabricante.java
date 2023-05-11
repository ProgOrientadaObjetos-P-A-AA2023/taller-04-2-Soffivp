/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author sofiv
 */
public class Fabricante {

    private String nombre;
    private String ciudad;

    public Fabricante() {
        nombre = "NN";
        ciudad = "AA";
    }

    public Fabricante(String nom, String c) {
        nombre = nom;
        ciudad = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void establecerNombre(String nom) {
        this.nombre = nom;
    }

    public void establecerCiudad(String c) {
        this.ciudad = c;
    }

}
