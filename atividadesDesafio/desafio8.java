public class desafio8 {

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String python, escolha, nome;
        int idade;
        double valor, valorFinal;

        System.out.println("Digite seu noe: ");
        nome = entrada.next();
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Voce estuda python? S (sim) e N(não)");
        python = entrada.next();

        System.out.println("Você deseja ingresso padrão(P) ou vip(V)?");
        escolha = entrada.next();
        if (escolha.equals("P") || escolha.equals("p")) {
            escolha = "Padrão";
        } else if (escolha.equals("v") || escolha.equals("V")) {
            escolha = "VIP";
        } else {
            System.out.println("Inválido");
        }

        System.out.println(nome + ", seu ingresso " + escolha + " foi reservado com sucesso!");
        if (python.equals("S") || python.equals("s")) {
            System.out.println("Por ser estudante de Python, você recebe um desconto de 50%");
        }

    }

}

}
