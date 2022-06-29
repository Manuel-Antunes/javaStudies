/* Receber 5 números inteiros de um array A e inverter a ordem dos valores equivalentes em um array B. */

import java.util.Scanner;

public class Inverte {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int i = 0;
        int[] numero = new int[5];

        for (i=0; i < numero.length; i++){
            System.out.println("Digite 5 números inteiros:");
            numero[i] = leitor.nextInt();
        }
        

    }
}