package com.bilgeadam.manageproperty;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.NoneScoped;

@ManagedBean (name="erisilen")
@NoneScoped

public class Erisilen {
	
	private String ad;
	private String soyad;
	
	@PostConstruct // Yönetimli nesne oluþturduktan hemen sonra..
	public void hemenSonra() {
		this.ad="Gokcen";
		this.soyad="Dede";
	}
	public void hemenOnce() {
		this.ad=null;
		this.soyad=null;

}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	}

