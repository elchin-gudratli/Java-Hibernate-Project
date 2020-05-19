package com.bilgeadam.beans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.bilgeadam.dao.ArabaHibernateDAO;
import com.bilgeadam.model.Araba;
import com.bilgeadam.model.ArabaDetay;

@SuppressWarnings("serial")
@SessionScoped
@ManagedBean (name = "arabaHibernateBean")

public class ArabaHibernateBean implements Serializable{
	
	private List<Araba> arabaListesi;
	private ArabaDetay seciliAraba = null;
	ArabaHibernateDAO arabaHibernateDAO= new ArabaHibernateDAO();
	
	@PostConstruct
	public void init()
	{
			this.arabaListesi = arabaHibernateDAO.findAll();
	}
	
	public String arabayaGit (Araba araba)
	{
		
		try
		{
			this.seciliAraba = arabaHibernateDAO.arabaDetayGetir(araba.getId());
			return "arabahibernatedetay";
		}
		catch (Exception ex)
		{
			return null;
		}
	}

	public List<Araba> getArabaListesi() {
		return arabaListesi;
	}

	public void setArabaListesi(List<Araba> arabaListesi) {
		this.arabaListesi = arabaListesi;
	}

	public ArabaDetay getSeciliAraba() {
		return seciliAraba;
	}

	public void setSeciliAraba(ArabaDetay seciliAraba) {
		this.seciliAraba = seciliAraba;
	}

	public ArabaHibernateDAO getArabaHibernateModel() {
		return arabaHibernateDAO;
	}

	public void setArabaHibernateModel(ArabaHibernateDAO arabaHibernateModel) {
		this.arabaHibernateDAO = arabaHibernateModel;
	}
	
	
	
}

	
	
	


