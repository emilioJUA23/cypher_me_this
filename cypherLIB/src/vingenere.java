/**
 *
 * @author lahashh
 */
import java.util.ArrayList;
public class vingenere 
{
    String clave;
    String Texto;
    ArrayList<Integer> vectorClave = new ArrayList<Integer>();
    byte[] data;
     
    public vingenere(String clave, String Texto)
    {
        this.clave = clave;
        this.Texto = Texto;
        for (int i = 0; i < clave.length(); i++) 
        {
            vectorClave.add((int)clave.charAt(i));
        }
        data=Texto.getBytes();
    }
    
    public String cifrar()
    {
        int clavepos=0;
        ArrayList<Integer> nuevosVal = new ArrayList<Integer>(); //lista temporal
        byte[] temp; // se declara el nuevo array escribir
        for (int i = 0; i < data.length; i++)
        {
            clavepos=i%vectorClave.size();
            int actual = data[i];              //obtenemos representacion entera
             actual = actual +vectorClave.get(clavepos);      //agregamos el corrimiento
             if (actual>=256)                   //revisamos que no exceda el limite
            {
               actual = actual % 256;           //si exce se hace un mod por 256
            }
             else if (actual<0)
            {
                actual = actual +256;           //en caso el corrimiento sea negativo y el numero sea menor se suma 256
            }
            else{}
             nuevosVal.add(actual);             //agrego valor a la lista
         
        }
        temp = new byte[nuevosVal.size()];     //defino tamanio de array
        int i =0;
        while(nuevosVal.size()>0)
        {
         temp[i]=nuevosVal.get(i).byteValue();   //inserto valor en array 
         nuevosVal.remove(i);                    //remuevo valor de la lista
        }
        String cambiado= new String(temp);       //crear string 
        return cambiado;                        //retornar string
    }
    
    public String decifrar()
    {
        int clavepos=0;
        ArrayList<Integer> nuevosVal = new ArrayList<Integer>(); //lista temporal
        byte[] temp; // se declara el nuevo array escribir
        for (int i = 0; i < data.length; i++)
        {
            clavepos=i%vectorClave.size();
            int actual = data[i];              //obtenemos representacion entera
            actual = actual -vectorClave.get(clavepos);      //agregamos el corrimiento
             if (actual>=256)                   //revisamos que no exceda el limite
            {
               actual = actual % 256;           //si exce se hace un mod por 256
            }
             else if (actual<0)
            {
                actual = actual +256;           //en caso el corrimiento sea negativo y el numero sea menor se suma 256
            }
            else{}
            nuevosVal.add(actual);             //agrego valor a la lista
         
        }
        temp = new byte[nuevosVal.size()];     //defino tamanio de array
        int i =0;
        while(nuevosVal.size()>0)
        {
         temp[i]=nuevosVal.get(i).byteValue();   //inserto valor en array 
         nuevosVal.remove(i);                    //remuevo valor de la lista
        }
        String cambiado= new String(temp);       //crear string 
        return cambiado;                        //retornar string
    }
    
    
    
}
