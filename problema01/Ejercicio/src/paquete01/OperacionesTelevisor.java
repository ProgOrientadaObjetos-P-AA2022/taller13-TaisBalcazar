/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class OperacionesTelevisor {

    private ArrayList<Televisor> televisores;
    private double totalPrecios;
    private double tvCaro = 0;
    private String marcas;

    public void establecerTelevisor(ArrayList<Televisor> lista) {
        televisores = lista;
    }

    public ArrayList<Televisor> obtenerTelevisor() {
        return televisores;
    }

    public void calcularTotalPrecioTvs() {
        for (int i = 0; i < televisores.size(); i++) {
            totalPrecios = totalPrecios + televisores.get(i).obtenerPrecio();
        }
    }

    public double obtenertotalPrecio() {
        return totalPrecios;
    }

    public void calculartelevisorMasCaro() {
        for (int j = 0; j < televisores.size(); j++) {
            if (televisores.get(j).obtenerPrecio() > tvCaro) {
                tvCaro = televisores.get(j).obtenerPrecio();
            }
        }
    }

    public double obtenertelevisorCaro() {
        return tvCaro;
    }

    public void listaMarcasVendidas() {
        marcas = "";
        for (int i = 0; i < televisores.size(); i++) {
            marcas = String.format("%s\n%s",
                    marcas,
                    televisores.get(i).obtenerMarca());
        }
    }

    public String obtenerListaMarcas() {
        return marcas;
    }

    @Override

    public String toString() {

        String cadena = String.format("Total precios televisores: %.2f\n"
                + "-----------------\n"
                + "Televisor mas caro: %.2f\n"
                + "-----------------\n"
                + "Lista de marcas: %s\n",
                totalPrecios,
                tvCaro,
                marcas);

        return cadena;
    }
}
