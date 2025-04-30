package com.aluracursos.universidad.Principal;

import com.aluracursos.universidad.models.Estudiante;
import com.aluracursos.universidad.models.Vector;

import java.util.ArrayList;

public class VectorTeste {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Santiago");
        Estudiante estudiante2 = new Estudiante("Juan");
        Estudiante estudiante3 = new Estudiante("Pedro");

        Vector lista = new Vector();
        System.out.println(lista.tamano());
        lista.adicionar(estudiante1);
        System.out.println(lista.tamano());
        lista.adicionar(estudiante2);
        System.out.println(lista.tamano());

        System.out.println("Lista de estudiantes: " + lista);
        System.out.println(lista.contiene(estudiante1));
        System.out.println(lista.contiene(estudiante3));

        Estudiante x = lista.obtener(1);
        System.out.println(x);

        lista.adiciona(1, estudiante3);
        System.out.println(lista);

        lista.remover(1);
        System.out.println(lista);

        for (int i = 0; i < 300; i++) {
            Estudiante y = new Estudiante("Jorge" + i);
            lista.adicionar(y);
        }
        System.out.println(lista);

        ArrayList<Estudiante> listaDeJava = new ArrayList<Estudiante>();

    }
}
