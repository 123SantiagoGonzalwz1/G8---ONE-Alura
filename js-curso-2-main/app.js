function mostrarTablaDeMultiplicar(numero) {
    for (let i = 1; i <= 10; i++) {
        let resultado = numero * i;
        console.log(`${numero} x ${i} = ${resultado}`);
    }
}

let numero = 7;
mostrarTablaDeMultiplicar(numero);

/* const PI = 3.14

function areaSalaCircular(radio) {
    let area = PI * radio * radio;
    return area;
}

function perimetroSalaCircular(radio) {
    let perimetro = 2 * PI * radio;
    return perimetro;
}

let radio = 25.5;
let area = areaSalaCircular(radio);
let perimetro = perimetroSalaCircular(radio);
console.log(`El área de la sala circular es ${area} y su perímetro es ${perimetro}.`); */

/* function areaSalaRectangular(altura, anchura) {
    let area = altura * anchura;
    return area;
}

function perimetroSalaRectangular(altura, anchura) {
    let perimetro = 2 * (altura + anchura);
    return perimetro;
}

let altura = 5;
let anchura = 10;
let area = areaSalaRectangular(altura, anchura);
let perimetro = perimetroSalaRectangular(altura, anchura);

console.log(`El área de la sala rectangular es ${area} y su perímetro es ${perimetro}.`); */

/* function dolaresAPesosColombianos(dolares) {
    let cotizacionDolar = 4.285;
    let pesos = dolares * cotizacionDolar;
    return pesos;
}

let valorDolar = 50;
let valorEnPesos = dolaresAPesosColombianos(valorDolar);
console.log(`${valorDolar} dólares es $${valorEnPesos} pesos colombianos.`); */


/* function calculoIndiceMasaCorporal(altura, peso) {
    let indice = peso / (altura * altura);
    return console.log(`Tu IMC es ${indice}`);
}

calculoIndiceMasaCorporal(1.75, 70);

function calcularFactorial(numero) {
    if (numero === 0 || numero === 1) {
        return 1;
    } else {
        return numero * calcularFactorial(numero - 1);
    }
}

let numero = 5;
let resultado = calcularFactorial(numero);
console.log(`El factorial de ${numero} es ${resultado}.`); */






















/* function mensajeConsola() {
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
mensajeConsola(); */



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