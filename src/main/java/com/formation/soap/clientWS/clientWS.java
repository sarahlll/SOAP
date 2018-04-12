package com.formation.soap.clientWS;
import java.util.List;

import com.formation.soap.services.Compte;
import com.formation.soap.services.BanqueService;
import com.formation.soap.services.BanqueWS;

public class clientWS {

	public static void main(String[] args) { 
	
		
		BanqueService stub=new BanqueWS().getBanqueServicePort();
		System.out.println("Conversion");
		System.out.println(stub.conversionEuroToDh(9000));
		System.out.println("Consulter un compte");
		Compte cp=stub.getCompte((int) 2L);
		System.out.println("Solde="+cp.getSolde());
		System.out.println("Liste des comptes"); 
		List<Compte> cptes=stub.getComptes(); 
		for(Compte c:cptes){ 
			System.out.println(c.getCode()+"----"+c.getSolde()); 
		}

 
	}
}
