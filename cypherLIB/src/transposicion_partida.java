
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lahashh
 */

public class transposicion_partida 
{
    int tamanio;
    String rehecho;
    byte[] cadena; 

    public transposicion_partida(int tamanio,String mensaje) 
    {
        this.tamanio = tamanio;                 //instanceo de variables necesarias
        this.cadena= mensaje.getBytes();        
    }
    
    public void espejo()
    {
        int punteroGuia=0;
        byte[] temp= new byte[cadena.length];                        //nuevo a arreglo de bytes 
        byte[] umkehr=new byte[tamanio];                      //arreglo de tamanio pequenio 
        transposicion t= new transposicion("");  //instancea de tranposicion 
        for (int i = 0; i < tamanio; i++)
        {
            if (i+punteroGuia <cadena.length) 
            {
                umkehr[i]=cadena[i+punteroGuia];
            }
            else
            {
            
            }
           
        }
        
    }
    
    
    public String generadorDeClave()
    {
      String retorno="ctp"+Integer.toString(tamanio);
      return retorno;
    }
    
}
