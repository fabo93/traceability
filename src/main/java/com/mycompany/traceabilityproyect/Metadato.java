package com.mycompany.traceabilityproyect;
// Generated 15/09/2015 05:38:39 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Metadato generated by hbm2java
 */
public class Metadato  implements java.io.Serializable {


     private BigDecimal id;
     private Datasource datasource;
     private String tabla;
     private String campo;
     private String referencia;

    public Metadato() {
    }

    public Metadato(BigDecimal id, Datasource datasource, String tabla, String campo, String referencia) {
       this.id = id;
       this.datasource = datasource;
       this.tabla = tabla;
       this.campo = campo;
       this.referencia = referencia;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public Datasource getDatasource() {
        return this.datasource;
    }
    
    public void setDatasource(Datasource datasource) {
        this.datasource = datasource;
    }
    public String getTabla() {
        return this.tabla;
    }
    
    public void setTabla(String tabla) {
        this.tabla = tabla;
    }
    public String getCampo() {
        return this.campo;
    }
    
    public void setCampo(String campo) {
        this.campo = campo;
    }
    public String getReferencia() {
        return this.referencia;
    }
    
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }




}


