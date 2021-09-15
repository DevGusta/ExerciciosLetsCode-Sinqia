package Exercicios03;/*
Escreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.
*/

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;

        System.out.print("Digite uma palavra: ");
        palavra = sc.next();

        for (int i = 1; i <= palavra.length(); i++) {
            if (i % 2 == 1) {
                System.out.print(palavra.toUpperCase().charAt(i - 1));
                continue;
            }
            System.out.print(palavra.charAt(i - 1));
        }
    }
}
