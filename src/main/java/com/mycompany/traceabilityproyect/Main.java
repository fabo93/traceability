/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.traceabilityproyect;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author pregrado
 */
public class Main {
    
    public static void main ( String[] args){
        
        Paso p=new Paso("45", "prueba", "COM");
        SessionFactory sf = Util.getSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        s.save(p);
        s.getTransaction().commit();
        s.close();
        
        System.out.print("Agregado");
        
    }
}
