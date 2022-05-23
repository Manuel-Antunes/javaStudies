import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

            float x,y,reSoma,reSub,reDiv,reMult;
            String nome;  
            
            System.out.println("Antes de comerçar, digite seu nome:");
            nome = leitor.nextLine();

            System.out.println("Digite um número:");
            x = leitor.nextInt();
            System.out.println("Digite outro número:");
            y = leitor.nextInt();

            
            reSoma = x+y;
            reSub = x-y;
            reDiv = x/y;
            reMult = x*y;
            
            System.out.println(nome + ", seus resultados são:");
            System.out.println("Soma: " + reSoma);
            System.out.println("Subtração: " + reSub);
            System.out.println("Divisão: " + reDiv);
            System.out.println("Multiplicação: " + reMult);

    }
}