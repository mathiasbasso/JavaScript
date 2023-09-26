import java.util.Scanner;

public class desafio8 {

    public class Main {
        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            String python, escolha, nome;
            int idade;
            double valor, valorFinal;
            double ingresso = 0;

            System.out.println("Digite seu nome: ");
            nome = entrada.next();
            System.out.println("Digite sua idade: ");
            idade = entrada.nextInt();
            if (idade >= 18) {
                System.out.println("Muito bem você pode reservar ingresso");
                System.out.println("Voce estuda python? S (sim) e N(não)");
                python = entrada.next();

                System.out.println("Você deseja ingresso padrão(P) ou vip(V)?");
                escolha = entrada.next();
                if (escolha.equals("P") || escolha.equals("p")) {
                    escolha = "Padrão";
                    ingresso = 20.0;
                } else if (escolha.equals("v") || escolha.equals("V")) {
                    escolha = "VIP";
                    ingresso = 50.0;
                } else {
                    System.out.println("Inválido");
                    System.exit(1);
                }

                System.out.println(nome + ", seu ingresso " + escolha + " foi reservado com sucesso!");
                if (python.equals("S") || python.equals("s")) {
                    ingresso = ingresso / 2;
                    System.out
                            .println("Por ser estudante de Python, você recebe um desconto de 50% e seu ingresso sai " +
                                    "por apenas " + ingresso + " reais!");
                } else {
                    System.out.println("Seu ingresso tem um valor de: " + ingresso + " Reais!");
                }

            } else {
                System.out.println("Menor nao eeentraa");
            }

        }

    }

}
