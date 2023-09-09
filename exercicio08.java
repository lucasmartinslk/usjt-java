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
public class exercicio08 {
    public static void main(String[] args) {
        float altura;
        float peso;
        double imc;
        
        Scanner sc = new Scanner(System.in);
          
        System.out.print("Digite sua altura: ");
        altura = sc.nextFloat();
        System.out.print("Didite seu peso: ");
        peso = sc.nextFloat();
        
        imc = (peso / Math.pow(altura, 2));
        
        if (imc < 18.5){
            System.out.print("Peso abaixo do ideal imc: " + imc);
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.print("Peso perfeito, parabens imc: " + imc);
        } else if (imc > 25 && imc < 29.9) {
            System.out.print("Sobrepeso regime de leve. imc: " + imc);
        } else if (imc > 30 && imc < 34.9) {
            System.out.print("Obesidade leve imc: " + imc);
        } else if (imc > 35 && imc < 39.9) {
            System.out.print("Obesidade moderada imc: " + imc);
        } else {
            System.out.println("Obesidade Morbida ja era: "+ imc);
        }
    sc.close();    
    }
}
