package com.company;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        int lados;
        double per, med;

        Scanner in = new Scanner(System.in);
        System.out.println("Olá usuario! vamos falar sobre polígonos, para começar informe quantos lados tem o polígono que deseja ser mostrado:");
        lados = in.nextInt();
        System.out.println("Informe a medida em cm: ");
        med = in.nextDouble();

        if(lados == 3){
            per = 3 * med;
            System.out.println("TRIANGULO de Perímetro: "+ per);
        }else if (lados == 4) {
            per = 4 * med;
            System.out.println("QUADRADO de Perímetro: " + per);
        }else if(lados == 5){
            per = 5 * med;
            System.out.println("PENTÁGONO de Perímetro: "+ per);
        }else if(lados < 3){
            System.out.println("ISSO NÃO É UM POLÍGONO, tente algo com mais lados");
        }else{
            System.out.println("POLÍGONO NÃO IDENTIFICADO, tente algo com menos lados");
        }
    }
}
