var nome, valorHora, horaTrabalho;

nome = prompt("Digite o nome")
valorHora = prompt("Valor para hora trabalhada")
horaTrabalho = prompt("Quantas horas trabalhou? ")

const salario = valorHora*horaTrabalho;
alert("O salario será de: " +salario+ " reais")