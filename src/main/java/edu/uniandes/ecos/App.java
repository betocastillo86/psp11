package edu.uniandes.ecos;

import edu.uniandes.ecos.datos.Prueba1_PSP11;
import edu.uniandes.ecos.modelos.*;
import edu.uniandes.ecos.psp.*;
import edu.uniandes.ecos.views.ConsolaView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ConsolaView vista = new ConsolaView();
        
        MetodoPROBE metodoProbe = new MetodoPROBE();
        
        //Calcula los datos de la prueba 1 y los muestra
        RangoTamano tamanos = metodoProbe.CalcularTamanos(Prueba1_PSP11.Prueba1());
        vista.MostrarRangoTamanos(Prueba1_PSP11.Prueba1(), tamanos);
        
        //Calcula los datos de la prueba 2
        tamanos = metodoProbe.CalcularTamanos(Prueba1_PSP11.Prueba2());
        vista.MostrarRangoTamanos(Prueba1_PSP11.Prueba2(), tamanos);

    }
}
