/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baide_ramon_variables;

import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Baide_Ramon_Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String Nombre_Empleado;
        String Hora_Trabajo;
        String Tarifa_Hora;
        String Salario_Semanal;
        
        System.out.println("-----Boleta de Empleado-----");
        System.out.println("Por favor ingrese su Nombre: ");
        Nombre_Empleado = entrada.next();
        System.out.println("Por favor ingrese sus Horas de trabajo mensual: ");
        Hora_Trabajo = entrada.next();
        System.out.println("Por favor ingrese su tarifa por hora: ");
        Tarifa_Hora = entrada.next();
        System.out.println("Por favor ingrese su salario semanal: ");
        Salario_Semanal = entrada.next();
        
        System.out.println("Su boleta de empleado es la siguiente, Su nombre es: "+Nombre_Empleado+", Sus horas trabajadas son: "+Hora_Trabajo+", Su tarifa por hora es: "+Tarifa_Hora+", Su salario semanal es: "+Salario_Semanal);
    }
    
}
