package ListaTres;/*
Escreva um programa que lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os pares.
 */

import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        for (int numero : numeros) {
            if (numero % 2 == 1)
                System.out.println(numero);
        }

        for (int numero : numeros) {
            if (numero % 2 == 0)
                System.out.println(numero);
        }
    }
}
