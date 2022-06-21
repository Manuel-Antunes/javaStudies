import java.util.Scanner;

public class Quest1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número de 1 a 7:");
        numero = leitor.nextInt();

        if(numero>7 || numero <1){
            System.out.println("Digite um número entre 1 e 7...");
        }

        switch (numero) {
            case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Segunda");
            break;
            case 3:
            System.out.println("Terça");
            break;
            case 4:
            System.out.println("Quarta");
            break;
            case 5:
            System.out.println("Quinta");
            break;
            case 6:
            System.out.println("Sexta");
            break;
            case 7:
            System.out.println("Sábado");
            break;
        }
        leitor.close();
    }
}