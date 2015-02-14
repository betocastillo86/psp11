/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.datos;

import edu.uniandes.ecos.modelos.ResumenArchivo;
import edu.uniandes.ecos.modelos.ResumenPrograma;

/**
 *
 * @author Administrator
 */
public class Prueba1_PSP11 {
    public static ResumenPrograma Prueba1()
    {
        ResumenPrograma resumen = new ResumenPrograma();
        resumen.setNombre("Prueba 1");
        ResumenArchivo archivo1 = new ResumenArchivo();
        archivo1.setNombreArchivo("each_char");
        archivo1.setNumeroLineas(18);
        archivo1.setNumeroMetodos(3);
        resumen.getArchivos().add(archivo1);
         
        ResumenArchivo archivo2 = new ResumenArchivo();
        archivo2.setNombreArchivo("string_read");
        archivo2.setNumeroLineas(18);
        archivo2.setNumeroMetodos(3);
        resumen.getArchivos().add(archivo2);
        
        ResumenArchivo archivo3 = new ResumenArchivo();
        archivo3.setNombreArchivo("single_character");
        archivo3.setNumeroLineas(25);
        archivo3.setNumeroMetodos(3);
        resumen.getArchivos().add(archivo3);
        
        ResumenArchivo archivo4 = new ResumenArchivo();
        archivo4.setNombreArchivo("each_line");
        archivo4.setNumeroLineas(31);
        archivo4.setNumeroMetodos(3);
        resumen.getArchivos().add(archivo4);
        
        ResumenArchivo archivo5 = new ResumenArchivo();
        archivo5.setNombreArchivo("single_char");
        archivo5.setNumeroLineas(37);
        archivo5.setNumeroMetodos(3);
        resumen.getArchivos().add(archivo5);
        
        ResumenArchivo archivo6 = new ResumenArchivo();
        archivo6.setNombreArchivo("string_builder");
        archivo6.setNumeroLineas(82);
        archivo6.setNumeroMetodos(5);
        resumen.getArchivos().add(archivo6);
        
        ResumenArchivo archivo7 = new ResumenArchivo();
        archivo7.setNombreArchivo("string_manager");
        archivo7.setNumeroLineas(82);
        archivo7.setNumeroMetodos(4);
        resumen.getArchivos().add(archivo7);
        
        ResumenArchivo archivo8 = new ResumenArchivo();
        archivo8.setNombreArchivo("list_clump");
        archivo8.setNumeroLineas(87);
        archivo8.setNumeroMetodos(4);
        resumen.getArchivos().add(archivo8);
        
        ResumenArchivo archivo9 = new ResumenArchivo();
        archivo9.setNombreArchivo("list_clip");
        archivo9.setNumeroLineas(89);
        archivo9.setNumeroMetodos(4);
        resumen.getArchivos().add(archivo9);
        
        ResumenArchivo archivo10 = new ResumenArchivo();
        archivo10.setNombreArchivo("string_decrementer");
        archivo10.setNumeroLineas(230);
        archivo10.setNumeroMetodos(10);
        resumen.getArchivos().add(archivo10);
        
        ResumenArchivo archivo11 = new ResumenArchivo();
        archivo11.setNombreArchivo("Char");
        archivo11.setNumeroLineas(85);
        archivo11.setNumeroMetodos(3);
        resumen.getArchivos().add(archivo11);
        
        ResumenArchivo archivo12 = new ResumenArchivo();
        archivo12.setNombreArchivo("Character");
        archivo12.setNumeroLineas(87);
        archivo12.setNumeroMetodos(3);
        resumen.getArchivos().add(archivo12);
        
        ResumenArchivo archivo13 = new ResumenArchivo();
        archivo13.setNombreArchivo("Converter");
        archivo13.setNumeroLineas(558);
        archivo13.setNumeroMetodos(10);
        resumen.getArchivos().add(archivo13);
        
        return resumen;
        
    }
    
    
    public static ResumenPrograma Prueba2()
    {
        ResumenPrograma resumen = new ResumenPrograma();
        resumen.setNombre("Prueba 2");
        
        ResumenArchivo archivo1 = new ResumenArchivo();
        archivo1.setNombreArchivo("Preface");
        archivo1.setNumeroLineas(7);
        archivo1.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo1);
         
        ResumenArchivo archivo2 = new ResumenArchivo();
        archivo2.setNombreArchivo("Chapter 1");
        archivo2.setNumeroLineas(12);
        archivo2.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo2);
        
        ResumenArchivo archivo3 = new ResumenArchivo();
        archivo3.setNombreArchivo("Chapter 2");
        archivo3.setNumeroLineas(10);
        archivo3.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo3);
        
        ResumenArchivo archivo4 = new ResumenArchivo();
        archivo4.setNombreArchivo("Chapter 3");
        archivo4.setNumeroLineas(12);
        archivo4.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo4);
        
        ResumenArchivo archivo5 = new ResumenArchivo();
        archivo5.setNombreArchivo("Chapter 4");
        archivo5.setNumeroLineas(10);
        archivo5.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo5);
        
        ResumenArchivo archivo6 = new ResumenArchivo();
        archivo6.setNombreArchivo("Chapter 5");
        archivo6.setNumeroLineas(12);
        archivo6.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo6);
        
        ResumenArchivo archivo7 = new ResumenArchivo();
        archivo7.setNombreArchivo("Chapter 6");
        archivo7.setNumeroLineas(12);
        archivo7.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo7);
        
        ResumenArchivo archivo8 = new ResumenArchivo();
        archivo8.setNombreArchivo("Chapter 7");
        archivo8.setNumeroLineas(12);
        archivo8.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo8);
        
        ResumenArchivo archivo9 = new ResumenArchivo();
        archivo9.setNombreArchivo("Chapter 8");
        archivo9.setNumeroLineas(12);
        archivo9.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo9);
        
        ResumenArchivo archivo10 = new ResumenArchivo();
        archivo10.setNombreArchivo("Chapter 9");
        archivo10.setNumeroLineas(8);
        archivo10.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo10);
        
        ResumenArchivo archivo11 = new ResumenArchivo();
        archivo11.setNombreArchivo("Appendix A");
        archivo11.setNumeroLineas(8);
        archivo11.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo11);
        
        ResumenArchivo archivo12 = new ResumenArchivo();
        archivo12.setNombreArchivo("Appendix B");
        archivo12.setNumeroLineas(8);
        archivo12.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo12);
        
        ResumenArchivo archivo13 = new ResumenArchivo();
        archivo13.setNombreArchivo("Appendix C");
        archivo13.setNumeroLineas(20);
        archivo13.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo13);
        
        ResumenArchivo archivo14 = new ResumenArchivo();
        archivo14.setNombreArchivo("Appendix D");
        archivo14.setNumeroLineas(14);
        archivo14.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo14);
        
        ResumenArchivo archivo15 = new ResumenArchivo();
        archivo15.setNombreArchivo("Appendix E");
        archivo15.setNumeroLineas(18);
        archivo15.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo15);
        
        ResumenArchivo archivo16 = new ResumenArchivo();
        archivo16.setNombreArchivo("Appendix F");
        archivo16.setNumeroLineas(12);
        archivo16.setNumeroMetodos(1);
        resumen.getArchivos().add(archivo16);
        
        
        return resumen;
        
    }
}
