package com.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Raking {

	@Id
	@GeneratedValue
	private int id;
	private int Ranking;
	
	@OneToOne
	private Persona persona;
	
	
	@OneToOne 
	
	private Skill skill;
	
	public Raking() {
		super();
	}
	public Raking(int ranking) {
		Ranking = ranking;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRanking() {
		return Ranking;
	}
	public void setRanking(int ranking) {
		Ranking = ranking;
	}
	
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
	@Override
	public String toString() {
		return "Raking [id=" + id + ", Ranking=" + Ranking + "]";
	}
	
	
	
}
