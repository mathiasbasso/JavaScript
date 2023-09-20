package atividadesDesafio;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Entre com o numero: ");
        numero = entrada.nextInt();
        System.out.println("Sequencia de numeros pares até o número: " + numero);

        for (int i = 0; i <= numero; i += 2) {
            System.out.println(i);
        }

    }

}
