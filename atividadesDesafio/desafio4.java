package atividadesDesafio;

import java.util.Scanner;

public class desafio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a = 0.2;
        double b = 0.3;
        double c = 0.5;
        double resultA, resultB, resultC;
        int x;
        System.out.println("De 0 a 10, quantas questões foram acertadas na prova A? ");
        x = entrada.nextInt();
        System.out.println(a * x);
        resultA = a * x;
        System.out.println("De 0 a 10, quantas questões foram acertadas na prova B? ");
        x = entrada.nextInt();
        System.out.println(b * x);
        resultB = b * x;
        System.out.println("De 0 a 10, quantas questões foram acertadas na prova C? ");
        x = entrada.nextInt();
        System.out.println(c * x);
        resultC = c * x;
        double total = resultA + resultB + resultC;
        System.out.println("nota final: " + total);

    }

}
