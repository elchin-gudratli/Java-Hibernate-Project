package com.bilgeadam.validators;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name = "validatorTagsBean")
@SessionScoped

public class ValidatorTagsBean {
	private String nameAndSurname;
	private int age;
	private float salary;
	private String email;
	
	
	public String getNameAndSurname() {
		return nameAndSurname;
	}
	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
