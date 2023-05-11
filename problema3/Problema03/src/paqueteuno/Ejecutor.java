/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.Fabricante;

/**
 *
 * @author sofiv
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabricante fabricante1 = new Fabricante();
        fabricante1.establecerNombre("Toyota");
        fabricante1.establecerCiudad("Quito");

        Fabricante fabricante2 = new Fabricante();
        fabricante2.establecerNombre("Kia");
        fabricante2.establecerCiudad("Quito");

        Automotor auto = new Automotor("119944566");
        Automotor auto2 = new Automotor("11368654", "Kia", 2018, 28510, fabricante2);
        auto.establecerCedula("11025689");
        auto.establecerMarca("Toyota");
        auto.establecerFrabicante(fabricante1);
        auto.establecerAnio(2016);
        auto.establecerValorVehiculo(18674);

        auto.calcularValorMatricula();
        auto2.calcularValorMatricula();

        System.out.println(auto);
        System.out.println("------------------------------------------");
        System.out.println(auto2);
    }

}
