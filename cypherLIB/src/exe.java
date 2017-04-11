/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
import java.util.*;
public class exe
{
    
    public static void main(String args[])
   {
       cesar_c_dos_claves cifrado = new cesar_c_dos_claves();
       System.out.println("Type text:"); 
       Scanner reader = new Scanner(System.in);
       String texto = reader.nextLine();
       String cif =cifrado.cifrar(texto, 5, 8);
       String decif=cifrado.decifrar(cif, 5, 8, cifrado.random);
       String clave = cifrado.generadorDeClave();
       System.out.println(cif); 
       System.out.println(decif); 
       System.out.println(clave); 
   }
    
    
}
