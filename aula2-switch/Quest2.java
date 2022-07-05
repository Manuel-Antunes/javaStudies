import java.util.Scanner;

public class Quest2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int anoCasamento;
        int anoAtual;
        int bodas;
        
        System.out.println("Digite o ano de seu casamento:");
        anoCasamento = leitor.nextInt();
        System.out.println("Agora digite o ano atual:");
        anoAtual = leitor.nextInt();

        bodas = anoAtual - anoCasamento;

        if(bodas <= -1){
            System.out.println("Digite uma data válida!");
        }

        switch(bodas) {
            case 25:
            System.out.println("Bodas de Prata");
            break;
            case 50:
            System.out.println("Bodas de Ouro");
            break;
            case 60:
            System.out.println("Bodas de Diamante");
            break;
            default:
            System.out.println(bodas);
        }
        leitor.close();
    }
}