package com.bilgeadam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "arabadetay")

public class ArabaDetay {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column
	private int arabaID;
	
	@Column
	private String Detay;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getArabaID() {
		return arabaID;
	}

	public void setArabaID(int arabaID) {
		this.arabaID = arabaID;
	}

	public String getDetay() {
		return Detay;
	}

	public void setDetay(String detay) {
		Detay = detay;
	}
	
		
	}


