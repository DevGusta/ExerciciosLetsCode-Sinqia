package Exercicios03;/*
Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final da entrada dos 5
itens, exiba a lista completa.
 */

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] carrinhoCompras = new String[5];

        for (int i = 0; i < carrinhoCompras.length; i++) {
            System.out.print("Coloque uma fruta no carrinho de compras: ");
            carrinhoCompras[i] = sc.nextLine();
        }

        System.out.println("Carrinho de compras:");
        for (String carrinhoCompra : carrinhoCompras) {
            System.out.println(carrinhoCompra);
        }
    }
}
