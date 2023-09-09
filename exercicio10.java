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
public class exercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("1 – Misto quente R$5,50");
        System.out.println("2 – Salada Chinesa R$10,20");
        System.out.println("3 – Suco de Laranja R$4,00");
        System.out.println("4 – Suco de Manga R$3,50");   
        
        System.out.println("Escolha uma opção : ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("bom apetite,vai lhe custar: R$5,50");
                break;
            case 2:
                System.out.println("bom apetite,vai lhe custar: R$10,20");
                break;
            case 3:
                System.out.println("tenha um excelente drink, vai lhe custar: 4,00");
                break;
            case 4:
                System.out.println("tenha um excelente drink, vai lhe custar: 3,50");
                break;
            default:
                System.out.println("Erro, opcão inválida");
                break;
        }        
        sc.close();
    }
}
