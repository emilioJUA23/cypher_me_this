/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
public class Comparer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try 
        {
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Bienvenido al comparador de archivos");
            System.out.println("Ingrese la ruta del primer archivo");
            String archivo1 = reader1.readLine();
            System.out.println("Ingrese la ruta del segundo archivo");
            String archivo2 = reader1.readLine();
            BufferedReader reader2 = new BufferedReader(new FileReader(archivo2));
            reader1 = new BufferedReader(new FileReader(archivo1));
            archivo1=reader1.readLine();
            archivo2=reader2.readLine();
            int i=1;
            while(archivo1!=null&&archivo2!=null)
            {
                if (!archivo1.equals(archivo2))
                {
                   System.out.println("linea con diferencias detectada : linea "+Integer.toString(i)); 
                   System.out.println(archivo1 +"   "+archivo2); 
                }
            archivo1=reader1.readLine();
            archivo2=reader2.readLine();
            i++;
            }
            reader1.close();
            reader2.close();
          
        }
        catch(Exception e)
        {
           System.out.println(e.getCause().toString());
        }
    }
    
}
