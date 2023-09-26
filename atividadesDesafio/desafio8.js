var nome;
var idade;
var escolha;
var entradaPadrao  = 20;
var entradaVIP = 50;
var python;

python = prompt("voce estuda python");
nome = prompt("digite seu nome");
idade = prompt("Digite sua idade");

if(idade >= 18){
        
alert("vip (1) e padrão(2)");
escolha = prompt("digite sua escolha");
    if (escolha ==1){
             if(python  == 1){
                entradaVIP = entradaVIP/2;
                alert("vc tem desconto de 50% e valor do ingreso é: " + entradaVIP );
              }else{
                     alert("voce nao tem desconto e o ingresso custa: "+ entradaVIP);}
    }else if (escolha ==2){
            if(python  == 1){
                entradaPadrao = entradaPadrao/2;
                alert("voce tem desconto e o valor do ingreso é:" + entradaPadrao);
            }else{
                alert("voce nao tem desconto e o ingresso custa: "+ entradaPadrao);
             }
    }
}else {
    alert("se voce tem menos de 18 vai em  bora ");
   }
