package com.company;

import java.util.Scanner;

public class Ex_22 {
    public static void main(String[] args) {
        int op, n1, n2, res=0;
        Scanner in = new Scanner(System.in);

        System.out.println("Olá usuario! vamos efetuar alguns calculos, escolha 2 numeros e o tipo de equação que você irá utilizar\nDigite um numero para equação ");
        n1 = in.nextInt();
        System.out.println("1[Adição],  2[Subtração],  3[Divisão],  4[Multiplicação]");
        op = in.nextInt();
        System.out.println("Informe o segundo numero: ");
        n2 = in.nextInt();
        while(op <= 0 || op > 4){
            System.out.println("ERRO, Informe um numero de '1' a '4' para efetuar uma das equações");
            System.out.println("1[Adição],  2[Subtração],  3[Divisão],  4[Multiplicação]");
            op = in.nextInt();
        }
        switch (op){
            case 1:
                res = n1 + n2;
                System.out.println("o resultado da soma é igual a: " + res);
                break;
            case 2:
                res = n1 - n2;
                System.out.println("o resultado da subtração é igual a: " + res);
                break;
            case 3:
                res = n1 / n2;
                System.out.println("o resultado da divisão é igual a: " + res);
                break;
            case 4:
                res = n1 * n2;
                System.out.println("o resultado da mutiplicação é igual a: " + res);
                break;
        }
    }
}
