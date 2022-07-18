/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;
import paquete01.OperacionesTelevisor;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        ArrayList<Televisor> televisores = new ArrayList<>();
        Televisor t1 = new Televisor();

        t1.establecerMarca("LG-14 pulgadas");
        t1.establecerPrecio(300.2);

        Televisor t2 = new Televisor();
        t2.establecerMarca("SAMSUMG-21 pulgadas");
        t2.establecerPrecio(1300.2);

        Televisor t3 = new Televisor();
        t3.establecerMarca("RIVIERA-29 pulgadas");
        t3.establecerPrecio(2300.5);

        televisores.add(t1);
        televisores.add(t2);
        televisores.add(t3);

        OperacionesTelevisor operaciones = new OperacionesTelevisor();
        operaciones.establecerTelevisor(televisores);
        System.out.println("-----------------");
        operaciones.calcularTotalPrecioTvs();
        operaciones.calculartelevisorMasCaro();
        operaciones.listaMarcasVendidas();

        System.out.println(operaciones);

    }
}
