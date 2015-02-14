/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp;

import edu.uniandes.ecos.modelos.*;
import edu.uniandes.ecos.utilidades.Archivos;
import java.io.File;

/**
 *
 * @author VirtualW7
 */
public class ContadorClases {
    
    public ResumenPrograma ProcesarDirectorio(String directorio)
    {
        return ProcesarDirectorio(directorio, null);
    }
    
    private ResumenPrograma ProcesarDirectorio(String directorio, ResumenPrograma objResumenPrograma)
    {
        File[] clases = new File(directorio).listFiles();
        
        //Si la lista es null es la primera vez que entra, entonces instancia la lista
        if(objResumenPrograma == null)
        {
            objResumenPrograma = new ResumenPrograma();
            objResumenPrograma.setNombre(directorio);
        }
        
        
                
        for (File clase : clases) {
            if(clase.isDirectory())
            {
                //Procesa un nuevo directorio interno
                objResumenPrograma = ProcesarDirectorio(clase.getPath(), objResumenPrograma);
            }
            else
            {
               //Cuenta las lineas y agrega la clase al programa
               ContadorLineas objContador = new ContadorLineas();
               ResumenArchivo nuevaClase = objContador.ProcesarArchivo(clase.getName(), Archivos.LeerArchivo(clase.getPath()));
               objResumenPrograma.getArchivos().add(nuevaClase);
            }
        }

        return objResumenPrograma;
    }
}
