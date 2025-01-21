let numeroSecreto = generarNumeroAleatorio();

function asignarTextoElemento(elemento, texto) {
    let elementoHTML = document.querySelector(elemento);
    elementoHTML.innerHTML = texto;
    return;
}

function generarNumeroAleatorio() {
    return Math.floor(Math.random() * 10) +1;
}

function verificarIntento() {
    let numeroDeUsuario = parseInt(document.getElementById('valorUsuario').value);
    return;
}

asignarTextoElemento('h1', '¡Juego del número secreto!');
asignarTextoElemento('p', 'Indica un número del 1 al 10.');