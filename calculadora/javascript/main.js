//CAMPO DO VISOR DA CALCULADORA
var screen = document.querySelector('#screen');

//FUNÇÃO QUE LIMPA O VIOR DA CALCULADORA
document.querySelector('#limpar').addEventListener('click', function(){
    screen.value = '';
});

//FUNÇÃO QUE DELETA VALORES DA TELA DA CALCULADORA
    document.querySelector('#deletar').addEventListener('click', function(){
        screen.value = screen.value.substring(0, (screen.value.length - 1));
    });

//FUNÇÃO QUE ADICIONA AÇÃO NA TELA DOS BOTÕES
function addToScreen(value){
    const operadoresPadrao = ['*', '+', '-', '/', '.'];
    screen.value += value;

    if (operadoresPadrao.includes(value)){
        var valorAnterior = screen.value.length -2;
        if(operadoresPadrao.includes(screen.value[valorAnterior])){
            screen.value = screen.value.substring(0, (screen.value.length - 2));
            screen.value = screen.value + value;
        }   
    }
    switch(screen.value[0]){
        case '*':
            screen.value = '';
        case '/':
            screen.value = '';
        case '.':
            screen.value = '';
        case '-':
            screen.value = '';

    }
}
function result(){
    screen.value = eval(screen.value);
}