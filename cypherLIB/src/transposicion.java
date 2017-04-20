/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lahashh
 * este cifrado arregla un string a nivel de bytes de manera inversa
 */
public class transposicion 
{
    String  rehecho="";
    public transposicion(String texto)
    {
      rehecho=espejo(texto);
    }
    
    public String espejo(String realidad) //el metodo espejo voltea el texto
    {
      String espejo ="";
      for (int i = realidad.length()-1; i >=0; i--) 
      {
         espejo=espejo+realidad.charAt(i);
      }
      return espejo;
    }
    
    public String generadorDeClave()
    {
        String retorno="ct";
        return retorno;
    }
    
}

