var A = 0.2;
var B = 0.3;
var C = 0.5;
var resultA, resultB, resultC;
var x;

x = prompt("Quantas questoes acertou na prova A?")
resultA = x*A;

x = prompt("Quantas questoes acertou na prova B?")
resultB = x*B;

x = prompt("Quantas questoes acertou na prova C?")
resultC = x*C;

total = resultA + resultB + resultC;
alert("nota total: "+ total);
