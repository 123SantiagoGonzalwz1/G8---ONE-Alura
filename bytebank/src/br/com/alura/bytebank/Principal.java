package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Funcionario jose = new Funcionario("Jose", 1, LocalDate.of(1990, 2, 12));

        System.out.println(jose);
    }
}
