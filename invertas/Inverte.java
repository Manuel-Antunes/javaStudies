/* Receber 5 números inteiros de um array A e inverter a ordem dos valores equivalentes em um array B. */
public class Inverte {
    public static void main(String[] args) {
       
        int i = 0;
    
        int[] numero = new int[5];
        int[] invertida = new int[5];

        numero [0] = 1;
        numero [1] = 2;
        numero [2] = 3;
        numero [3] = 4;
        numero [4] = 5;

        for (i=0; i < numero.length; i++){
            invertida[4 - i] = numero[i];
        }
        
        for (i=0; i < numero.length; i++){
            System.out.println(numero[i] + " " + invertida[i]);
        }    
    }
}
