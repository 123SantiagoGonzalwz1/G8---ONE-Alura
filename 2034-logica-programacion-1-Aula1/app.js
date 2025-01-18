let numeroMaximoPosible = 10;
let numeroSecreto = Math.floor(Math.random() * numeroMaximoPosible) + 1;
let numeroUsuario = 0;
let intentos = 1;
let maximosIntentos = 3;

while (numeroUsuario != numeroSecreto) {
    numeroUsuario = parseInt(prompt(`Me indicas un número, entre 1 y ${numeroMaximoPosible} por favor.`));

    if (numeroUsuario == numeroSecreto) {
        alert(`Acertaste el número es : ${numeroUsuario}. Lo hiciste en ${intentos} ${intentos == 1 ? 'intento' : 'intentos'}.`);
    } else {
        if (numeroUsuario > numeroSecreto) {
            alert('El número secreto es menor.');
        } else {
            alert('El número secreto es mayor.');
        }

        intentos++;

        if (intentos > maximosIntentos) {
            alert(`Llegaste al número máxio de ${maximosIntentos} intentos`);
            break;
        }

        alert('Lo siento, no acertaste el número.');
    }
}  

/* console.log("¡Bienvenidos Usuarios!");

let name = "Santiago González";
console.log(`¡Hola ${name}!`);

let nombre = "Santiago González";
alert(`¡Hola ${nombre}!`);

let lenguajePreferido = prompt("¿Cuál es el lenguaje de programación que más te gusta?");
console.log(lenguajePreferido);

let valor1 = 10;
let valor2 = 30;
let resultado = valor1 + valor2;
console.log(`La suma de ${valor1} y ${valor2} es igual a ${resultado}`);

let value1 = 25.0;
let value2 = 23.0;
let result = value1 - value2;
console.log(`La diferencia entre ${value1} y ${value2} es igual a ${result}`);

let age = parseInt(prompt("Por favor, ingresa tu edad: "));

if (age >= 18) {
    console.log('¡Eres mayor de edad!');
} else {
    console.log('¡Eres menor de edad!');
}

let numero = parseInt(prompt("Por favor, ingresa un número: "));

if (numero > 0) {
    alert('El número es positivo.');
} else if (numero < 0) {
    alert('El número es negativo.');
} else {
    alert('El número es cero.');
}

let number = 1;
while (number <= 10) {
    console.log(`Número ${number}`);
    number++;
}

let nota = 2;
if (nota >= 7) {
    console.log("Aprobado.");
} else {
    console.log("Reprobado");
}

let numeroAleatorio = Math.floor(Math.random() * 100) + 1;
console.log(numeroAleatorio);

let numeroAleatorio2 = Math.floor(Math.random() * 10) + 1;
console.log(numeroAleatorio2);

let numeroAleatorio3 = Math.floor(Math.random() * 1000) + 1;
console.log(numeroAleatorio3); */

/* let edad = 20;
let tieneLicencia = true;

if (edad > 18 && tieneLicencia) {
    console.log('¡Puede conducir!');
} else {
    console.log('¡No puede conducir!');
} */

/* let tieneManzana = false;
let tieneBanana = true;

if (tieneManzana|| tieneBanana) {
    console.log("Tienes frutas!");
} else {
    console.log("No tienes frutas.");
} */

/* let contador = 1;

while (contador  <= 10) {
    alert(`Número ${contador}`);
    contador += 1;
}

let contador1 = 10;

while (contador1  >= 0) {
    alert(`Número ${contador1}`);
    contador1 -= 1;
}

let cuentaRegresiva = prompt("Ingresa un número, por favor: ");

while (cuentaRegresiva > 0) {
    alert(`Salimos en ${cuentaRegresiva}`);
    cuentaRegresiva -= 1;
} */

/* let cuentaProgresiva = parseInt(prompt("Ingresa un número, por favor: "));

while (cuentaProgresiva <= 10) {
    alert(`Salimos en ${cuentaProgresiva}`);
    cuentaProgresiva += 1;
}
 */


/* let puntuacionJugador = prompt("Ingrese la puntación obtenida:");

if (puntuacionJugador >= 100) {
    alert('¡Felicidades, has ganado!');
} else {
    alert('Intentalo nuevamente para ganar.');
}

let saldo = 1000;
alert(`Su cuenta tiene un saldo de ${saldo} pesos colombianos.`);

let nombreUsuario = prompt("Ingresa tu nombre, por favor.");
alert(`Bievenido ${nombreUsuario}`); */

/* let entradaUsuario = prompt("Ingresa un número para saber si es negativo o positivo, por favor.");

if (entradaUsuario > 0) {
    alert('El número es positivo.');
} else if (entradaUsuario < 0) {
    alert('El número es negativo.');
} else {
    alert('El número es cero.');
} */

/* let diaDeLaSemana = prompt("¿Qué día de la semana es?");

if (diaDeLaSemana == "Sábado" || diaDeLaSemana == "Domingo") {
    alert('¡Buen fin de semana!');
} else {
    alert('¡Buenas semana!');
} */