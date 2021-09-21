package ListaTres;

import java.util.Arrays;
import java.util.Scanner;

public class QuestaoSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[5];
        int maisNovo, maisVelho, mediaIdades;
        String[] nomes = new String[5];
        String nomeMaisNovo, nomeMaisVelho;

        for (int i = 0; i < idades.length; i++) {
            sc.nextLine();//scanner para limpar o "lixo" do scanner
            System.out.print("Digite o nome da pessoa: ");
            nomes[i] = sc.nextLine();
            System.out.print("Digite a idade: ");
            idades[i] = sc.nextInt();
        }
        maisNovo = idades[0];
        nomeMaisNovo = nomes[0];
        maisVelho = idades[0];
        nomeMaisVelho = nomes[0];
        mediaIdades = Arrays.stream(idades).sum() / idades.length;

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < maisNovo) {
                maisNovo = idades[i];
                nomeMaisNovo = nomes[i];
            }
            if (idades[i] > maisVelho) {
                maisVelho = idades[i];
                nomeMaisVelho = nomes[i];
            }
        }

        System.out.println("Mais velho: " + nomeMaisVelho + "," + maisVelho + " anos");
        System.out.println("Mais novo: " + nomeMaisNovo + "," + maisNovo + " anos");
        System.out.println("Media de idades: " + mediaIdades + " anos");
    }
}
