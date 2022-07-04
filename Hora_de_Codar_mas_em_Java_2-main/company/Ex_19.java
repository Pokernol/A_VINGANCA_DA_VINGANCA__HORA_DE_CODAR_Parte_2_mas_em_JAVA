package com.company;

import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {
        double vParcelas = 0;
        int p;
        Scanner in = new Scanner(System.in);
        System.out.println("Olá usúario! vamos calcular o valos de parcelas de uma promoção onde cada capacete artesanal para tartaruga custa R$18.230 e pode ser pago em até 15 vezes sem juros.\nInforme em quantas parcelas deseja pagar:  ");
        p = in.nextInt();

        if (p > 15){
            System.out.println("O limite de parcelas é 15!");
        }
        else {
            vParcelas = 18.230 / p;
        }
        System.out.printf("O valor de parcelas vai ser de %d vezes, e você irá pagar o valor aproximado de R$ %.3f por mes.", p, vParcelas);
    }
}
