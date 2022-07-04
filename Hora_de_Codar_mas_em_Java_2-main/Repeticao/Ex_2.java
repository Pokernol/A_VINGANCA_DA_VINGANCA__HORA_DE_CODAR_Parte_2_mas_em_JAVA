package Repeticao;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        int n=0, maior = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Olá usuário, vamos comparar hoje 3 numeros informado por você e ver qual deles é o maior\n");
        for (int i = 1; i <= 3; i++){
            System.out.printf("Informe o %dº numero", i);
            n = in.nextInt();
            if (n > maior){
                maior = n;
            }
        }
        System.out.println("O maior numero informado é: " + maior);
    }
}
