/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.views;

import edu.uniandes.ecos.modelos.RangoTamano;
import edu.uniandes.ecos.modelos.ResumenArchivo;
import edu.uniandes.ecos.modelos.ResumenPrograma;


/**
 *
 * @author VirtualW7
 */
public class WebView {
    public String MostrarRangoTamanos(ResumenPrograma programa, RangoTamano tamanos)
    {
        //Muestra el nombre del programa
        String html = "<h1>Programa:"+ programa.getNombre()+"</h1>";

        //Recorre todas las clases del programa y muestra los resultados
        for (ResumenArchivo clase : programa.getArchivos()) {
            html += "<br>Clase:" + clase.getNombreArchivo();
            html += "<br>Lineas:" + clase.getNumeroLineas();
            html += "<br>Promedio:" + clase.getPromedioLineas();
        }

        html += "<br>--->Tamanos:";
        html += "<br>-Muy Grande:" + tamanos.getMuyGrande();
        html += "<br>-Grande:" + tamanos.getGrande();
        html += "<br>-Medio:" + tamanos.getMedio();
        html += "<br>-Pequeño:" + tamanos.getPequeno();
        html += "<br>-Muy Pequeño:" + tamanos.getMuyPequeno();

        html += "<br>------------------------------------------------";
        html += "<br>------------------------------------------------";
        
        return html;
    }
}
