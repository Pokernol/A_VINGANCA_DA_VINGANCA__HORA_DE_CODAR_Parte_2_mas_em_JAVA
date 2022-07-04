package com.company;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {
        int prova_1, prova_2, media;
        Scanner in = new Scanner(System.in);
        System.out.println("Olá usúario! vamos calcular sua media com base em duas provas propostas e ver se você foi aprovado, reprovado ou se irá ficar de recuperação \"em exame\" \nDigite a nota da primeira prova:");
        prova_1 = in.nextInt();
        System.out.println("Digite a nota da segunda prova:");
        prova_2 = in.nextInt();

        media = prova_1 + prova_2;

        if (media >= 6) {
            System.out.println("Parabens, sua media foi de " + media + ". Você foi APROVADO");
        } else if (media < 3) {
            System.out.println("Que pena, sua media foi de " + media + ". Você foi REPROVADO");
        } else if (media >= 3 && media < 6 ) {
            System.out.println("Sua media foi de " + media + ". Você ficou de EXAME e terá que fazer a prova optativa, caso contrario será reprovado");
        }
    }
}
