package atividadesDesafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        System.out.println("Qual é a sua idade em anos?");
        x = entrada.nextInt();

        System.out.println("Sua idade em anos: " + x);
        System.out.println("Sua idade em meses: " + x * 12);
        System.out.println("Sua idade em dias: " + x * 365);
    }
}
