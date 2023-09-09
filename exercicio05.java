/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudos;

import java.util.Scanner;
/**
 * @author skate
 */

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Digite um valor 1 : ");
        float valor = sc.nextFloat();
        
        System.out.println("Digite um valor 2 : ");
        float valor2 = sc.nextFloat();
        
        System.out.println("Digite um valor 3 : ");
        float valor3 = sc.nextFloat();
        
        System.out.println("Soma dos valores: "+valor + valor2 + valor3);
        System.out.println("Media dos valores: "+(valor + valor2 + valor3)/3);
        System.out.println("Produto dos valores: "+valor * valor2 * valor3);
        
        if (valor < valor2 && valor < valor3){
            System.out.println("Menor numero: " + valor);
        } else if (valor2 < valor && valor2 < valor3){
            System.out.println("Menor numero: " + valor2);
        } else {
            System.out.println("Menor numero: " + valor3);
        }        
        
        
        if (valor > valor2 && valor > valor2) {
            System.out.println("maior numero: " + valor);
        } else if (valor2 > valor && valor2 > valor3) {
            System.out.println("maior numero: " + valor2);
        }
          else {
            System.out.println("maior numero: " + valor3);
        }
        sc.close();
    }
}
