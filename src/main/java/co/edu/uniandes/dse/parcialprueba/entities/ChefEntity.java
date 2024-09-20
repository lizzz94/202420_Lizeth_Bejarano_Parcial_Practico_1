package co.edu.uniandes.dse.parcialprueba.entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.edu.uniandes.dse.parcialprueba.podam.DateStrategy;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;
import uk.co.jemos.podam.common.PodamStrategyValue;

@Data
@Entity
public class ChefEntity extends BaseEntity {

    @Temporal(TemporalType.DATE)
	@PodamStrategyValue(DateStrategy.class)
	private Date birthDate;
    private String name;
	private String description;
	private String image;
    private String country;
    private int experience;
    private String cookingStyle;
    private String socialMedia;
    private Long Id;

}
