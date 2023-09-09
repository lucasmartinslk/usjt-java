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
public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Saldo da conta : ");
        float valor = sc.nextFloat();
        
        System.out.println("Valor de saque : ");
        float valor2 = sc.nextFloat();
        
        float valor3;
        
        if (valor >= valor2) {
            valor3 = valor - valor2;
            System.out.println("Valor restante da conta é : " + valor3);
        } else {
            System.out.println("Impossível realizar o saque!");
        }
        sc.close();
    }
}
