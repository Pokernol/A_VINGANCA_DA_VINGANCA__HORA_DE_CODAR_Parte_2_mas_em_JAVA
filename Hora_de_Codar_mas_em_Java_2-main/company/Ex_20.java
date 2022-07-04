package com.company;

import java.util.*;

public class Ex_20 {
    public static void main(String[] args) {
        int n, contMaior, contMenor, veriMaior = 0, veriMenor = 0, menor = 0, maior = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Olá usuário! Hoje vamos pedir que informe 20 valores diferentes e no final será informado o maior e o menor valor lido");
        for (int i = 1; i < 20; i++){
            System.out.printf("Informe o %dº numero: ",i);
            n = in.nextInt();

            contMaior = n;
            if (contMaior > veriMaior){
                veriMaior = n;
                maior = veriMaior;
            }else{
                if (veriMaior == 0){
                    veriMaior = n;
                }
            }

            contMenor = n;
            if (contMenor < veriMenor){
                veriMenor = n;
                menor = veriMenor;
            }else{
                if (veriMenor == 0){
                    veriMenor = n;
                    menor = veriMenor;
                }
            }
        }
        System.out.println(maior +" É o maior");
        System.out.println(menor +" É o menor");
    }
}
