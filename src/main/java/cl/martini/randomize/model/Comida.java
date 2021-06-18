package cl.martini.randomize.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "comidas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comida {
	
	@Id
	@Column(name = "id_comida")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "nombre")
	String nombre;
	
	@Column(name = "peso")
	int peso;
	
	@Column(name = "categoria")
	String categoria;


	@Column(name = "horario")
	String horario;
	

}
