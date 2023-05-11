/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author sofiv
 */
public class Banco {

    private String nombre;
    private String numSucursales;

    public Banco() {
        nombre = "NN";
        numSucursales = "00";
    }

    public Banco(String nom, String num) {
        nombre = nom;
        numSucursales = num;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerNumeroSucursales() {
        return numSucursales;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerNumeroSucursales(String num) {
        numSucursales = num;
    }

}
