

/**
 *
@author lahashh
 * esta clase realiza un sistema clasico de cifrado cesar a dos claves
 * de momento no se ha definido si sera a nivel de archivos
 * o solo se utilizara a nivel de variables tipo string.
 * por simplicidad primero sera definido para trabajar con tipo string 
 * mas adelante de ser necesario se adaptara la logica de tipo
 * file
 */
import java.util.Random;
import java.util.ArrayList;
public class cesar_c_dos_claves 
{
    int corrimiento1 =0;     // indica la cantidad que sumaremos o restaremos
    int corrimiento2=0;    // la segunda forma de corrimento en cierta posicion 
    int random=0;
    Random gen = new Random();
    cesar_c cesar1;
    cesar_c cesar2;

    public cesar_c_dos_claves(int corrimiento1,int corrimiento2) 
    {
        this.corrimiento1=corrimiento1;
        this.corrimiento2=corrimiento2;
        this.random=gen.nextInt(20)+1;
        cesar1=new cesar_c(this.corrimiento1);
        cesar2=new cesar_c(this.corrimiento2);
    }

    
    
    public String cifrar(String texto)
    {   
        try
        {
            String cambiado="";
            String ayudante="";
            for (int i = 0; i < texto.length(); i++)
            {
                if (i%random==0)
                {
                  cambiado=cambiado+cesar1.cifrar(Character.toString(texto.charAt(i)));
                }
                else
                {
                  cambiado=cambiado+cesar2.cifrar(Character.toString(texto.charAt(i)));
                }

            }
            return cambiado;
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
            String cambiado="";
            String ayudante="";
            for (int i = 0; i < texto.length(); i++)
            {
                if (i%random==0)
                {
                  cambiado=cambiado+cesar1.decifrar(Character.toString(texto.charAt(i)));
                }
                else
                {
                  cambiado=cambiado+cesar2.decifrar(Character.toString(texto.charAt(i)));
                }

            }
            return cambiado;
        }
        catch(Exception ex)
        {
          return null;
        }
    }
    
    public String generadorDeClave()
    {
        String retorno;
        retorno = "ccdc|" + Integer.toString(corrimiento1)+","+Integer.toString(corrimiento2)+","+Integer.toString(random);
        return retorno;
    }
    
    
}
