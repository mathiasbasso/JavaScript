package atividadesDesafio;

public class desafio6 {

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor[] = new int[5];
        int par, impar, negativo, positivo;
        par = 0;
        impar = 0;
        negativo = 0;
        positivo = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os  valores:");
            valor[i] = entrada.nextInt();
            if (valor[i] % 2 == 0) {
                par++;
            }
            if (valor[i] % 2 != 0) {
                impar++;
            }
            if (valor[i] < 0) {
                negativo++;
            }
            if (valor[i] >= 0) {
                positivo++;
            }
        }
        System.out.println("Par = " + par);
        System.out.println("Ímpar = " + impar);
        System.out.println("Negativo = " + negativo);
        System.out.println("Positivo = " + positivo);
    }

}

}
