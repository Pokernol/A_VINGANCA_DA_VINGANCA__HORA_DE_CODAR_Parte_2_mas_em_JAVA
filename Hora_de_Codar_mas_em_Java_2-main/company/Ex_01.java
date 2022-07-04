package com.company;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        Float n1, n2;

        Scanner in = new Scanner(System.in);
        System.out.println("Olá usuário, hoje vamos comparar dois numeros e dizer qual deles é o maior\n");
        System.out.println("Informe o primeiro número: ");
        n1 = in.nextFloat();
        System.out.println("Informe o segundo número: ");
        n2 = in.nextFloat();


        if (n1 > n2){
            System.out.println(n1 + " Foi o maior número informado");
        }else{
            System.out.println(n2 + " Foi o maior número informado");
        }
    }
}
