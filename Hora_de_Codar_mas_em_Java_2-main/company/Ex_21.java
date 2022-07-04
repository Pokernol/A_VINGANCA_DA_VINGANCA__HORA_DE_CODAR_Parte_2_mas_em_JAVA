package com.company;

import java.util.Scanner;

public class Ex_21 {
    public static void main(String[] args) {
        int java1, java2, gira1, gira2, somaJG=0, somaGJ=0;
        //variavel somaJG recebe a soma do Javali mais velho com a Girafa mais nova
        //variavel somaGJ receve a soma da Girafa mais velha com o Javali mais novo
        Scanner in = new Scanner(System.in);
        System.out.println("Ola usuario, escreva a idade de 2 javalis e 2 girafas, será Calculado a soma das idades do javali mais velho com a girafa mais nova\ne o produto das idades do javali mais novo com a girafa mais velha.\n");
        do{
            System.out.println("Não aceito Javalis da mesma idade");
            System.out.println("Informe a idade do Javali 1: ");
            java1 = in.nextInt();
            System.out.println("Informe a idade do Javali 2: ");
            java2 = in.nextInt();
        }while(java1 == java2);
        do{
            System.out.println("Não aceito Girafas da mesma idade");
            System.out.println("Informe a idade da Girafa 1: ");
            gira1 = in.nextInt();
            System.out.println("Informe a idade da Girafa 2: ");
            gira2 = in.nextInt();
        }while(gira1 == gira2);
        //soma javali mais velho com girafa mais nova
        if (java1 > java2){
            if (gira1 < gira2){
                somaJG = java1 + gira1;
            }else{
                somaJG = java1 + gira2;
            }
        }else{
            if (gira1 < gira2){
                somaJG = java1 + gira1;
            }else{
                somaJG = java1 + gira2;
            }
        }
        //Javali mais novo com Girafa mais velha
        if (gira1 > gira2){
            if (java1 < java2){
                somaGJ = gira1 + java1;
            }else{
                somaGJ = gira1 + java2;
            }
        }else{
            if (java1 < java2){
                somaGJ = gira2 + java1;
            }else{
                somaGJ = gira2 + java2;
            }
        }
        System.out.println("A soma das idades do Javali mais velho com a Girafa mais nova é "+somaJG);
        System.out.println("A soma das idades da Girafa mais velha com o Javale mais novo é "+somaGJ);
    }
}
