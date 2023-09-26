var python 
var escolha
var  nome;
var idade;
var valor
var  valorFinal;

nome = prompt("Digite seu nome: ");
    
idade = prompt("Digite sua idade: ");
    
python = prompt("Voce estuda python? S (sim) e N(não)");
        
 escolha= prompt("Você deseja ingresso padrão(P) ou vip(V)?");
       
        if (escolha.equals("P") || escolha.equals("p")) {
            escolha = "Padrão";
        } else if (escolha.equals("v") || escolha.equals("V")) {
            escolha = "VIP";
        } else {
           alert("Inválido");
        }

        alert(nome + ", seu ingresso " + escolha + " foi reservado com sucesso!");
        if (python.equals("S") || python.equals("s")) {
            alert("Por ser estudante de Python, você recebe um desconto de 50%");
        }
