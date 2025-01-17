let numeroSecreto = 6;
let numeroUsuario = 0;
let intentos = 1;
let palabraIntentos = 'intento';

while (numeroUsuario != numeroSecreto) {
    numeroUsuario = prompt("Me indicas un número, entre 1 y 10 por favor.");

    console.log(numeroUsuario);
    console.log(numeroSecreto == numeroUsuario);

    if (numeroUsuario == numeroSecreto) {
        alert(`Acertaste el número es : ${numeroUsuario}. Lo hiciste en ${intentos} ${palabraIntentos}.`);
    } else {
        if (numeroUsuario > numeroSecreto) {
            alert('El número secreto es menor.');
        } else {
            alert('El número secreto es mayor.');
        }
        intentos += 1;
        palabraIntentos = 'intentos';

        if (intento > 3) {
            alert('Llegaste al número máxio de intentos');
            break;
        }

        alert('Lo siento, no acertaste el número.');
    }
} 

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