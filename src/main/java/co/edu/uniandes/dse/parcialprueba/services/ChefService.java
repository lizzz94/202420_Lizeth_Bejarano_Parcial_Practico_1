package co.edu.uniandes.dse.parcialprueba.services;

import java.util.Calendar;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.parcialprueba.entities.ChefEntity;
import co.edu.uniandes.dse.parcialprueba.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcialprueba.repositories.ChefRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service

public class ChefService {

    @Autowired
    ChefRepository chefRepository;

    @Transactional
    public ChefEntity createChef(ChefEntity chef) throws IllegalOperationException {
		log.info("Inicia proceso de creación de un chef");
		Calendar calendar = Calendar.getInstance();
		if(chef.getBirthDate().compareTo(calendar.getTime()) < 18) {
			throw new IllegalOperationException("El chef debe ser mayor de edad");

        
}
return chefRepository.save(chef);
    }
    
    
    }
//La clase correspondiente a la lógica del Chef e implemente únicamente el método createChef. Valide que el chef tenga al menos 3 años de experiencia y que el chef sea mayor de edad (usando la regulación en Colombia: al menos 18 años).