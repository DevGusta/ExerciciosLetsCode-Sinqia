package ListaQuatro.QuestaoSete;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[5];

        pessoas[0] = new Pessoa("Gustavo", 18);
        pessoas[1] = new Pessoa("Felipe", 23);
        pessoas[2] = new Pessoa("Melissa", 16);
        pessoas[3] = new Pessoa("Daniela", 20);
        pessoas[4] = new Pessoa("Fernado", 32);

        Pessoa menor, maior;
        int media = 0;

        menor = maior = pessoas[0];

        for (Pessoa pessoa : pessoas) {
            if (menor.getIdade() > pessoa.getIdade())
                menor = pessoa;

            if (maior.getIdade() < pessoa.getIdade())
                maior = pessoa;

            media += pessoa.getIdade();
        }

        media = media/ pessoas.length;

        System.out.println("Pessoa mais nova: " + menor.toString());
        System.out.println("Pessoa mais velha: " + maior.toString());
        System.out.println("Média de idades: " + media + " anos");
    }
}
