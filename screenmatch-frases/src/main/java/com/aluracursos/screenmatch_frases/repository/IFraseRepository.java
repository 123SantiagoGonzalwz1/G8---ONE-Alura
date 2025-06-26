package com.aluracursos.screenmatch_frases.repository;

import com.aluracursos.screenmatch_frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IFraseRepository extends JpaRepository<Frase, Long> {

    @Query("select f from Frase f order by function('RANDOM') limit 1")
    public Frase obtenerFraseAleatoria();
}
