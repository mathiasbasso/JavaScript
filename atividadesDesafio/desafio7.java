
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int escolha;
        int escolha1, escolha2, escolha3;
        System.out.println("Digite 1 pra pedestre ou 2 para motorista:");
        escolha = entrada.nextInt();
        System.out.println("Respoda todas as perguntas com 1 para sim e 2 para nao.");
        if (escolha == 1) {
            System.out.println("Você está na faixa de pedestres? ");
            escolha1 = entrada.nextInt();
            System.out.println("O sinal está aberto para pedestre? ");
            escolha2 = entrada.nextInt();
            if (escolha1 == 1 && escolha2 == 1) {
                System.out.println("Show de bola, parabéns");
            } else {
                System.out.println("Você ja vai moorrrreerr");
            }
        } else {
            System.out.println("Está usando cinto? ");
            escolha1 = entrada.nextInt();
            System.out.println("Bebeu alguma bebida alcoólica? ");
            escolha2 = entrada.nextInt();
            System.out.println("O semáforo (para carros), está verde? ");
            escolha3 = entrada.nextInt();
            if (escolha1 == 1 && escolha2 == 2 && escolha3 == 1) {
                System.out.println("Show de bola, parabéns");
            } else {
                System.out.println("Você ja vai moorrrreerr");
            }

        }

    }

}
