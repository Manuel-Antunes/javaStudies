/* Receber 5 números inteiros aleatórios de um array A e ordená-los em ordem crescente em um array B. */
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int i = 0;
        int j = 1;
        int maior = 0;

        int[] numeros = new int[5];
        for (i=0; i < numeros.length; i++){
            System.out.println("Digite 5 números:");
            numeros[i] = leitor.nextInt();
        }
        leitor.close();

        int[] crescente = new int[5];        
        for (i=0; i < numeros.length; i++){
            for (j = 1; j < numeros.length; j++){
                if (numeros[j]>numeros[i]){
                crescente[i] = maior; 
                }  
            }
        }

        for(i=0; i<numeros.length;i++){
            System.out.println(numeros[i] + " " + crescente[i]);
        }
    }
}


