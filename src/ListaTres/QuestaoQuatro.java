package ListaTres;/*
Escreva um programa que lê 5 números e informa o maior, o menor e a média deles.
*/

import java.util.Arrays;
import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int menor, maior, media;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        menor = numeros[0];
        maior = numeros[0];
        media = Arrays.stream(numeros).sum() / numeros.length;

        for (int numero : numeros) {
            if (numero > maior)
                maior = numero;

            if (numero < menor)
                menor = numero;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media);
    }
}
