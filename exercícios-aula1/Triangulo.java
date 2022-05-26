import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float angulo1, angulo2, angulo3;

        System.out.println("Digite o valor de um angulo:");
        angulo1 = leitor.nextInt();

        if(angulo1 >= 180){
            System.out.println("Digite o valor de um angulo valido!");
            angulo1 = leitor.nextInt();
        }  

        System.out.println("Digite o valor de um outro angulo:");
        angulo2 = leitor.nextInt();
    
        if(angulo2>=180){
            System.out.println("Digite o valor de um angulo valido!");
            angulo2 = leitor.nextInt();    
        } 
        leitor.close();
        
        angulo3 = (angulo1 + angulo2 - 180) * -1;
        System.out.println("Seu terceiro angulo é: " + angulo3);
    }
}
