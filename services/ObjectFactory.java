
package com.formation.soap.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.formation.soap.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetComptes_QNAME = new QName("http://services.soap.formation.com/", "getComptes");
    private final static QName _AddComptesResponse_QNAME = new QName("http://services.soap.formation.com/", "addComptesResponse");
    private final static QName _GetComptesResponse_QNAME = new QName("http://services.soap.formation.com/", "getComptesResponse");
    private final static QName _ConversionEuroToDhResponse_QNAME = new QName("http://services.soap.formation.com/", "ConversionEuroToDhResponse");
    private final static QName _Compte_QNAME = new QName("http://services.soap.formation.com/", "compte");
    private final static QName _GetCompte_QNAME = new QName("http://services.soap.formation.com/", "getCompte");
    private final static QName _AddCompteResponse_QNAME = new QName("http://services.soap.formation.com/", "addCompteResponse");
    private final static QName _GetCompteResponse_QNAME = new QName("http://services.soap.formation.com/", "getCompteResponse");
    private final static QName _ConversionEuroToDh_QNAME = new QName("http://services.soap.formation.com/", "ConversionEuroToDh");
    private final static QName _AddComptes_QNAME = new QName("http://services.soap.formation.com/", "addComptes");
    private final static QName _AddCompte_QNAME = new QName("http://services.soap.formation.com/", "addCompte");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.formation.soap.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link AddCompteResponse }
     * 
     */
    public AddCompteResponse createAddCompteResponse() {
        return new AddCompteResponse();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDh }
     * 
     */
    public ConversionEuroToDh createConversionEuroToDh() {
        return new ConversionEuroToDh();
    }

    /**
     * Create an instance of {@link AddComptes }
     * 
     */
    public AddComptes createAddComptes() {
        return new AddComptes();
    }

    /**
     * Create an instance of {@link AddCompte }
     * 
     */
    public AddCompte createAddCompte() {
        return new AddCompte();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link AddComptesResponse }
     * 
     */
    public AddComptesResponse createAddComptesResponse() {
        return new AddComptesResponse();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDhResponse }
     * 
     */
    public ConversionEuroToDhResponse createConversionEuroToDhResponse() {
        return new ConversionEuroToDhResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.formation.com/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.formation.com/", name = "addComptesResponse")
    public JAXBElement<AddComptesResponse> createAddComptesResponse(AddComptesResponse value) {
        return new JAXBElement<AddComptesResponse>(_AddComptesResponse_QNAME, AddComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.formation.com/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDhResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.formation.com/", name = "ConversionEuroToDhResponse")
    public JAXBElement<ConversionEuroToDhResponse> createConversionEuroToDhResponse(ConversionEuroToDhResponse value) {
        return new JAXBElement<ConversionEuroToDhResponse>(_ConversionEuroToDhResponse_QNAME, ConversionEuroToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.formation.com/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.formation.com/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.formation.com/", name = "addCompteResponse")
    public JAXBElement<AddCompteResponse> createAddCompteResponse(AddCompteResponse value) {
        return new JAXBElement<AddCompteResponse>(_AddCompteResponse_QNAME, AddCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.formation.com/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDh }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.formation.com/", name = "ConversionEuroToDh")
    public JAXBElement<ConversionEuroToDh> createConversionEuroToDh(ConversionEuroToDh value) {
        return new JAXBElement<ConversionEuroToDh>(_ConversionEuroToDh_QNAME, ConversionEuroToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.formation.com/", name = "addComptes")
    public JAXBElement<AddComptes> createAddComptes(AddComptes value) {
        return new JAXBElement<AddComptes>(_AddComptes_QNAME, AddComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.formation.com/", name = "addCompte")
    public JAXBElement<AddCompte> createAddCompte(AddCompte value) {
        return new JAXBElement<AddCompte>(_AddCompte_QNAME, AddCompte.class, null, value);
    }

}
