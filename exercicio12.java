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
public class exercicio12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
          
        System.out.print("Digite um valor inteiro de 4 digitos:  ");
        int valor = sc.nextInt();
        int primeiro = valor/1000;
        int segundo = (valor/100) % 10;
        int terceiro = (valor/10) % 10;
        int quarto = (valor % 10);

        if ((primeiro == 8 || primeiro == 5) && (quarto == 5 || quarto == 1)) {
            System.out.print("Senha válida!!!");
        } else {
            System.out.print("Senha inválida!!!");
        }
        

    sc.close();    
    }
    
}