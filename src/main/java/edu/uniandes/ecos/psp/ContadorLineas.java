/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp;

import edu.uniandes.ecos.modelos.*;
import java.util.regex.Pattern;

/**
 *
 * @author VirtualW7
 */
public class ContadorLineas {
    public ResumenArchivo ProcesarArchivo(String nombreArchivo, String contenidoArchivo)
    {
        String[] lineas = contenidoArchivo.split(System.getProperty("line.separator"));
        
        ResumenArchivo resumen = new ResumenArchivo();
        resumen.setNombreArchivo(nombreArchivo);
        
        for (String linea : lineas) {
            int tipoLinea = ObtenerTipoDeLinea(linea);
            //Solo las lineas tipo 1 y tipo 2 deben ser validas para contar en el programa
            if(tipoLinea == 1 || tipoLinea == 2)
            {
                resumen.setNumeroLineas(resumen.getNumeroLineas()+1);
                if(tipoLinea == 2)
                    resumen.setNumeroMetodos(resumen.getNumeroMetodos()+1);
            }
        }
        
        return resumen;
    }
    
    private final static Pattern REGEX_METODO = Pattern.compile("^[ ]*(public|private|protected)[ ](?!class)([a-zA-Z0-9 _])+[\\(]([a-zA-Z0-9 _\\,\\.\\[\\]\\<\\>])*[\\)]([ ]|[\\t])*$");
    private final static Pattern REGEX_VACIO = Pattern.compile("^([ ]|[\\t])*[ ]*$");
    private final static Pattern REGEX_COMENTARIO = Pattern.compile("^(([ ]|[\\t])*)([\\/]{2,}|[*]|[\\/*]|[*\\/])");
    private final static Pattern REGEX_CORCHETE = Pattern.compile("^(([ ]|[\\t])*)([{]|[}])(([ ]|[\\t])*)$");
    private final static Pattern REGEX_PAQUETE_IMPORT = Pattern.compile("^[ ]*(package|import)");
    
    /*
    * Valida que tipo de linea es:
    * 1. Linea de Codigo Normal
    * 2. Inicio de Metodo
    * 3. Comentario
    * 4. Vacio
    * 5. Corchete
    */
    private int ObtenerTipoDeLinea(String linea)
    {
        //Valida los metodos
       if(ContadorLineas.REGEX_VACIO.matcher(linea).find())
       {
           return 4;
       }
       if(ContadorLineas.REGEX_COMENTARIO.matcher(linea).find())
       {
           return 3;
       }
       else if(ContadorLineas.REGEX_METODO.matcher(linea).find())
       {
           return 2;
       }
       else if (ContadorLineas.REGEX_CORCHETE.matcher(linea).find())
       {
           return 5;
       }
       else if (ContadorLineas.REGEX_PAQUETE_IMPORT.matcher(linea).find())
       {
           return 6;
       }
       else 
       {
           return 1;
       }
    }
    
            
}
