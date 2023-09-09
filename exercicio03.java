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
public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Digite um valor 1 : ");
        int valor = sc.nextInt();
        
        System.out.println("Digite um valor 2 : ");
        int valor2 = sc.nextInt();
        
        if (valor > valor2){
            System.out.print("Valor 1 é maior que Valor 2 !");            
        } else {
            System.out.print(" Valor 2 é maior que valor 1 !");
        }
        sc.close();
    }
}
