package Exercicios03;/*
Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados. Ao final, informe qual o
nome mais longo presente na lista.
*/

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] convidados = new String[5];

        for (int i = 0; i < convidados.length; i++) {
            System.out.print("Digite o nome do convidado: ");
            convidados[i] = sc.nextLine();
        }

        String maior = convidados[0];

        for (String nome : convidados) {
            if (nome.length() > maior.length())
                maior = nome;
        }

        System.out.println("Nome mais longo: " + maior);
    }
}
