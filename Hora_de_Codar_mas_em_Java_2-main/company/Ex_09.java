package com.company;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        //Motorista Taxi
        //gasolina 2.90

        double kmInicio, kmFim, gas = 2.90, liGasto, kmGeral, corrida;
        double gasto, lucro;

        Scanner in = new Scanner(System.in);

        System.out.println("Olá! hoje vamos ver um rendimento de um taxista com seu carro na praça?\n");
        System.out.println("Informe a marcação do Odometro no inicio do Expediente: ");
        kmInicio = in.nextDouble();
        System.out.println("Informe a marcação do Odometro no fim do Expediente: ");
        kmFim = in.nextDouble();
        System.out.println("Informe a quantidade de litros de combustivel gasto: ");
        liGasto = in.nextDouble();
        System.out.println("Informe o valor total recebido das corridas");
        corrida = in.nextDouble();

        gasto = gas * liGasto;
        kmGeral = (kmFim - kmInicio);
        lucro = (corrida - gasto);
        System.out.printf("O motorista rodou %.1f Kilometros, gastou R$ %.2f em gasolina e lucrou R$ %.2f .",kmGeral, gasto,lucro);
        //System.out.println("Seu gasto foi de R$ "+gasto);
        //System.out.println("Seu lucro foi de aproximadamente R$: "+lucro);
    }
}