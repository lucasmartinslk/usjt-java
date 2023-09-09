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
public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Digite um valor inteiro: ");
        int valor = sc.nextInt();
        
        System.out.println("Digite um numero real: ");
        float valor2 = sc.nextFloat();
        
        if (valor < valor2){
            System.out.print("Valor real é maior que o valor inteiro!");            
        }
        sc.close();
    }
}
