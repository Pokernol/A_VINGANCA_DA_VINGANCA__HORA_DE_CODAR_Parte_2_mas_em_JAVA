package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        int n , soma = 0;
        List<String> num = new ArrayList<String>();
        Scanner in = new Scanner(System.in);

        System.out.printf("Olá usuário, hoje vamos somar os 10 numeros digitados por você, vamos começar!\n");
        for (int i = 1; i <= 10; i++){
            System.out.printf("Informe o %dº numero: ", i);
            n = in.nextInt();
            soma += n;
            num.add(String.valueOf(n));
        }
        System.out.printf("Os numeros digitados foram" +num+ "\nE a soma dos números informados é %d", soma);
    }
}
