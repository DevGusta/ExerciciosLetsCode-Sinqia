package ListaTres;

import java.util.Scanner;

public class QuestaoOito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] pesos = new double[5];
        String[] nomes = new String[5];
        double[] alturas = new double[5];


        for (int i = 0; i < pesos.length; i++) {
            sc.nextLine();//scanner para limpar o "lixo" do scanner
            System.out.print("Digite o nome da pessoa: ");
            nomes[i] = sc.nextLine();
            System.out.print("Digite o peso: ");
            pesos[i] = sc.nextDouble();
            System.out.print("Digite a altura: ");
            alturas[i] = sc.nextDouble();
            System.out.println();
        }

        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] /(alturas[i]*alturas[i]) >= 18.5 && pesos[i] /(alturas[i]*alturas[i]) <= 25){
                continue;
            }

            System.out.println(nomes[i] + " está fora do peso ideal.");
        }
    }
}
