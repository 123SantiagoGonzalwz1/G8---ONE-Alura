let numeroSecreto = 6;
let numeroUsuario = prompt("Me indicas un número, entre 1 y 10 por favor.");

console.log(numeroUsuario);

/*
    Este código realiza la
    comparación.
*/
if (numeroUsuario == numeroSecreto) {
    alert(`Acertaste el número es : ${numeroUsuario}.`);
} else {
    alert('Lo siento, no acertaste el número.');
}