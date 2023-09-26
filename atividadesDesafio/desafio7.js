var pedestre;
var resposta1 ; 
var resposta2;
var resposta3;
var escolha ;


escolha = prompt("digite 1 para pedestres 2 para motorista");
alert("respondas as peguntas com 1 para sim e 2 para nao")
    if(escolha ==1){
         resposta1 = prompt("voce esta na faixa de pedestre");
         resposta2  = prompt("o sinal esta aberto para pedastre");
         if(resposta1 == 1 && resposta2 == 1){
            alert("parabens")
         }else{
            alert("voce vai morrer");
         }
    }else{
        resposta1 = prompt("voce esta de cinto");
         resposta2  = prompt("voce bebeu alguma bebida alcoolica");
         resposta3 = prompt("o sina esta aberto");
         if(resposta1 == 1 && resposta2 == 2 && resposta3 == 1){
            alert("pode passar")
         }else{
            alert("voce vai  matar alguem!!!");
	}
    }
