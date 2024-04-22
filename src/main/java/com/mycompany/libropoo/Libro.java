package com.mycompany.libropoo;

public class Libro

{
    String titulo;
    String autor;
    int anoPublicacion;
    boolean leido = false;
    
  public Libro mostrarInformacion(String titulo, String autor,int anoPublicacion )
          
  {
    
      this.titulo = titulo;
      this.autor = autor;
      this.leido = false;
     return null;
      
  }
  
  public void marcarLeido() {
      this.leido=true;
      boolean mostrarInformacion = false;
      System.out.println(mostrarInformacion);
      
      
      
  }
  
  
  
}
