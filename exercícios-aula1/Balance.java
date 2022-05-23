import java.util.Scanner;

public class Balance {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float peso, pesoMais, pesoMenos;
        
        System.out.println("Digite o seu peso");
        peso = leitor.nextInt();
        leitor.close();

        pesoMais = peso + peso * 15/100;
        pesoMenos = peso - peso * 20/100;

        System.out.println("Caso emagreça 20%, seu peso seria: " + pesoMenos + ". E caso engorde 15%, seu peso seria: " + pesoMais);
    }










}