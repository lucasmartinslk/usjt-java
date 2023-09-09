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
public class exercicio13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
          
        System.out.print("Digite um valor inteiro : ");
        int valor = sc.nextInt();
        System.out.print("Digite um segundo valor inteiro: ");
        int valor2 = sc.nextInt();
        if (valor == valor2){
            System.out.print("Valores repetidos!!! ERRO ");
        } else {
            System.out.print("Digite um terceiro valor inteiro : ");
            int valor3 = sc.nextInt();
            if (valor3 == valor2 || valor3 == valor){
                System.out.print("Valores repetidos!!! ERRO ");
            } else {
                if (valor > valor2 && valor > valor3){
                    if (valor2 > valor3){
                        System.out.print(valor +" "+ valor2 +" "+ valor3);
                    } else {
                        System.out.print(valor +" "+ valor3 +" "+ valor2);
                    }
                }
                
                if (valor2 > valor && valor2 > valor3){
                    if (valor > valor3){
                        System.out.print(valor2 +" "+ valor +" "+ valor3);
                    } else {
                        System.out.print(valor2 +" "+ valor3 +" "+ valor2);
                    }
                }
                
                if (valor3 > valor2 && valor3 > valor){
                    if (valor2 > valor){
                        System.out.print(valor3 +" "+ valor2 +" "+ valor);
                    } else {
                        System.out.print(valor3 +" "+ valor +" "+ valor2);
                    }
                }
            }
        }      


    sc.close();    
    }
    
}