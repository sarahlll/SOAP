package com.formation.soap.entities;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD) 
public class Compte {
	private Integer code;
	private Float solde;
	
	@XmlTransient// la date sera non apparante dans le xsd , on la passe!
	private Date dateCreation;

	public Compte() {
		

	}

	public Compte(Integer code, Float solde, Date dateCreation) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer l) {
		this.code = l;
	}

	public Float getSolde() {
		return solde;
	}

	public void setSolde(Float solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + ", dateCreation=" + dateCreation + "]";
	}

	public void setCode(int l) {
		// TODO Auto-generated method stub
		
	}

}