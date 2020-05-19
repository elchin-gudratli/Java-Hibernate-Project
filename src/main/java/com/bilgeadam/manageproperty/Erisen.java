package com.bilgeadam.manageproperty;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="erisen")
@SessionScoped


public class Erisen {
	
private String mesaj;
	
	@ManagedProperty(value="#{erisilen}")
	private Erisilen erisilen;
	
	public void selamla() {
		mesaj="Hoþgeldin "+erisilen.getAd()+" "+erisilen.getSoyad();
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	public Erisilen getErisilen() {
		return erisilen;
	}

	public void setErisilen(Erisilen erisilen) {
		this.erisilen = erisilen;
	}
}
	


