package com.company;

import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        int maca;
        double valor = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Olá! Vamos dizer que você foi comprar maçãs e a unidade é o valor de R$0,30, a uma promoção que quando você compra 12 unidades para mais o valor de cada unidade fica de R$0,25.\nInforme a quantidade de maças que você irá comprar: ");
        maca = in.nextInt();
        if (maca >= 1 && maca < 12){
            valor = maca * 0.30;
            System.out.printf("Menos de 12, suas maças saem por 0.30 centavos cada, o total da suas compra deu %.2f", valor);
        }else{
            valor = maca * 0.25;
            System.out.printf("Mais de 12, suas maças saem por 0.25 centavos cada, o total da sua compra deu: %.2f", valor);
        }
    }
}
