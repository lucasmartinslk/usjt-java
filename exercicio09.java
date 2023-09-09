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
public class exercicio09 {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        double media;
        
        Scanner sc = new Scanner(System.in);
          
        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextFloat();
        
        media = ((nota1 + nota2)/2);
        
        if (media >= 9){
            System.out.print("Parabens aprovado, nota : " + media);
        } else if (media >= 7 && media < 9) {
            System.out.print("Aprovado, nota : " + media);
        } else if (media >= 6 && media < 7) {
            System.out.print("Aprovado no limite estude mais, nota : " + media);
        } else if (media >= 2 && media < 6) {
            System.out.print("Reprovado com segunda chance, nota : " + media);
        } else {
            System.out.println("Reprovado, nota: "+ media);
        }
    sc.close();    
    }
    
}
