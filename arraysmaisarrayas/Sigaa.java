        /* Criar um mini sistema de desempenho escolar que leia as notas dos 4 bimestre de 1 aluno de 1 matéria.
        Exibir a maior nota e em qual etapa ela aconteceu.
        A média das notas.
        Se ele foi aprovado (ter a média geral maior ou igual a 6).*/
        
import java.util.Scanner;

public class Sigaa {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double[] notas = new double[4];
        
        notas [0] = 7.50;
        notas [1] = 9.00;
        notas [2] = 8.00;
        notas [3] = 6.75;
        
        double soma = 0;
        int i = 0;
        int bime = 0;
        double maior = 0;
        String result;

        System.out.println("Digite o bimestre em que deseja consultar nota:");
        bime = leitor.nextInt();

        for (i = 0; i < notas.length; i++){
            soma = soma + notas[i];   
        }

        for (i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }

        double media = soma / notas.length;

        if(notas[bime -1]>= 6){
            result = "Aprovado";
        } else {
            result = "Reprovado";
        }

        System.out.println("Nota: " + notas[bime -1]);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + result);
        System.out.println("Maior nota: " + maior);

        leitor.close();
    }
}