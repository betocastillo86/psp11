/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.utilidades;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VirtualW7
 */
public class Archivos {
   
    public static String LeerArchivo(String ruta)
    {
        try {
            InputStream stream = new FileInputStream(ruta);
            int i = 0;
            String contenido = "";
            while   ((i = stream.read()) != -1)
            {
                contenido += (char)i;
            }
            return contenido;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
}
