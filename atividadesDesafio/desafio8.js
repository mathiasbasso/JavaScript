var nome;
var idade;
var escolha;
var entradaPadrao  = 20;
var entradaVIP = 50;
var python;

python = prompt("voce estuda python");
nome = prompt("digite seu nome");
idade = prompt("Digite sua idade");

if(idade > 18){
        
alert("vip (1) e padrão(2)");
escolha = prompt("digite sua escolha");
    if (escolha ==1){
       alert("o valor do ingreso é:" + entradaVIP);
             if(python  == 1){
                entradaVIP = entradaVIP/2;
                alert("vc tem desconto de 50% e valor do ingreso é:" + entradaVIP );
                     }else{
                     alert("voce nao tem desconto");}
    }else (escolha ==2);{
       entradaPadrao = entradaPadrao/2;
        alert("o valor do ingreso é:" + entradaPadrao);
            if(python  == 1){
            alert("vc tem desconto de 50%");
            }else{
                alert("voce nao tem desconto");
             }
    }
}else {
    alert("se voce tem menos de 18 vai em  bora ");
   }
