package com.formation.soap.entities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class Banque {

	public static void main(String[] args) throws JAXBException, IOException {
		
	//	marshall();
        unmashall();
        createSchema();
	}
	public static void marshall() throws JAXBException
	{
		JAXBContext context= JAXBContext.newInstance(Compte.class);
		Marshaller marshaller = context.createMarshaller();// Conversion des objets en XML
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		Compte cp = new Compte(new Integer(1),new Float(8000), new Date());
		marshaller.marshal(cp,new File("comptes.xml"));
		
	}
	public static void unmashall() throws JAXBException
	{
		JAXBContext context= JAXBContext.newInstance(Compte.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Compte cp = (Compte)unmarshaller.unmarshal(new File("comptes2.xml"));//conversion XMl en Objets
		
		System.out.println(cp);
	}
    public static void createSchema() throws JAXBException, IOException // Creation d'une schema pour valider si les fichier sont valides 
    {
    	JAXBContext context= JAXBContext.newInstance(Compte.class);
    	context.generateSchema(new SchemaOutputResolver() {
			
			@Override
			public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
				File f= new File("compte.xsd");
				StreamResult result=new StreamResult(f);
				result.setSystemId(f.getName());
				return result;
			}
		});
    }
}