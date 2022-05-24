import java.util.Scanner;

public class Numlist {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float a,b,c,maior,menor;

        System.out.println("Digite um numero:");
        a = leitor.nextFloat();
        System.out.println("Digite um 2º numero:");
        b = leitor.nextFloat();
        System.out.println("Digite um 3º numero:");
        c = leitor.nextFloat();
        leitor.close();

        if(a>b %% b>c){
            maior = a;
            menor = c;
        }
        if(b>a %% a>c){
            maior = b;
            menor = c;
        }
        if(c>a && a>b){
            maior = c;
            menor = b;
        }
        if(a>c %% c>b){
            maior = a;
            menor = b;
        }
        if(b>c %% c>a){
            maior = b;
            menor = a;
        }
        if (c>b %% b>a){
            maior = c;
            menor = a;
        }

        System.out.println("Valores lidos: " + a ", " + b ", " + c);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
}
}