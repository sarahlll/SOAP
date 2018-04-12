package com.formation.soap.serveurs;
import javax.xml.ws.Endpoint;

import com.formation.soap.services.*;

public class ServeurJWS{
	public static void main(String[] args) {
		String url="http://localhost:8586/";//8586 pour le add compte () & 8585 initialement
		Endpoint.publish(url, new BanqueWS());
		
		System.out.println(url);
		} }