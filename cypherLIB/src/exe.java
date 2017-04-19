/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class exe
{
    
    public static void main(String args[])
   {
      /* cesar_c_dos_claves cifrado = new cesar_c_dos_claves();
       System.out.println("Type text:"); 
       Scanner reader = new Scanner(System.in);
       String texto = reader.nextLine();
       String cif =cifrado.cifrar(texto, 5, 8);
       String decif=cifrado.decifrar(cif, 5, 8, cifrado.random);
       String clave = cifrado.generadorDeClave();
       System.out.println(cif); 
       System.out.println(decif); 
       System.out.println(clave); */
       try
        {
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese la ruta del archivo");
            String archivo1 = reader1.readLine();
            BufferedReader reader2 = new BufferedReader(new FileReader(archivo1));
            PrintWriter writer = new PrintWriter(archivo1+"_out");
            String linea = reader2.readLine();
            cesar_c_dos_claves cifrador;
            int i=0;
            while(linea!=null)
            {
                i++;
                cifrador = new cesar_c_dos_claves(i,i+30);
                String nlinea=cifrador.decifrar(cifrador.cifrar(linea));
                writer.println(cifrador.decifrar(cifrador.cifrar(linea)));
                linea=reader2.readLine();
            }
            reader2.close();
            writer.close();
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
       
       
       
   }
    
    
}
