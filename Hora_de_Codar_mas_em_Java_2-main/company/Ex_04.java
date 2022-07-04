package com.company;

import java.util.*;

public class Ex_04 {
    public static void main(String[] args) {
        int soma = 0, num, media = 0;
        Scanner in = new Scanner(System.in);
        List<String> numeros = new ArrayList<String>();
        System.out.printf("Olá Usuário, hoje vamos pedir que você digite 10 numeros para mostrar o valor da soma e a media deles, vamos começar!\n");
        for (int i = 1; i <= 10; i++){
            System.out.printf("Informe o %dº numero: ", i);
            num = in.nextInt();
            soma += num;
            media = (soma) / 10;
            numeros.add(String.valueOf(num));
        }
        System.out.printf("Os numeros digitados foram:" +numeros+ "\nA soma dos números é: %d \nE a média é: %d", soma, media);
    }
}
