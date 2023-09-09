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
public class exercicio11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Digite código do estado de 1 a 5: ");
        int opcao1 = sc.nextInt();
        System.out.println("Qual valor da carga : ");
        float opcao2 = sc.nextFloat();
        float finall;

        switch (opcao1) {
            case 1,3,4:                
                finall = (opcao2 + (opcao2 * 15)/ 100);
                System.out.println("Valor final da carga será : " + finall);
                break;
            case 2,5:
                finall = (opcao2 + (opcao2 * 15)/ 100);
                System.out.println("Valor final da carga será : " + finall);
                break;
            default:
                System.out.println("Valor divergente");
                break;
        }        
        sc.close();
    }
}
