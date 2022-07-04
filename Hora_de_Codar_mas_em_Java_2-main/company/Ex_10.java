package com.company;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        double tamPista, gasConsu, circuitoTotalKm, litroMin, litroTotal;
        int reabas, numVolta;
        Scanner in = new Scanner(System.in);
        System.out.println("Olá! hoje vamos calcular o valor mínimo de litros necessários para um carro da mercendes percorrer até o primeiro reabastecimento de uma pista!\n");

        System.out.println("Informe o tamanho da pista em metros: ");
        tamPista = in.nextDouble();
        System.out.println("Informe a quantidade de voltas: ");
        numVolta = in.nextInt();
        System.out.println("Informe a quantidade desejada de reabastecimentos");
        reabas = in.nextInt();
        System.out.println("Informe o consumo de combustivel do carro");
        gasConsu = in.nextDouble();

        circuitoTotalKm = (tamPista * numVolta) / 1000;
        litroMin = (circuitoTotalKm / reabas) / gasConsu;
        litroTotal = circuitoTotalKm / gasConsu;

        System.out.println("Mínimo de litros para a 1º parada: "+ litroMin);
        System.out.println("Tamanho do Circuito: "+circuitoTotalKm+" Km");
        System.out.println("Total litros necessários: "+ litroTotal);

    }
}
