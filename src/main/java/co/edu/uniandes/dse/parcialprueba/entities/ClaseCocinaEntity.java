package co.edu.uniandes.dse.parcialprueba.entities;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity

public class ClaseCocinaEntity extends BaseEntity{

    @PodamExclude
    @ManyToMany
    private List<ChefEntity> chefs = new ArrayList<>();

    @Temporal(TemporalType.DATE)
    private String realizationDate;

    private String name;
	private String description;
    private String duracion;
    private String nivelDificultad;
    private String cookingStyle;
    private Long Id;
}
