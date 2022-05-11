package com.devsuperior.dsmovie.entities; //Pacote

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_movie")
public class Movie { //Clasee, tem que ser o mesmo nome do arquivo.

	/*Repara que o Long, String e Double começam com letra maiuscula,
	  sempre vc vai usar os tipos que começam com letra maiuscula,
	  porque no Java vc tem o tipo primitivo e tem o tipo que é classe
	  o tipo que é classe ele é mais adequado pra vc usar pra tipos de
	  dados para salvar no bando de dados, porque ele aceita nulo, aceita
	  herança, então para funcionar melhor com banco de dados, sempre utilizada
	  os tipos que são classes e não primitivos. */
	
	//Declaração dos atributos.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	@OneToMany(mappedBy = "id.movie")
	private Set<Score> scores = new HashSet<>();
	
	public Movie() { //Construtor vazio, para poder instanciar o Movie sem passar nenhum valor pra ele.  
	}

	public Movie(Long id, String title, Double score, Integer count, String image) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set<Score> getScores() {
		return scores;
	}
	
	
	
	
	
	
	
	
	
}
