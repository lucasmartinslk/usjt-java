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
public class exercicio15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int NotaZero = 0;
        int NotaBoa = 0;
        float Media;
        float n1;
        float n2;
        float n3;
        float n4;
        float n5;
        float n6;
        float n7;
        float n8;
        float n9;
        float n11;
        
        System.out.print("Digite a nota do aluno 1 : ");
        n1 = sc.nextFloat();
        if (n1 == 0){
            NotaZero++;
        } else if (n1 > 8){
            NotaBoa++;
        }
        
        System.out.print("Digite a nota do aluno 2 : ");
        n2 = sc.nextFloat();
        if (n2 == 0){
            NotaZero++;
        } else if (n2 > 8){
            NotaBoa++;
        }
        
        System.out.print("Digite a nota do aluno 3 : ");
        n3 = sc.nextFloat();
        if (n3 == 0){
            NotaZero++;
        } else if (n3 > 8){
            NotaBoa++;
        }
        
        System.out.print("Digite a nota do aluno 4 : ");
        n4 = sc.nextFloat();
        if (n4 == 0){
            NotaZero++;
        } else if (n4 > 8){
            NotaBoa++;
        }
        
        System.out.print("Digite a nota do aluno 5 : ");
        n5 = sc.nextFloat();
        if (n5 == 0){
            NotaZero++;
        } else if (n5 > 8){
            NotaBoa++;
        }
        
        System.out.print("Digite a nota do aluno 6 : ");
        n6 = sc.nextFloat();
        if (n6 == 0){
            NotaZero++;
        } else if (n6 > 8){
            NotaBoa++;
        }
        
        System.out.print("Digite a nota do aluno 7 : ");
        n7 = sc.nextFloat();
        if (n7 == 0){
            NotaZero++;
        } else if (n7 > 8){
            NotaBoa++;
        }
        
        System.out.print("Digite a nota do aluno 8 : ");
        n8 = sc.nextFloat();
        if (n8 == 0){
            NotaZero++;
        } else if (n8 > 8){
            NotaBoa++;
        }
        
        System.out.print("Digite a nota do aluno 9 : ");
        n9 = sc.nextFloat();
        if (n9 == 0){
            NotaZero++;
        } else if (n9 > 8){
            NotaBoa++;
        }
        
        System.out.print("Digite a nota do aluno 10 : ");
        n11 = sc.nextFloat();
        if (n11 == 0){
            NotaZero++;
        } else if (n11 > 8){
            NotaBoa++;
        }
        
        Media = ((n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n11) / 10);
        
        if (Media >= 6 ){
            System.out.print("A media da turma foi de " + Media + " A quantidade de alunos com nota acima de 8 é " + NotaBoa);
        } else {
            System.out.print("A media da turma foi de " + Media + " A quantidade de alunos com zero foi de " + NotaZero);
        }                
                
    sc.close();    
    }
    
}
