package com.aluracursos.desafio_libro;

import com.aluracursos.desafio_libro.principal.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioLibroApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioLibroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.muestraMenu();
	}
}
