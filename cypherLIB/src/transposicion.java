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
      byte[] temp=texto.getBytes();
      temp =espejo(temp);
      rehecho=new String(temp);
    }
    
    public byte[] espejo(byte[] realidad) //el metodo espejo voltea el array 
    {
      byte[] espejo =new byte[realidad.length];  //creo nuevo arrar
      for (int i = 0; i < espejo.length; i++) 
      {
        espejo[i]=realidad[realidad.length-1-i];  // guardo el viejo array en orden inverso
      }
     
      return espejo;                            //retorno el nuevo array
    }
    
    public String generadorDeClave()
    {
        String retorno="ct";
      return retorno;
    }
    
}

