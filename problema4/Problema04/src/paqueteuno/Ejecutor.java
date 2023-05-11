/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteuno;

import paquetedos.Banco;
import paquetedos.Cliente;

/**
 *
 * @author sofiv
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.establecerNombre("Banco de Loja");
        banco.establecerNumeroSucursales("16");

        Banco banco2 = new Banco();
        banco2.establecerNombre("Banco de Pichincha");
        banco2.establecerNumeroSucursales("14");

        Cliente cliente = new Cliente();
        cliente.establecerNombre("Sofia");
        cliente.establecerApellido("Vire");
        cliente.establecerCedula("110005798");

        Cliente cliente2 = new Cliente();
        cliente2.establecerNombre("Gabriela");
        cliente2.establecerApellido("Valdivieso");
        cliente2.establecerCedula("1102564889");

        Cheques cheque = new Cheques(165463);
        Cheques cheque2 = new Cheques(cliente2, banco2, 7984564);
        cheque.calcularComision();
        cheque2.calcularComision();
        cheque.establecerCliente(cliente);
        cheque.establecerBanco(banco);

        System.out.println(cheque);
        System.out.println("------------------------------------------");
        System.out.println(cheque2);
    }

}
