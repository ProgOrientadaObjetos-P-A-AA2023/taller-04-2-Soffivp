/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author sofiv
 */
public class Universidad {

    private String nombre;
    private String direccion;

    public Universidad() {
        nombre = "NN";
        direccion = "AA";
    }

    public Universidad(String nom, String dir) {
        nombre= nom;
        direccion = dir;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public void establecerNombre(String nom) {
        this.nombre = nom;
    }

    public void establecerDireccion(String dir) {
        this.direccion = dir;
    }
    
    
}
