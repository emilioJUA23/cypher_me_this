/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filegenerator;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Random;
/**
 *
 * @author root
 */
public class FileGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        try
        {
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese la ruta del archivo con todo y nombre de salida");
            String archivo1 = reader1.readLine();
            PrintWriter writer = new PrintWriter(archivo1, "UTF-8");
            System.out.println("Ingrese la cantidad de cadenas deseadas:");
            int lineas = Integer.parseInt(reader1.readLine());
            System.out.println("Ingrese el largo de las cadenas deseadas:");
            int largo = Integer.parseInt(reader1.readLine());
            Random rand;
            String cad="";
            for (int i = 0; i < lineas; i++)
            {
                cad="";
                for (int j = 0; j < largo; j++)
                {
                    //System.out.println(randInt());
                    cad=cad+(char)randInt();
                }
                writer.println(cad);
            }
            writer.close();
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    public static int randInt() 
    { 
        Random a = new Random();
        return 1+ a.nextInt(Character.MAX_VALUE-1);
    }
    
}
