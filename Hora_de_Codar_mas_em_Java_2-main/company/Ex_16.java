package com.company;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        int g, i;

        Scanner in = new Scanner(System.in);

        System.out.println("Olá usúario! Os times Grêmio e Inter vão se enfrentar em mais um \"GRENAL\", escreva o número de gols que cada time marcou.\nInforme os gols do Grêmio: ");
        g = in.nextInt();
        System.out.println("Informe os gols do Inter: ");
        i = in.nextInt();

        if (g == i){
            System.out.println("EMPATE");
        }else if(g > i){
            System.out.println("GRÊMIO GANHOU!");
        }else{
            System.out.println("INTER GANHOU!");
        }
    }
}
