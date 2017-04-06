

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
    int corrimiento =0;     // indica la cantidad que sumaremos o restaremos
    int corrimiento_1=0;    // la segunda forma de corrimento en cierta posicion 
    String text ="";        // este es el texto que el usuario desea cifrar
    byte[] data;            // aqui se almacena toda la data a nivel de bytes 
    int random=0;
    Random gen = new Random();

    public cesar_c_dos_claves() 
    {
        random = gen.nextInt(50);
    }
    
    public String cifrar(String texto,int corr,int corr2)
    {   //el corrimiento se hace a nivel de bytes por lo tanto 
        //la representacion de entero no debe ser mayor a 256
        corrimiento= corr%256;
        corrimiento_1=corr2%256;
        text = texto;          //asegurar que el string este vacio 
        data=text.getBytes();
        byte[] temp; // se declara el nuevo array escribir
        ArrayList<Integer> nuevosVal = new ArrayList<Integer>(); //lista temporal
        for (int i = 0; i < data.length; i++)   //recorre toda la lista de bytes que genero el mensaje 
        {
             int actual = data[i];              //obtenemos representacion entera
             if (i%random==0)
             {
               actual = actual +corrimiento_1;      //agregamos el corrimiento 
             }
             else
             {
               actual = actual +corrimiento;      //agregamos el corrimiento
             }

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
         i++;                    //remuevo valor de la lista
        }
        String cambiado= new String(temp);       //crear string 
        return cambiado;                        //retornar string
    }
    
     public String decifrar(String texto,int corr,int corr2,int pos)
    {   //el corrimiento se hace a nivel de bytes por lo tanto 
        //la representacion de entero no debe ser mayor a 256
        corrimiento= corr%256;
        corrimiento_1=corr2%256;
        random=pos;
        text = texto; //asegurar que el string este vacio 
        data=text.getBytes();
        byte[] temp; // se declara el nuevo array escribir
        ArrayList<Integer> nuevosVal = new ArrayList<Integer>(); //lista temporal
        for (int i = 0; i < data.length; i++)   //recorre toda la lista de bytes que genero el mensaje 
        {
             int actual = data[i];              //obtenemos representacion entera
             if (i%pos==0)
             {
              actual = actual -corrimiento_1;      //agregamos el corrimiento 
             }
             else
             {
                 actual = actual -corrimiento;      //agregamos el corrimiento
             }
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
        retorno = "ccdc|" + Integer.toString(corrimiento)+","+Integer.toString(corrimiento_1)+","+Integer.toString(random);
      return retorno;
    }
    
    
}
