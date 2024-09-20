package co.edu.uniandes.dse.parcialprueba.services;

import java.util.Calendar;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.parcialprueba.entities.ClaseCocinaEntity;
import co.edu.uniandes.dse.parcialprueba.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcialprueba.repositories.ClaseCocinaRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service

public class ClaseCocinaService {

    @Autowired
    ClaseCocinaRepository claseCocinaRepository;

    @Transactional
    public ClaseCocinaEntity createClaseCocina(ClaseCocinaEntity claseCocina) throws IllegalOperationException {
        log.info("Inicia proceso de creación de una clase de cocina");

        if(claseCocina.getDuracion().equals(claseCocina.getNivelDificultad())) {
            throw new IllegalOperationException("El nivel de dificultad debe ser coherente con la duración de la clase ");
        }
        return claseCocinaRepository.save(claseCocina);

    }

    }

//