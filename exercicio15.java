/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudos;
import java.util.Scanner;
/**
 *
 * @author skate
 */
public class exercicio15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float Valor;
        int Horas;
        float Imp;
        float Com;
        float SalarioB;
        float SalarioL;
            
        System.out.print("Digite o valor/hora: ");
        Valor = sc.nextFloat();
        System.out.print("Digite as horas trabalhadas: ");
        Horas = sc.nextInt();
        System.out.print("Digite o imposto de 0 ou 1: ");
        Imp = sc.nextFloat();
        System.out.print("Digite a comissão: ");
        Com = sc.nextFloat();
        
        SalarioB = (Valor * Horas);
        
        if (Horas >= 120){
            SalarioL = (SalarioB - Imp + Com);
        } else {
            SalarioL = (SalarioB - Imp);
        }
        
        System.out.print("Salario Bruto: " + SalarioB);
        System.out.print("Salario Liquido: " + SalarioL);    
        
        
    sc.close();
    }    
}
