import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número de 100 a 105");
        numero = leitor.nextInt();

        switch(numero) {
            case 100:
            System.out.println("Seu cachorro-quente custará R$ 1,70");
            break;
            case 101:
            System.out.println("Seu bauru simples custará R$ 2,30");
            break;
            case 102:
            System.out.println("Seu bauru com ovo custará R$ 2,60");
            break;
            case 103:
            System.out.println("Seu hamburguer custará R$ 2,40");
            break;
            case 104:
            System.out.println("Seu cheeseburguer custará R$ 2,50");
            break;
            case 105:
            System.out.println("Seu refrigerante custará R$ 1,00");
            break;
            default:
            System.out.println("Digite um número válido!");
        }
        leitor.close(); 
    }   
}
