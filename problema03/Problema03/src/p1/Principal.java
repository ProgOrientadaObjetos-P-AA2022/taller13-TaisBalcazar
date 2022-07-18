/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
         */

        Estudiante e = new Estudiante();
        e.establecerNombres("Tais Balcázar");
        e.establecerUserName("tbbalcazar");
        ArrayList<Correo> lista = new ArrayList<>();

        DominioGmail d1 = new DominioGmail();
        d1.establecerDominio("gmail.com");
        Correo c = new Correo();
        c.establecerDominio(d1);
        c.establecerUserName(e.obtenerUserName());
        c.establecerCorreo();
        lista.add(c);

        Gobierno d2 = new Gobierno();
        d2.establecerDominio("gobiernoec.gob");
        Correo c2 = new Correo();
        c2.establecerDominio(d2);
        c2.establecerUserName(e.obtenerUserName());
        c2.establecerCorreo();
        lista.add(c2);


        Outlook d3 = new Outlook();
        d3.establecerDominio("outlook.com");
        Correo c3 = new Correo();
        c3.establecerDominio(d3);
        c3.establecerUserName(e.obtenerUserName());
        c3.establecerCorreo();
        lista.add(c3);

        
        Utpl d4 = new Utpl();
        d4.establecerDominio("utpl.edu.ec");
        Correo c4 = new Correo();
        c4.establecerDominio(d4);
        c4.establecerUserName(e.obtenerUserName());
        c4.establecerCorreo();
        lista.add(c4);


        Yahoo d5 = new Yahoo();
        d5.establecerDominio("utpl.edu.ec");
        Correo c5 = new Correo();
        c5.establecerDominio(d5);
        c5.establecerUserName(e.obtenerUserName());
        c5.establecerCorreo();
        lista.add(c5);


        e.establecerCorreos(lista);

        System.out.printf("%s\n", e);

    }

}
