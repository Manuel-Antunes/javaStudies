/*Receber do usuário 7 números inteiros e armazenar em um array A. 
Criar outro array B que receba o dobro do valor das posições equivalentes de A. */

import java.util.Scanner;

public class Dobro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int i = 0;
        int[] numeros = new int[7];

        for (i = 0; i < numeros.length; i++){
            System.out.println("Escolha 7 números inteiros:");
            numeros[i] = leitor.nextInt(); 
        }

        leitor.close();
        
        int[] numDobrados = new int[7];

        for (i = 0; i < numeros.length; i++){
            numDobrados[i] = numeros[i] * 2;
        }      
        
        for (i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + " " + numDobrados[i]);
        }
    }
}