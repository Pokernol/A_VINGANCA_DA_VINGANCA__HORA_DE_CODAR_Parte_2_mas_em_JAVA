package com.company;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        int n1, n2, n3, n4, maior;

        Scanner in = new Scanner(System.in);
        System.out.println("Olá! Hoje vamos com fazer comparações de 4 numeros, será apresentado o primeiro, o ultimo e o maior numero\n");

        System.out.println("Informe o 1º numero: ");
        n1 = in.nextInt();
        System.out.println("Informe o 2º numero: ");
        n2 = in.nextInt();
        System.out.println("Informe o 3º numero: ");
        n3 = in.nextInt();
        System.out.println("Informe o 4º numero: ");
        n4 = in.nextInt();

        if (n1 > n2 && n1 > n3 && n1 > n4){
            maior = n1;
        }else if (n2 > n1 && n2 > n3 && n2 > n4){
            maior = n2;
        }else if (n3 > n1 && n3 > n2 && n3 > n4){
            maior = n3;
        }else{
            maior = n4;
        }
        System.out.printf("O primeiro número informado foi %d o ultimo foi %d e o maior foi %d", n1, n4, maior);
    }
}
