/**
 *
 * @author lahashh
 * esta clase realiza un sistema clasico de cifrado cesar
 * de momento no se ha definido si sera a nivel de archivos
 * o solo se utilizara a nivel de variables tipo string.
 * por simplicidad primero sera definido para trabajar con tipo string 
 * mas adelante de ser necesario se adaptara la logica de tipo
 * file
 */
import java.util.ArrayList;
public class cesar_c 
{
    int corrimiento =0;     // indica la cantidad que sumaremos o restaremos
    String text ="";        // este es el texto que el usuario desea cifrar
    byte[] data;            // aqui se almacena toda la data a nivel de bytes 
    
    public cesar_c() // aqui se declara la intancea de la clase 
    {
    
    }
    public int casteado(int in)//comprueba que el corrimiento no pase de 256 que es lo maximo en archivos asccii
    {
        if (in>=Character.MAX_VALUE)
        {
          return in%Character.MAX_VALUE;    
        }
        else if (in <0)
        {
            int out=in;
            while(out<0)
            {
             out = out +Character.MAX_VALUE;
          
            }   
            return out;
        }
        else    
        {
            return in;
        }
    }
    
    public String cifrar(String texto,int corr)
    {   
        try
        {
           int cor =casteado(corr);
           String cambiado="";
           for (int i = 0; i < texto.length(); i++)
           {
               cambiado = cambiado+(char)casteado(texto.charAt(i)+cor);
           }
           return cambiado;
        }
        catch(Exception ex)
        {
          return "";
        }
    }
    
    public String decifrar(String texto,int corr)
    {
        try
        {
           int cor =casteado(corr);
           String cambiado="";
           for (int i = 0; i < texto.length(); i++)
           {
               cambiado = cambiado+(char)casteado(texto.charAt(i)-cor);
           }
           return cambiado;
        }
        catch(Exception ex)
        {
          return "";
        }
    }
    
    public String generadorDeClave()
    {
        String retorno;
        retorno = "cc|" + Integer.toString(corrimiento);
    
      return retorno;
    }
    
    
    
    
}
