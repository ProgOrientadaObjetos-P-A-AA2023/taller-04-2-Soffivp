/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.Universidad;

/**
 *
 * @author sofiv
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Universidad uni1 = new Universidad();
        uni1.establecerNombre("Universidad Tècnica Particular de Loja");
        uni1.establecerDireccion("Loja");
        
        Universidad uni2 = new Universidad();
        uni2.establecerNombre("Universidad de las Americas");
        uni2.establecerDireccion("Quito");
        
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante("Sofia Vire", 8.75, 9.12, 8.6, uni1);
        
        est1.establecerNombre("Ana Torres");
        est1.establecerMateria1(8.36);
        est1.establecerMateria2(9.16);
        est1.establecerMateria3(7.65);
        est1.establecerUniversidad(uni2);
        est1.calcularPromedio();
        est2.calcularPromedio();
        System.out.println(est1);
        System.out.println("------------------------------------------");
        System.out.println(est2);
    }
    
    
}
