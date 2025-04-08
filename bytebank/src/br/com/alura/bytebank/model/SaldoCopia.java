package br.com.alura.bytebank.model;

import java.util.Scanner;

public class SaldoCopia {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        System.out.println("Escribe el saldo:");

        var saldo = lectura.nextDouble();
        double percentual = saldo * (10.0 / 100);


        var valorFinal = saldo + percentual;
        System.out.println("El saldo con el reajuste del 10% es: " + valorFinal);
    }
}
