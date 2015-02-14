/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.views;

import edu.uniandes.ecos.modelos.RangoTamano;
import edu.uniandes.ecos.modelos.ResumenArchivo;
import edu.uniandes.ecos.modelos.ResumenPrograma;
import edu.uniandes.ecos.psp.MetodoPROBE;
import java.util.LinkedList;

/**
 *
 * @author VirtualW7
 */
public class ConsolaView {
    
    /***
     * Muestra los resultados de las pruebas que se le envien
     * @param listadoProbe 
     */
    
    public void MostrarRangoTamanos(ResumenPrograma programa, RangoTamano tamanos)
    {
        //Muestra el nombre del programa
        System.out.println("Programa:"+ programa.getNombre());


        for (ResumenArchivo clase : programa.getArchivos()) {
            System.out.println("Clase:" + clase.getNombreArchivo());
            System.out.println("Lineas:" + clase.getNumeroLineas());
            System.out.println("Promedio:" + clase.getPromedioLineas());
        }

        System.out.println("--->Tamanos:");
        System.out.println("-Muy Grande:" + tamanos.getMuyGrande());
        System.out.println("-Grande:" + tamanos.getGrande());
        System.out.println("-Medio:" + tamanos.getMedio());
        System.out.println("-Pequeño:" + tamanos.getPequeno());
        System.out.println("-Muy Pequeño:" + tamanos.getMuyPequeno());

        System.out.println("------------------------------------------------");
        System.out.println("------------------------------------------------");
    }
    
}
