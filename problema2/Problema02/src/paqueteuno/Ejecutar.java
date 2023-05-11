/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.Provincia;

/**
 *
 * @author sofiv
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Provincia prov1 = new Provincia();
        Provincia prov2 = new Provincia();

        prov1.establecerNombre("Loja");
        prov1.establecerNumero(7951.36);
        prov2.establecerNombre("Pichincha");
        prov2.establecerNumero(6513236.48);

        Profesores profe1 = new Profesores(600);
        Profesores profe2 = new Profesores("Javier", "Sanchez", 650, 1103465456, prov2);

        profe1.establecerNombre("Carolina");
        profe1.establecerApellido("Abendaño");
        profe1.establecerCedula(110798413);
        profe1.calcularSueldoTotal();
        profe1.establecerProvincia(prov1);
        profe2.calcularSueldoTotal();

        System.out.println(profe1);
        System.out.println("------------------------------------------");
        System.out.println(profe2);
    }

}
