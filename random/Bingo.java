/* Fazer um mini sistema de bingo para registrar o nome de 7 pessoas 
e sortear um nome para ganhar (use a classe Random ).*/

import java.util.Scanner;
import java.util.Random;

public class Bingo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        int i = 0;
        String[] nomes = new String[7];

        for (i = 0; i < nomes.length; i++) {
            System.out.println("Registre um jogador:");
            nomes[i] = leitor.nextLine();
        }

        int aleatorio = random.nextInt(7);

        System.out.println("O nome sorteado é: " + nomes[aleatorio]);

        leitor.close();
    }

}