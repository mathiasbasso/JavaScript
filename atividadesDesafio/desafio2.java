package atividadesDesafio;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, nota5;

        System.out.println("Entre com a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Entre com a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Entre com a terceira nota: ");
        nota3 = entrada.nextDouble();
        System.out.println("Entre com a quarta nota: ");
        nota4 = entrada.nextDouble();
        System.out.println("Entre com a quinta nota: ");
        nota5 = entrada.nextDouble();
        nota1 = nota1 * 2;
        nota2 = nota2 * 2;
        nota3 = nota3 * 2;
        nota4 = nota4 * 2;
        nota5 = nota5 * 2;
        double notaTotal = nota1 + nota2 + nota3 + nota4 + nota5;
        if (notaTotal == 0) {
            System.out.println("Conceito E --- Reprovado");
        } else if (notaTotal >= 1 && notaTotal < 36) {
            System.out.println("Conceito D--- APROVADO");
        } else if (notaTotal >= 36 && notaTotal < 61) {
            System.out.println("Conceito C ----- APROVADO");
        } else if (notaTotal >= 61 && notaTotal < 86) {
            System.out.println("Conceito B ------- APROVADO");
        } else if (notaTotal >= 86 && notaTotal < 101) {
            System.out.println("Conceito A ------- APROVADO");
        } else if (notaTotal > 100 || notaTotal < 0) {
            System.out.println("INVÁLIDO");
        }

    }
}
