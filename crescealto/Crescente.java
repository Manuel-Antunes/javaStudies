/* Receber 5 números inteiros aleatórios de um array A e ordená-los em ordem crescente em um array B. */
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int i = 0;
        int j = 0;
        int aux = 0;

        int[] numeros = new int[5];
        for (i=0; i < numeros.length; i++){
            System.out.println("Digite 5 números:");
            numeros[i] = leitor.nextInt();
        }

        int[] crescente = new int[5];

        for(i = 0; i<5; i++){
            crescente[i] = numeros[i];
        }

        for(i = 0; i<5; i++){
            for(j = 0; j<4; j++){
                if(crescente[j] > crescente[j + 1]){
                    aux = crescente[j];
                    crescente[j] = crescente[j+1];
                    crescente[j+1] = aux;
                }
            }
        }

        for(i=0; i<numeros.length;i++){
            System.out.println(numeros[i] + " " + crescente[i]);
        }
        leitor.close();
    }
}


