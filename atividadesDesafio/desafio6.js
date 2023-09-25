var  positivo = 0;
var par = 0;
var negativo = 0;
var impar = 0;
var valor = [10, 20, -1, 1, 29];
for (let i= 0; i<5; i++){
 
    
    if (valor[i] % 2 == 0){
        par++;
    }if (valor[i] % 2 != 0){
        impar++;
    }if (valor[i] < 0){
        negativo++;
    }if (valor[i] >= 0){
        positivo++;
    }
}
alert("par: ", par,"/ impar: ", impar, "/ negativo", negativo, "/ positivo: ", positivo);
