package com.company;

import java.util.*;

public class Ex_07 {
    public static void main(String[] args) {
        int j = 0, soma = 0;
        List<String> numeros = new ArrayList<String>();
        System.out.printf("Vamos Com 6 numeros diferentes efetuar uma soma de todos eles? porem os numeros que forem digitados terão de ser menor que 72\n");

         Scanner in = new Scanner(System.in);
        for(int i = 1; i <= 6; i++){
            System.out.printf("Informe o %dº numero: ", i);
            j = in.nextInt();
            if(j < 72){
                soma += j;
            }
            numeros.add(String.valueOf(j));
        }
        System.out.printf("A soma dos valores informados menores que 72 é: %d\n", soma);
        System.out.println("Esses são os numeros meros do que 72 que você digitou" + numeros);
    }
}
