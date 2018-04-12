package com.formation.soap.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.formation.soap.entities.Compte;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

	private List<Compte> cptes = new ArrayList<Compte>();

	@WebMethod(operationName = "ConversionEuroToDh")

	public double conversion(@WebParam(name = "montant") double mt) {
		return mt * 11;
	}

	@WebMethod
	public Compte getCompte(@WebParam(name = "code") Integer code) {
		return new Compte(code, 7000F, new Date());
	}

	@WebMethod
	public List<Compte> getComptes() {

		// cptes.add(new Compte(1,7000F,new Date()));
		// cptes.add(new Compte(2,7000F,new Date())); // a mettre en param pour la
		

		return cptes;

	}

	// rajouter un compte
	@WebMethod
	public void addCompte(@WebParam(name = "compte") Compte compte) {
	//	compte.setCode(cptes.size() + 1);
		compte.setDateCreation(new Date());
		cptes.add(compte);

	}

	// rajouter des comptes
	@WebMethod
	public List<Compte> addComptes(@WebParam(name = "comptes") List<Compte> comptes) {
     for (Compte compte : comptes) {
    	addCompte(compte);   //faire appelle à la methode addCompte()
		
	}
		return cptes;
	}
}
