package ListaQuatro.QuestaoOito;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[5];

        pessoas[0] = new Pessoa("Gustavo", 60, 1.73);
        pessoas[1] = new Pessoa("Felipe", 90, 1.78);
        pessoas[2] = new Pessoa("Melissa", 55, 1.60);
        pessoas[3] = new Pessoa("Daniela", 56, 1.68);
        pessoas[4] = new Pessoa("Fernado", 85, 1.70);


        for (Pessoa pessoa : pessoas) {
            if (pessoa.calculaIMC() < 18.5 || pessoa.calculaIMC() > 25)
                System.out.println(pessoa.getNome() + " está fora do peso ideal.");
        }
    }
}
