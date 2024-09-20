package co.edu.uniandes.dse.parcialprueba.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.uniandes.dse.parcialprueba.entities.ChefEntity;
import co.edu.uniandes.dse.parcialprueba.entities.ClaseCocinaEntity;
import co.edu.uniandes.dse.parcialprueba.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.parcialprueba.repositories.ChefRepository;
import co.edu.uniandes.dse.parcialprueba.repositories.ClaseCocinaRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ChefClaseCocinaService {

	@Autowired
	private ChefRepository chefRepository;

	@Autowired
	private ClaseCocinaRepository ClaseCocinaRepository;
	
	
}
	