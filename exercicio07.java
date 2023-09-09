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
public class exercicio07 {
    public static void main(String[] args) {
        float Desconto;
        float Crediario;
        int Parcela;
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Valor peça da roupa : ");
        float valor = sc.nextFloat();
        
        System.out.println("Digite uma opção: 0 - para compra a vista. 1 - para compra parcelada. 2 - Crediario. ");
        int valor2 = sc.nextInt();

        switch (valor2) {
            case 0:
                Desconto = (valor - ((valor * 10)/100));
                System.out.println("Peça com 10% de desconto: " + Desconto);
                break;
            case 1:
                System.out.println("Quantas parcelas? : ");
                Parcela = sc.nextInt();
                valor = (valor / Parcela);
                System.out.println("Valor total da parcela será de: " + valor);
                break;
            case 2:
                Crediario = ((valor * 10)/100);
                valor = valor + Crediario;
                System.out.println("Qual o valor de parcelas? : ");
                Parcela = sc.nextInt();
                System.out.println("O valor de parcelas com juros de 10% será de : " + (valor/Parcela));
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        
        sc.close();
    }
}
