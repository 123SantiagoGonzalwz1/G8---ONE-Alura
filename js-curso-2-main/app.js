


function mensajeConsola() {
    return console.log('¡Hola Mundo!');
}

function mensajeNombre(nombre) {
    return console.log(`Hola ${nombre}`);
}

function dobleDelNumero(numero) {
    return console.log(`El doble de ${numero} es ${numero * 2}`);
}

function promedioNumero(num1, num2, num3) {
    let promedio = (num1 + num2 + num3) / 3;
    return console.log(`El promedio de ${num1}, ${num2} y ${num3} es ${promedio}`);
}

function numeroMayor(num1, num2) {

    if(num1 > num2) {
        console.log(`El numero mayor es ${num1}`);
    } else {
        console.log(`El numero mayor es ${num2}`);
    }

    return;
}

function multiplicarNumero(num1) {
    return console.log(`El número ${num1} multiplicado por si mismo es ${num1 * num1}`);
}

multiplicarNumero(5);
numeroMayor(4, 10);
dobleDelNumero(30);
promedioNumero(5, 2, 3);
mensajeNombre('Santiago');
mensajeConsola();



/* let title = document.querySelector('h1');
title.innerHTML = "Hora del desafío";

function clicBotonConsole() {
    alert('El botón fue clickeado');
}

function clicBotonPrompt() {
    let ciudad = prompt("Ingresa el nombre una ciudad de Brasil, por favor.");
    alert(`Estuve en ${ciudad} y me acordé de ti.`);
}

function clicBotonAlerta() {
    alert("Yo amo JS");
}

function clicBotonSuma() {
    let numero1 = parseInt(prompt("Ingresa un número, por favor."));
    let numero2 = parseInt(prompt("Ingresa el segundo número, por favor."));
    let result = numero1 + numero2;
    alert(`El resultado de la suma es: ${result}`);
} */