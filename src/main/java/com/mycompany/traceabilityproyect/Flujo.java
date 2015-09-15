package com.mycompany.traceabilityproyect;
// Generated 15/09/2015 05:38:39 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Flujo generated by hbm2java
 */
public class Flujo  implements java.io.Serializable {


     private BigDecimal id;
     private String nombre;
     private String tipoDoc;
     private String idCliente;
     private String idPais;
     private String sendReference;
     private Set pasoActividads = new HashSet(0);

    public Flujo() {
    }

	
    public Flujo(BigDecimal id, String nombre, String tipoDoc, String idCliente, String idPais, String sendReference) {
        this.id = id;
        this.nombre = nombre;
        this.tipoDoc = tipoDoc;
        this.idCliente = idCliente;
        this.idPais = idPais;
        this.sendReference = sendReference;
    }
    public Flujo(BigDecimal id, String nombre, String tipoDoc, String idCliente, String idPais, String sendReference, Set pasoActividads) {
       this.id = id;
       this.nombre = nombre;
       this.tipoDoc = tipoDoc;
       this.idCliente = idCliente;
       this.idPais = idPais;
       this.sendReference = sendReference;
       this.pasoActividads = pasoActividads;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipoDoc() {
        return this.tipoDoc;
    }
    
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    public String getIdPais() {
        return this.idPais;
    }
    
    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }
    public String getSendReference() {
        return this.sendReference;
    }
    
    public void setSendReference(String sendReference) {
        this.sendReference = sendReference;
    }
    public Set getPasoActividads() {
        return this.pasoActividads;
    }
    
    public void setPasoActividads(Set pasoActividads) {
        this.pasoActividads = pasoActividads;
    }




}


