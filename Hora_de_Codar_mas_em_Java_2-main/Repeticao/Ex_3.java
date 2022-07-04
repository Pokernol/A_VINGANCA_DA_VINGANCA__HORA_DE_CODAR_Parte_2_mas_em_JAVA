package Repeticao;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        int n1, n2, n3, soma = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Vamos comparar os Numeros e saber qual deles é o maior e somar os 2 maiores?\n");
        System.out.println("Informe o 1º numero: ");
        n1 = in.nextInt();
        System.out.println("Informe o 2º numero: ");
        n2 = in.nextInt();
        System.out.println("Informe o 3º numero");
        n3 = in.nextInt();
        while(n2 == n1 || n3 == n1 || n3 == n2){
            System.out.println("Por favor, Informe 3 numeros diferentes");
            System.out.println("Informe o 1º numero: ");
            n1 = in.nextInt();
            System.out.println("Informe o 2º numero: ");
            n2 = in.nextInt();
            System.out.println("Informe o 3º numero");
            n3 = in.nextInt();
        }
        if (n1 > n2 && n1 > n3){
            if (n2 > n3){
                soma = n1 + n2;
            }else{
                soma = n1 + n3;
            }
        }else if(n2 > n1 && n2 > n3){
            if (n1 > n3){
                soma = n1 + n2;
            }else{
                soma = n1 + n3;
            }
        }else{
            if (n1 > n2){
                soma = n3 + n1;
            }else{
                soma = n3 + n2;
            }
        }
        System.out.println("A soma dos 2 maiores é: " + soma);
    }
}
