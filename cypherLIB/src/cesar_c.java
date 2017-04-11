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
    
    public String cifrar(String texto,int corr)
    {   //el corrimiento se hace a nivel de bytes por lo tanto 
        //la representacion de entero no debe ser mayor a 256
        corrimiento= corr%256;
        text = texto; //asegurar que el string este vacio 
        data=text.getBytes();
        byte[] temp; // se declara el nuevo array escribir
        ArrayList<Integer> nuevosVal = new ArrayList<Integer>(); //lista temporal
        for (int i = 0; i < data.length; i++)   //recorre toda la lista de bytes que genero el mensaje 
        {
             int actual = data[i];              //obtenemos representacion entera
             actual = actual +corrimiento;      //agregamos el corrimiento
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
        while(nuevosVal.size()>i)
        {
         temp[i]=nuevosVal.get(i).byteValue();   //inserto valor en array 
         i++;                  //remuevo valor de la lista
        }
        String cambiado= new String(temp);       //crear string 
        return cambiado;                        //retornar string
    }
    
    public String decifrar(String texto,int corr)
    {   //el corrimiento se hace a nivel de bytes por lo tanto 
        //la representacion de entero no debe ser mayor a 256
        corrimiento= corr%256;
        text = texto; //asegurar que el string este vacio 
        data=text.getBytes();
        byte[] temp; // se declara el nuevo array escribir
        ArrayList<Integer> nuevosVal = new ArrayList<Integer>(); //lista temporal
        for (int i = 0; i < data.length; i++)   //recorre toda la lista de bytes que genero el mensaje 
        {
             int actual = data[i];              //obtenemos representacion entera
             actual = actual -corrimiento;      //agregamos el corrimiento
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
        while(nuevosVal.size()>i)
        {
         temp[i]=nuevosVal.get(i).byteValue();   //inserto valor en array 
         i++;                                    //remuevo valor de la lista
        }
        String cambiado= new String(temp);       //crear string 
        return cambiado;         
    }
    
    public String generadorDeClave()
    {
        String retorno;
        retorno = "cc|" + Integer.toString(corrimiento);
    
      return retorno;
    }
    
    
    
    
}
