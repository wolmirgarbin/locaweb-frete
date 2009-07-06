package br.com.settech.locawebfrete.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.2
 * Sun Jul 05 20:10:36 BRT 2009
 * Generated source version: 2.2.2
 * 
 */
 
@WebService(targetNamespace = "http://tempuri.org/", name = "FreteSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface FreteSoap {

    @ResponseWrapper(localName = "CorreiosXmlResponse", targetNamespace = "http://tempuri.org/", className = "br.com.settech.locawebfrete.generated.CorreiosXmlResponse")
    @RequestWrapper(localName = "CorreiosXml", targetNamespace = "http://tempuri.org/", className = "br.com.settech.locawebfrete.generated.CorreiosXml")
    @WebResult(name = "CorreiosXmlResult", targetNamespace = "http://tempuri.org/")
    @WebMethod(operationName = "CorreiosXml", action = "http://tempuri.org/CorreiosXml")
    public java.lang.String correiosXml(
        @WebParam(name = "cepOrigem", targetNamespace = "http://tempuri.org/")
        java.lang.String cepOrigem,
        @WebParam(name = "cepDestino", targetNamespace = "http://tempuri.org/")
        java.lang.String cepDestino,
        @WebParam(name = "peso", targetNamespace = "http://tempuri.org/")
        java.lang.String peso,
        @WebParam(name = "volume", targetNamespace = "http://tempuri.org/")
        java.lang.String volume,
        @WebParam(name = "codigo", targetNamespace = "http://tempuri.org/")
        java.lang.String codigo
    );

    @ResponseWrapper(localName = "CorreiosResponse", targetNamespace = "http://tempuri.org/", className = "br.com.settech.locawebfrete.generated.CorreiosResponse")
    @RequestWrapper(localName = "Correios", targetNamespace = "http://tempuri.org/", className = "br.com.settech.locawebfrete.generated.Correios")
    @WebResult(name = "CorreiosResult", targetNamespace = "http://tempuri.org/")
    @WebMethod(operationName = "Correios", action = "http://tempuri.org/Correios")
    public java.lang.String correios(
        @WebParam(name = "cepOrigem", targetNamespace = "http://tempuri.org/")
        java.lang.String cepOrigem,
        @WebParam(name = "cepDestino", targetNamespace = "http://tempuri.org/")
        java.lang.String cepDestino,
        @WebParam(name = "peso", targetNamespace = "http://tempuri.org/")
        java.lang.String peso,
        @WebParam(name = "volume", targetNamespace = "http://tempuri.org/")
        java.lang.String volume,
        @WebParam(name = "codigo", targetNamespace = "http://tempuri.org/")
        java.lang.String codigo
    );
}
