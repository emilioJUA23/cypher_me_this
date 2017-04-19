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
    
    public cesar_c(int corrimiento) // aqui se declara la intancea de la clase 
    {
      this.corrimiento=corrimiento;
    }
    public int casteado(int in)//comprueba que el entero este dentro de los valores unicode permitidos
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
    
    public String cifrar(String texto)
    {   
        try
        {
           int cor =casteado(corrimiento);    //casteamos el corrimiento
           String cambiado="";                //declaramos el nuevo string
           for (int i = 0; i < texto.length(); i++)
           {
               cambiado = cambiado+(char)casteado(texto.charAt(i)+cor); //agregamos al nuevo string el caracter desfazado
           }
           return cambiado;   //devolvemos el cambio
        }
        catch(Exception ex)
        {
          return null;
        }
    }
    
    public String decifrar(String texto)
    {
        try
        {
           int cor =casteado(corrimiento);    //casteamos el corrimiento
           String cambiado="";                //declaramos el nuevo string
           for (int i = 0; i < texto.length(); i++)
           {
               cambiado = cambiado+(char)casteado(texto.charAt(i)-cor); //agregamos al nuevo string el caracter desfazado
           }
           return cambiado;   //devolvemos el cambio
        }
        catch(Exception ex)
        {
          return null;
        }
    }
    
    public String generadorDeClave()
    {
        String retorno;
        retorno = "cc|" + Integer.toString(corrimiento);
    
      return retorno;
    }
    
    
    
    
}
