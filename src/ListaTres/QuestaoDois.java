package ListaTres;/*
Escreva um programa que lê uma palavra e a escreve de volta ao contrário.
 */

import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;

        System.out.print("Digite uma palavra:");
        palavra = sc.next();

        for (int i = palavra.length() - 1; i >= 0; i--) {
            System.out.print(palavra.charAt(i));
        }
    }
}
