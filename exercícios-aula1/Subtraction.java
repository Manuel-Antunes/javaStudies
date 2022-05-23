import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float A,B,maior,menor,res;
        
        System.out.println("Digite um valor:");
        A = leitor.nextInt();
        System.out.println("Digite outro valor:");
        B = leitor.nextInt();
        leitor.close();

        if (A>B){
            maior = A;
            menor = B;
        } else {
            maior = B;  
            menor = A;
        }

        res = maior - menor;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Diferença do maior pelo menor:" + res);
    }
}
