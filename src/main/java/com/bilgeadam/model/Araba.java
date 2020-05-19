package com.bilgeadam.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "araba")

public class Araba {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int Id;
	
	@Column
	private String Marka;
	
	@Column
	private String Model;
	
	@Column
	private int Pencere;
	
	@Column
	private int Kapi;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getMarka() {
		return Marka;
	}

	public void setMarka(String marka) {
		Marka = marka;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getPencere() {
		return Pencere;
	}

	public void setPencere(int pencere) {
		Pencere = pencere;
	}

	public int getKapi() {
		return Kapi;
	}

	public void setKapi(int kapi) {
		Kapi = kapi;
	}
	
	
	

}
