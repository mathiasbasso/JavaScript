package atividadesDesafio;

import java.util.Scanner;

public class desafio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double valorHora;
        int horasTrabalho;
        System.out.println("Qual é o nome do colaborador? ");
        nome = entrada.next();
        System.out.println("Qual o valor da hora de trabalho deste colaborador? ");
        valorHora = entrada.nextDouble();
        System.out.println("Quantas horas ele trabalhou? ");
        horasTrabalho = entrada.nextInt();
        double salario = valorHora * horasTrabalho;
        System.out.println(nome + " tem uma carga horária de " + valorHora + " trabalhou " + horasTrabalho +
                " horas e seu salário é de: " + salario);

    }

}
