package com.company;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        int senha = 1234;

        Scanner in = new Scanner(System.in);

        System.out.println("Olá usuario! digite sua senha de acesso para continuar:");
        senha = in.nextInt();
        while(senha != 1234){
            System.out.println("ACESSO NEGADO! Tente novamente: ");
            senha = in.nextInt();
        }
        if (senha == 1234){
            System.out.println("ACESSO PERMITIDO!");
        }
    }
}
