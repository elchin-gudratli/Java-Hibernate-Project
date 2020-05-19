package com.bilgeadam.converters;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name = "converterBean")
@SessionScoped


public class ConverterBean {
	
	private double minFractionDigitVariable;
	private double patternVariable;
	private double currentVariable=5;
	private double percentVariable=5;
	
	private String url;

	public double getMinFractionDigitVariable() {
		return minFractionDigitVariable;
	}

	public void setMinFractionDigitVariable(double minFractionDigitVariable) {
		this.minFractionDigitVariable = minFractionDigitVariable;
	}

	public double getPatternVariable() {
		return patternVariable;
	}

	public void setPatternVariable(double patternVariable) {
		this.patternVariable = patternVariable;
	}

	public double getCurrentVariable() {
		return currentVariable;
	}

	public void setCurrentVariable(double currentVariable) {
		this.currentVariable = currentVariable;
	}

	public double getPercentVariable() {
		return percentVariable;
	}

	public void setPercentVariable(double percentVariable) {
		this.percentVariable = percentVariable;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	


}
