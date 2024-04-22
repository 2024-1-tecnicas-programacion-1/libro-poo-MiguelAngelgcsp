package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal
{
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args)
    {
    
        System.out.println("Ingrese titulo del Libro ");
        String titulo=sc.nextLine();
        System.out.println("Ingrese autor del libro ");
        String autor=sc.nextLine();
        System.out.println("Ingrese año de publicacion ");
        String anodePublicacion=sc.nextLine();
        
       Libro libro1 = new Libro(""); 
   
       libro1.marcarLeido();
        
    
    
    }
    
}
