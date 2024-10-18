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
        
        double cuota_mensual = 0;
        double total_pagar = 0;
        
        int clicsGrupo1 = 60;
        double costoGrupo1 = 0.30;

        int clicsGrupo2 = 100;
        double costoGrupo2 = 0.25;

        int clicsGrupo3 = 20;
        double costoGrupo3 = 0.80;
        
        Scanner entrada_banco = new Scanner (System.in);
        
        
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
        
        
        
        System.out.println("----------------------------------------------");
        
        System.out.println("*****Cuotas Mensuales*****");
        
        System.out.print("Ingrese el monto del préstamo: ");
        double montoPrestamo = Scanner.nextDouble();

        System.out.println("Ingrese el plazo de pago en meses: ");
        int plazoMeses = Scanner.nextInt();

        System.out.println("Ingrese la tasa de interés mensual (en porcentaje): ");
        double interesMensual = Scanner.nextDouble() / 100;

        System.out.println("Ingrese la comisión por cuota: ");
        double comisionCuota = Scanner.nextDouble();

        System.out.println("Ingrese el porcentaje de seguro mensual aplicado a la cuota: ");
        double seguroMensual = Scanner.nextDouble() / 100;

        
        double interesSimpleMensual = montoPrestamo * interesMensual;
        double cuotaBase = montoPrestamo / plazoMeses;
        double cuotaMensual = cuotaBase + interesSimpleMensual + comisionCuota + (cuotaBase * seguroMensual);
        double totalPagar = cuotaMensual * plazoMeses;

        System.out.printf("El valor de la cuota mensual es: %.2f\n", cuota_mensual);
        System.out.printf("El total a pagar por el préstamo es: %.2f\n", total_pagar);
        
        System.out.println("----------------------------------------------");
        
        double totalGrupo1 = clicsGrupo1 * costoGrupo1;
        double totalGrupo2 = clicsGrupo2 * costoGrupo2;
        double totalGrupo3 = clicsGrupo3 * costoGrupo3;

        
        double totalCosto = totalGrupo1 + totalGrupo2 + totalGrupo3;

       
        double isv = totalCosto * 0.16;

        
        double totalConISV = totalCosto + isv;

        
        System.out.printf("El costo total de los clics es: $%.2f\n", totalCosto);
        System.out.printf("El total con ISV (16%%) incluido es: $%.2f\n", totalConISV);
        
        
        
        
    }
    
}
