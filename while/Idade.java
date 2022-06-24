import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;

        do {
            System.out.println("Digite sua idade:");
            idade = leitor.nextInt(); 
                if (idade <18) {
                System.out.println("Você não pode acessar este programa");
                } else {
                System.out.println("Tudo certo! Entrando no sistema...");   
                }
            } while (idade<18);
        leitor.close();
    }
}
