/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author sofiv
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String cedula;

    public Cliente() {
        nombre = "NN";
        apellido = "AA";
        cedula = "00";
    }

    public Cliente(String nom, String ap, String ced) {
        nombre = nom;
        apellido = ap;
        cedula = ced;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerApellido(String ap) {
        apellido = ap;
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

}
