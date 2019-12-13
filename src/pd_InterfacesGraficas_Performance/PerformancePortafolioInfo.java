/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd_InterfacesGraficas_Performance;

import AppPackage.AnimationClass;
import java.awt.Dimension;


/**
Propiedad: Colectiva de uso gratuito público
Desarrollado por: Sebastian Viscarra, Autor y compilador del proyecto PX para red social discreta de aplicación.
Todo el contenido de esta aplicación excepto los logos de PD y PX design son 100% editables para todo el desarrollo colectivo de cualquier usuario de información.
Así como su libre edición y utilización es 100% responsabilidad de cada usuario como utilice o mal utilice esta plataforma para fines comerciales o lucrativos. 
El contenido de esta plataforma está disponible desde su origen de forma libre y gratuita y de ser vendido o redistribuido por usuarios externos que no den soporte a sus clientes, 
PD y PX design no se hace responsable de dar soporte a ningún usuario que haya obtenido esta plataforma desde otro medio. 
Usted puede aprender como realizar esta plataforma desde su origen hasta su final de forma pratica 100% gratuita en el siguiente enlace:
https://www.youtube.com/watch?v=nqPzNS-pARY&list=PLshdAl3NxgtfaAB1Ef2I4McKfEulp6P9i
 */
public class PerformancePortafolioInfo extends javax.swing.JPanel {
    
    

    //////////////// Interfaces graficas /////////////////
    //// TAG1 : *Hace Referencia A Interfaces y Diseño Visual De La Aplicacion*
    //// Comentario: este tag esta añadido a las ordenes que estan relacionadas con el contenido grafico de la aplicacion
    //// y no obstaculiza ninguna logica ni metodo en este programa
    
     //////////////// Animaciones graficas /////////////////
     ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
     //// Comentario: este tag esta añadido a las ordenes que estan relacionadas con animaiones de la aplicacion y su edicion puede
     ////afectar el funcionamiento grafico de algunas caracteristicas como menus y proyectos del usuario
    
    
    
    
 //////////// SECCION DE TRANSICIONES //////////////////////////
    public PerformancePortafolioInfo() {
        initComponents();
        Img=10;//////////// Variable de cantidad de imagenes que se visualizaran
        btnDerecho1.setVisible(true);
        btnIzquierdo1.setVisible(true);
         
        btnDerecho2.setVisible(false);
        btnIzquierdo2.setVisible(false);
        
        btnDerecho3.setVisible(false);
        btnIzquierdo3.setVisible(false);
        
        btnDerecho4.setVisible(false);
        btnIzquierdo4.setVisible(false);
        
        btnDerecho5.setVisible(false);
        btnIzquierdo5.setVisible(false);
        
        btnDerecho6.setVisible(false);
        btnIzquierdo6.setVisible(false);
        
        btnDerecho7.setVisible(false);
        btnIzquierdo7.setVisible(false);
        
        btnDerecho8.setVisible(false);
        btnIzquierdo8.setVisible(false);
        
        btnDerecho9.setVisible(false);
        btnIzquierdo9.setVisible(false);
        
        btnDerecho10.setVisible(false);
        btnIzquierdo10.setVisible(false);
     
    }
    
  ////////////////COMENTARIOS DE PROYECTOS DE ORTAFOLIO/////////  
  comentario_Portafolio1 coment1 = new comentario_Portafolio1();
  comentario_Portafolio1 coment2 = new comentario_Portafolio1();
  comentario_Portafolio1 coment3 = new comentario_Portafolio1();
  ////////////////COMENTARIOS DE PROYECTOS DE ORTAFOLIO/////////  
  
  
//////// Este metodo visualiza las imagenes de nuestro proyecto //////////
byte Img;//////////// Variable de cantidad de imagenes que se visualizaran

////////////////METODOS DE TRANSICION DE IMAGENES /////////////////////////

  ///////////////////Transicion de imagen 1
  void TransicionDerecha1(){
      
      if(proyectoIMG2.getX()==985){
          
          
          
           if(IMG.getText().equals("1")){
         
          AnimationClass IMG1 = new AnimationClass(); // Estamos ocultando la imagen 1
          IMG1.jLabelXLeft(1, -985, 1, 2, proyectoIMG1);
          
          AnimationClass IMG2 = new AnimationClass(); // Estamos viendo la imagen 2
          IMG2.jLabelXLeft(985, 1, 1, 2, proyectoIMG2);
      
          System.out.println("se esta visualizando la imagen 1, se hace la transicion de la "
                              + "imagen 2 y se esconde la imagen 1");
             IMG.setText("2");///////////////////////////
          btnDerecho1.setVisible(false);
          btnIzquierdo1.setVisible(false);
          btnDerecho2.setVisible(true);
          btnIzquierdo2.setVisible(true);
          btnDerecho3.setVisible(false);
          btnIzquierdo3.setVisible(false);
       } 
          
      }
      
      
    
  
  }
  void TransicionIzquierda1(){
      
      if(proyectoIMG2.getX()==1)
      if(IMG.getText().equals("2")){
         
          AnimationClass IMG1 = new AnimationClass();///// Estamos viendo la imagen 1
          IMG1.jLabelXRight(-985, 1, 1, 2, proyectoIMG1);
          
          AnimationClass IMG2 = new AnimationClass();///// Estamos ocultando la imagen 2
          IMG2.jLabelXRight(1, 985, 1, 2, proyectoIMG2);
      
          System.out.println("se esta visualizando la imagen 2, se hace la transicion de la "
                              + "imagen 1 y se esconde la imagen 2");
          
          
           IMG.setText("1");
      
      } 
    
  
  }
  ///////////////////Transicion de imagen 2
  void TransicionDerecha2(){
      
      if(proyectoIMG2.getX()==1){
          
          
          
           if(IMG.getText().equals("2")){
         
          AnimationClass IMG2 = new AnimationClass(); // Estamos ocultando la imagen 2
          IMG2.jLabelXLeft(1, -985, 1, 2, proyectoIMG2);
          
          AnimationClass IMG3 = new AnimationClass(); // Estamos viendo la imagen 3
          IMG3.jLabelXLeft(985, 1, 1, 2, proyectoIMG3);
      
          System.out.println("se esta visualizando la imagen 2, se hace la transicion de la "
                              + "imagen 3 y se esconde la imagen 2");
             IMG.setText("3");///////////////////////////
          btnDerecho1.setVisible(false);
          btnIzquierdo1.setVisible(false);
          btnDerecho2.setVisible(false);
          btnIzquierdo2.setVisible(false);
          btnDerecho3.setVisible(true);
          btnIzquierdo3.setVisible(true);
          
       } 
          
      }
      
      
    
  
  }
  void TransicionIzquierda2(){
      
      if(proyectoIMG2.getX()==1)
      if(IMG.getText().equals("2")){
         
          AnimationClass IMG1 = new AnimationClass();///// Estamos viendo la imagen 1
          IMG1.jLabelXRight(-985, 1, 1, 2, proyectoIMG1);
          
          AnimationClass IMG2 = new AnimationClass();///// Estamos ocultando la imagen 2
          IMG2.jLabelXRight(1, 985, 1, 2, proyectoIMG2);
      
          System.out.println("se esta visualizando la imagen 2, se hace la transicion de la "
                              + "imagen 1 y se esconde la imagen 2");
           btnDerecho1.setVisible(true);
           btnIzquierdo1.setVisible(true);
         
           btnDerecho2.setVisible(false);
           btnIzquierdo2.setVisible(false);
        
           btnDerecho3.setVisible(false);
           btnIzquierdo3.setVisible(false);
            
           IMG.setText("1");
      
      } 
    
  
  }
  ///////////////////Transicion de imagen 3
  void TransicionDerecha3(){
      
      if(proyectoIMG3.getX()==1){
          
          
          
           if(IMG.getText().equals("3")){
         
          AnimationClass IMG3 = new AnimationClass(); // Estamos ocultando la imagen 3
          IMG3.jLabelXLeft(1, -985, 1, 2, proyectoIMG3);
          
          AnimationClass IMG4 = new AnimationClass(); // Estamos viendo la imagen 4
          IMG4.jLabelXLeft(985, 1, 1, 2, proyectoIMG4);
      
          System.out.println("se esta visualizando la imagen 3, se hace la transicion de la "
                              + "imagen 4 y se esconde la imagen 3");
          IMG.setText("4");///////////////////////////
          btnDerecho1.setVisible(false);
          btnIzquierdo1.setVisible(false);
          btnDerecho2.setVisible(false);
          btnIzquierdo2.setVisible(false);
          btnDerecho3.setVisible(false);
          btnIzquierdo3.setVisible(false);
          btnDerecho4.setVisible(true);
          btnIzquierdo4.setVisible(true);
          
       } 
          
      }
      
      
    
  
  }
  void TransicionIzquierda3(){
      
      if(proyectoIMG3.getX()==1)
      if(IMG.getText().equals("3")){
         
          AnimationClass IMG2 = new AnimationClass();///// Estamos viendo la imagen 2
          IMG2.jLabelXRight(-985, 1, 1, 2, proyectoIMG2);
          
          AnimationClass IMG3 = new AnimationClass();///// Estamos ocultando la imagen 3
          IMG3.jLabelXRight(1, 985, 1, 2, proyectoIMG3);
      
          System.out.println("se esta visualizando la imagen 3, se hace la transicion de la "
                              + "imagen 2 y se esconde la imagen 3");
           btnDerecho1.setVisible(false);
           btnIzquierdo1.setVisible(false);
         
           btnDerecho2.setVisible(true);
           btnIzquierdo2.setVisible(true);
        
           btnDerecho3.setVisible(false);
           btnIzquierdo3.setVisible(false);
            
           IMG.setText("2");
      
      } 
    
  
  }
  ///////////////////Transicion de imagen 4
  void TransicionDerecha4(){
      
      if(proyectoIMG4.getX()==1){
          
          
          
           if(IMG.getText().equals("4")){
         
          AnimationClass IMG4 = new AnimationClass(); // Estamos ocultando la imagen 4
          IMG4.jLabelXLeft(1, -985, 1, 2, proyectoIMG4);
          
          AnimationClass IMG5 = new AnimationClass(); // Estamos viendo la imagen 5
          IMG5.jLabelXLeft(985, 1, 1, 2, proyectoIMG5);
      
          System.out.println("se esta visualizando la imagen 4, se hace la transicion de la "
                              + "imagen 5 y se esconde la imagen 4");
          IMG.setText("5");///////////////////////////
          btnDerecho1.setVisible(false);
          btnIzquierdo1.setVisible(false);
          btnDerecho2.setVisible(false);
          btnIzquierdo2.setVisible(false);
          btnDerecho3.setVisible(false);
          btnIzquierdo3.setVisible(false);
          btnDerecho4.setVisible(false);
          btnIzquierdo4.setVisible(false);
          btnDerecho5.setVisible(true);
          btnIzquierdo5.setVisible(true);
          
       } 
          
      }
      
      
    
  
  }
  void TransicionIzquierda4(){
      
      if(proyectoIMG4.getX()==1)
      if(IMG.getText().equals("4")){
         
          AnimationClass IMG3 = new AnimationClass();///// Estamos viendo la imagen 3
          IMG3.jLabelXRight(-985, 1, 1, 2, proyectoIMG3);
          
          AnimationClass IMG4 = new AnimationClass();///// Estamos ocultando la imagen 4
          IMG4.jLabelXRight(1, 985, 1, 2, proyectoIMG4);
      
          System.out.println("se esta visualizando la imagen 4, se hace la transicion de la "
                              + "imagen 3 y se esconde la imagen 4");
           btnDerecho1.setVisible(false);
           btnIzquierdo1.setVisible(false);
         
           btnDerecho2.setVisible(false);
           btnIzquierdo2.setVisible(false);
        
           btnDerecho3.setVisible(true);
           btnIzquierdo3.setVisible(true);
           
           btnDerecho4.setVisible(false);
           btnIzquierdo4.setVisible(false);
            
           IMG.setText("3");
      
      } 
    
  
  }
  ///////////////////Transicion de imagen 5
  void TransicionDerecha5(){
      
      if(proyectoIMG5.getX()==1){
          
          
          
           if(IMG.getText().equals("5")){
         
          AnimationClass IMG5 = new AnimationClass(); // Estamos ocultando la imagen 5
          IMG5.jLabelXLeft(1, -985, 1, 2, proyectoIMG5);
          
          AnimationClass IMG6 = new AnimationClass(); // Estamos viendo la imagen 6
          IMG6.jLabelXLeft(985, 1, 1, 2, proyectoIMG6);
      
          System.out.println("se esta visualizando la imagen 5, se hace la transicion de la "
                              + "imagen 6 y se esconde la imagen 5");
          IMG.setText("6");///////////////////////////
          btnDerecho1.setVisible(false);
          btnIzquierdo1.setVisible(false);
          btnDerecho2.setVisible(false);
          btnIzquierdo2.setVisible(false);
          btnDerecho3.setVisible(false);
          btnIzquierdo3.setVisible(false);
          btnDerecho4.setVisible(false);
          btnIzquierdo4.setVisible(false);
          btnDerecho5.setVisible(false);
          btnIzquierdo5.setVisible(false);
          btnDerecho6.setVisible(true);
          btnIzquierdo6.setVisible(true);
          
       } 
          
      }
      
      
    
  
  }
  void TransicionIzquierda5(){
      
      if(proyectoIMG5.getX()==1)
      if(IMG.getText().equals("5")){
         
          AnimationClass IMG4 = new AnimationClass();///// Estamos viendo la imagen 4
          IMG4.jLabelXRight(-985, 1, 1, 2, proyectoIMG4);
          
          AnimationClass IMG5 = new AnimationClass();///// Estamos ocultando la imagen 5
          IMG5.jLabelXRight(1, 985, 1, 2, proyectoIMG5);
      
          System.out.println("se esta visualizando la imagen 5, se hace la transicion de la "
                              + "imagen 4 y se esconde la imagen 5");
           btnDerecho1.setVisible(false);
           btnIzquierdo1.setVisible(false);
         
           btnDerecho2.setVisible(false);
           btnIzquierdo2.setVisible(false);
        
           btnDerecho3.setVisible(false);
           btnIzquierdo3.setVisible(false);
           
           btnDerecho4.setVisible(true);
           btnIzquierdo4.setVisible(true);
           
           btnDerecho5.setVisible(false);
           btnIzquierdo5.setVisible(false);
            
           IMG.setText("4");
      
      } 
    
  
  }
  ///////////////////Transicion de imagen 6
  void TransicionDerecha6(){
      
      if(proyectoIMG6.getX()==1){
          
          
          
           if(IMG.getText().equals("6")){
         
          AnimationClass IMG6 = new AnimationClass(); // Estamos ocultando la imagen 6
          IMG6.jLabelXLeft(1, -985, 1, 2, proyectoIMG6);
          
          AnimationClass IMG7 = new AnimationClass(); // Estamos viendo la imagen 7
          IMG7.jLabelXLeft(985, 1, 1, 2, proyectoIMG7);
      
          System.out.println("se esta visualizando la imagen 6, se hace la transicion de la "
                              + "imagen 7 y se esconde la imagen 6");
          IMG.setText("7");///////////////////////////
          btnDerecho1.setVisible(false);
          btnIzquierdo1.setVisible(false);
          btnDerecho2.setVisible(false);
          btnIzquierdo2.setVisible(false);
          btnDerecho3.setVisible(false);
          btnIzquierdo3.setVisible(false);
          btnDerecho4.setVisible(false);
          btnIzquierdo4.setVisible(false);
          btnDerecho5.setVisible(false);
          btnIzquierdo5.setVisible(false);
          btnDerecho6.setVisible(false);
          btnIzquierdo6.setVisible(false);
          btnDerecho7.setVisible(true);
          btnIzquierdo7.setVisible(true);
          
       } 
          
      }
      
      
    
  
  }
  void TransicionIzquierda6(){
      
      if(proyectoIMG6.getX()==1)
      if(IMG.getText().equals("6")){
         
          AnimationClass IMG5 = new AnimationClass();///// Estamos viendo la imagen 5
          IMG5.jLabelXRight(-985, 1, 1, 2, proyectoIMG5);
          
          AnimationClass IMG6 = new AnimationClass();///// Estamos ocultando la imagen 6
          IMG6.jLabelXRight(1, 985, 1, 2, proyectoIMG6);
      
          System.out.println("se esta visualizando la imagen 6, se hace la transicion de la "
                              + "imagen 5 y se esconde la imagen 6");
           btnDerecho1.setVisible(false);
           btnIzquierdo1.setVisible(false);
         
           btnDerecho2.setVisible(false);
           btnIzquierdo2.setVisible(false);
        
           btnDerecho3.setVisible(false);
           btnIzquierdo3.setVisible(false);
           
           btnDerecho4.setVisible(false);
           btnIzquierdo4.setVisible(false);
           
           btnDerecho5.setVisible(true);
           btnIzquierdo5.setVisible(true);
           
           btnDerecho6.setVisible(false);
           btnIzquierdo6.setVisible(false);
            
           IMG.setText("5");
      
      } 
    
  
  }
  ///////////////////Transicion de imagen 7
  void TransicionDerecha7(){
      
      if(proyectoIMG7.getX()==1){
          
          
          
           if(IMG.getText().equals("7")){
         
          AnimationClass IMG7 = new AnimationClass(); // Estamos ocultando la imagen 7
          IMG7.jLabelXLeft(1, -985, 1, 2, proyectoIMG7);
          
          AnimationClass IMG8 = new AnimationClass(); // Estamos viendo la imagen 8
          IMG8.jLabelXLeft(985, 1, 1, 2, proyectoIMG8);
      
          System.out.println("se esta visualizando la imagen 7, se hace la transicion de la "
                              + "imagen 8 y se esconde la imagen 7");
          IMG.setText("8");///////////////////////////
          btnDerecho1.setVisible(false);
          btnIzquierdo1.setVisible(false);
          btnDerecho2.setVisible(false);
          btnIzquierdo2.setVisible(false);
          btnDerecho3.setVisible(false);
          btnIzquierdo3.setVisible(false);
          btnDerecho4.setVisible(false);
          btnIzquierdo4.setVisible(false);
          btnDerecho5.setVisible(false);
          btnIzquierdo5.setVisible(false);
          btnDerecho6.setVisible(false);
          btnIzquierdo6.setVisible(false);
          btnDerecho7.setVisible(false);
          btnIzquierdo7.setVisible(false);
          btnDerecho8.setVisible(true);
          btnIzquierdo8.setVisible(true);
          
       } 
          
      }
      
      
    
  
  }
  void TransicionIzquierda7(){
      
      if(proyectoIMG7.getX()==1)
      if(IMG.getText().equals("7")){
         
          AnimationClass IMG6 = new AnimationClass();///// Estamos viendo la imagen 6
          IMG6.jLabelXRight(-985, 1, 1, 2, proyectoIMG6);
          
          AnimationClass IMG7 = new AnimationClass();///// Estamos ocultando la imagen 7
          IMG7.jLabelXRight(1, 985, 1, 2, proyectoIMG7);
      
          System.out.println("se esta visualizando la imagen 7, se hace la transicion de la "
                              + "imagen 6 y se esconde la imagen 7");
           btnDerecho1.setVisible(false);
           btnIzquierdo1.setVisible(false);
         
           btnDerecho2.setVisible(false);
           btnIzquierdo2.setVisible(false);
        
           btnDerecho3.setVisible(false);
           btnIzquierdo3.setVisible(false);
           
           btnDerecho4.setVisible(false);
           btnIzquierdo4.setVisible(false);
           
           btnDerecho5.setVisible(false);
           btnIzquierdo5.setVisible(false);
           
           btnDerecho6.setVisible(true);
           btnIzquierdo6.setVisible(true);
           
           btnDerecho7.setVisible(false);
           btnIzquierdo7.setVisible(false);
            
           IMG.setText("6");
      
      } 
    
  
  }
  ///////////////////Transicion de imagen 8
  void TransicionDerecha8(){
      
      if(proyectoIMG8.getX()==1){
          
          
          
           if(IMG.getText().equals("8")){
         
          AnimationClass IMG8 = new AnimationClass(); // Estamos ocultando la imagen 8
          IMG8.jLabelXLeft(1, -985, 1, 2, proyectoIMG8);
          
          AnimationClass IMG9 = new AnimationClass(); // Estamos viendo la imagen 9
          IMG9.jLabelXLeft(985, 1, 1, 2, proyectoIMG9);
      
          System.out.println("se esta visualizando la imagen 8, se hace la transicion de la "
                              + "imagen 9 y se esconde la imagen 8");
          IMG.setText("9");///////////////////////////
          btnDerecho1.setVisible(false);
          btnIzquierdo1.setVisible(false);
          btnDerecho2.setVisible(false);
          btnIzquierdo2.setVisible(false);
          btnDerecho3.setVisible(false);
          btnIzquierdo3.setVisible(false);
          btnDerecho4.setVisible(false);
          btnIzquierdo4.setVisible(false);
          btnDerecho5.setVisible(false);
          btnIzquierdo5.setVisible(false);
          btnDerecho6.setVisible(false);
          btnIzquierdo6.setVisible(false);
          btnDerecho7.setVisible(false);
          btnIzquierdo7.setVisible(false);
          btnDerecho8.setVisible(false);
          btnIzquierdo8.setVisible(false);
          btnDerecho9.setVisible(true);
          btnIzquierdo9.setVisible(true);
          
       } 
          
      }
      
      
    
  
  }
  void TransicionIzquierda8(){
      
      if(proyectoIMG8.getX()==1)
      if(IMG.getText().equals("8")){
         
          AnimationClass IMG7 = new AnimationClass();///// Estamos viendo la imagen 7
          IMG7.jLabelXRight(-985, 1, 1, 2, proyectoIMG7);
          
          AnimationClass IMG8 = new AnimationClass();///// Estamos ocultando la imagen 8
          IMG8.jLabelXRight(1, 985, 1, 2, proyectoIMG8);
      
          System.out.println("se esta visualizando la imagen 8, se hace la transicion de la "
                              + "imagen 7 y se esconde la imagen 8");
           btnDerecho1.setVisible(false);
           btnIzquierdo1.setVisible(false);
         
           btnDerecho2.setVisible(false);
           btnIzquierdo2.setVisible(false);
        
           btnDerecho3.setVisible(false);
           btnIzquierdo3.setVisible(false);
           
           btnDerecho4.setVisible(false);
           btnIzquierdo4.setVisible(false);
           
           btnDerecho5.setVisible(false);
           btnIzquierdo5.setVisible(false);
           
           btnDerecho6.setVisible(false);
           btnIzquierdo6.setVisible(false);
           
           btnDerecho7.setVisible(true);
           btnIzquierdo7.setVisible(true);
           
           btnDerecho8.setVisible(false);
           btnIzquierdo8.setVisible(false);
            
           IMG.setText("7");
      
      } 
    
  
  }
  ///////////////////Transicion de imagen 9
  void TransicionDerecha9(){
      
      if(proyectoIMG9.getX()==1){
          
          
          
           if(IMG.getText().equals("9")){
         
          AnimationClass IMG9 = new AnimationClass(); // Estamos ocultando la imagen 9
          IMG9.jLabelXLeft(1, -985, 1, 2, proyectoIMG9);
          
          AnimationClass IMG10 = new AnimationClass(); // Estamos viendo la imagen 10
          IMG10.jLabelXLeft(985, 1, 1, 2, proyectoIMG10);
      
          System.out.println("se esta visualizando la imagen 9, se hace la transicion de la "
                              + "imagen 10 y se esconde la imagen 9");
          IMG.setText("10");///////////////////////////
          btnDerecho1.setVisible(false);
          btnIzquierdo1.setVisible(false);
          btnDerecho2.setVisible(false);
          btnIzquierdo2.setVisible(false);
          btnDerecho3.setVisible(false);
          btnIzquierdo3.setVisible(false);
          btnDerecho4.setVisible(false);
          btnIzquierdo4.setVisible(false);
          btnDerecho5.setVisible(false);
          btnIzquierdo5.setVisible(false);
          btnDerecho6.setVisible(false);
          btnIzquierdo6.setVisible(false);
          btnDerecho7.setVisible(false);
          btnIzquierdo7.setVisible(false);
          btnDerecho8.setVisible(false);
          btnIzquierdo8.setVisible(false);
          btnDerecho9.setVisible(false);
          btnIzquierdo9.setVisible(false);
          btnDerecho10.setVisible(true);
          btnIzquierdo10.setVisible(true);
          
       } 
          
      }
      
      
    
  
  }
  void TransicionIzquierda9(){
      
      if(proyectoIMG9.getX()==1)
      if(IMG.getText().equals("9")){
         
          AnimationClass IMG8 = new AnimationClass();///// Estamos viendo la imagen 8
          IMG8.jLabelXRight(-985, 1, 1, 2, proyectoIMG8);
          
          AnimationClass IMG9 = new AnimationClass();///// Estamos ocultando la imagen 9
          IMG9.jLabelXRight(1, 985, 1, 2, proyectoIMG9);
      
          System.out.println("se esta visualizando la imagen 9, se hace la transicion de la "
                              + "imagen 8 y se esconde la imagen 9");
           btnDerecho1.setVisible(false);
           btnIzquierdo1.setVisible(false);
         
           btnDerecho2.setVisible(false);
           btnIzquierdo2.setVisible(false);
        
           btnDerecho3.setVisible(false);
           btnIzquierdo3.setVisible(false);
           
           btnDerecho4.setVisible(false);
           btnIzquierdo4.setVisible(false);
           
           btnDerecho5.setVisible(false);
           btnIzquierdo5.setVisible(false);
           
           btnDerecho6.setVisible(false);
           btnIzquierdo6.setVisible(false);
           
           btnDerecho7.setVisible(false);
           btnIzquierdo7.setVisible(false);
           
           btnDerecho8.setVisible(true);
           btnIzquierdo8.setVisible(true);
           
           btnDerecho9.setVisible(false);
           btnIzquierdo9.setVisible(false);
            
           IMG.setText("8");
      
      } 
    
  
  }
  ///////////////////Transicion de imagen 10
  void TransicionIzquierda10(){
      
      if(proyectoIMG10.getX()==1)
      if(IMG.getText().equals("10")){
         
          AnimationClass IMG9 = new AnimationClass();///// Estamos viendo la imagen 9
          IMG9.jLabelXRight(-985, 1, 1, 2, proyectoIMG9);
          
          AnimationClass IMG10 = new AnimationClass();///// Estamos ocultando la imagen 10
          IMG10.jLabelXRight(1, 985, 1, 2, proyectoIMG10);
      
          System.out.println("se esta visualizando la imagen 10, se hace la transicion de la "
                              + "imagen 9 y se esconde la imagen 10");
           btnDerecho1.setVisible(false);
           btnIzquierdo1.setVisible(false);
         
           btnDerecho2.setVisible(false);
           btnIzquierdo2.setVisible(false);
        
           btnDerecho3.setVisible(false);
           btnIzquierdo3.setVisible(false);
           
           btnDerecho4.setVisible(false);
           btnIzquierdo4.setVisible(false);
           
           btnDerecho5.setVisible(false);
           btnIzquierdo5.setVisible(false);
           
           btnDerecho6.setVisible(false);
           btnIzquierdo6.setVisible(false);
           
           btnDerecho7.setVisible(false);
           btnIzquierdo7.setVisible(false);
           
           btnDerecho8.setVisible(false);
           btnIzquierdo8.setVisible(false);
           
           btnDerecho9.setVisible(true);
           btnIzquierdo9.setVisible(true);
           
           btnDerecho10.setVisible(false);
           btnIzquierdo10.setVisible(false);
            
           IMG.setText("9");
      
      } 
    
  
  }

  ////////////////////////// CIERRE DE SECCION DE TRANSICION ////////////////////////////////////
  
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnDerecho1 = new javax.swing.JButton();
        btnDerecho2 = new javax.swing.JButton();
        btnDerecho3 = new javax.swing.JButton();
        btnDerecho4 = new javax.swing.JButton();
        btnDerecho5 = new javax.swing.JButton();
        btnDerecho6 = new javax.swing.JButton();
        btnDerecho7 = new javax.swing.JButton();
        btnDerecho8 = new javax.swing.JButton();
        btnDerecho9 = new javax.swing.JButton();
        btnDerecho10 = new javax.swing.JButton();
        btnIzquierdo1 = new javax.swing.JButton();
        btnIzquierdo2 = new javax.swing.JButton();
        btnIzquierdo3 = new javax.swing.JButton();
        btnIzquierdo4 = new javax.swing.JButton();
        btnIzquierdo5 = new javax.swing.JButton();
        btnIzquierdo6 = new javax.swing.JButton();
        btnIzquierdo7 = new javax.swing.JButton();
        btnIzquierdo8 = new javax.swing.JButton();
        btnIzquierdo9 = new javax.swing.JButton();
        btnIzquierdo10 = new javax.swing.JButton();
        proyectoIMG1 = new javax.swing.JLabel();
        proyectoIMG2 = new javax.swing.JLabel();
        proyectoIMG3 = new javax.swing.JLabel();
        proyectoIMG4 = new javax.swing.JLabel();
        proyectoIMG5 = new javax.swing.JLabel();
        proyectoIMG6 = new javax.swing.JLabel();
        proyectoIMG7 = new javax.swing.JLabel();
        proyectoIMG8 = new javax.swing.JLabel();
        proyectoIMG9 = new javax.swing.JLabel();
        proyectoIMG10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        IMG = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ContenedorComentarios = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(28, 28, 28));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        btnDerecho1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_der.png"))); // NOI18N
        btnDerecho1.setBorder(null);
        btnDerecho1.setBorderPainted(false);
        btnDerecho1.setContentAreaFilled(false);
        btnDerecho1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerecho1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDerecho1);
        btnDerecho1.setBounds(873, 120, 110, 170);

        btnDerecho2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_der.png"))); // NOI18N
        btnDerecho2.setBorder(null);
        btnDerecho2.setBorderPainted(false);
        btnDerecho2.setContentAreaFilled(false);
        btnDerecho2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerecho2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDerecho2);
        btnDerecho2.setBounds(873, 120, 110, 170);

        btnDerecho3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_der.png"))); // NOI18N
        btnDerecho3.setBorder(null);
        btnDerecho3.setBorderPainted(false);
        btnDerecho3.setContentAreaFilled(false);
        btnDerecho3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerecho3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDerecho3);
        btnDerecho3.setBounds(873, 120, 110, 170);

        btnDerecho4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_der.png"))); // NOI18N
        btnDerecho4.setBorder(null);
        btnDerecho4.setBorderPainted(false);
        btnDerecho4.setContentAreaFilled(false);
        btnDerecho4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerecho4ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDerecho4);
        btnDerecho4.setBounds(873, 120, 110, 170);

        btnDerecho5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_der.png"))); // NOI18N
        btnDerecho5.setBorder(null);
        btnDerecho5.setBorderPainted(false);
        btnDerecho5.setContentAreaFilled(false);
        btnDerecho5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerecho5ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDerecho5);
        btnDerecho5.setBounds(873, 120, 110, 170);

        btnDerecho6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_der.png"))); // NOI18N
        btnDerecho6.setBorder(null);
        btnDerecho6.setBorderPainted(false);
        btnDerecho6.setContentAreaFilled(false);
        btnDerecho6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerecho6ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDerecho6);
        btnDerecho6.setBounds(873, 120, 110, 170);

        btnDerecho7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_der.png"))); // NOI18N
        btnDerecho7.setBorder(null);
        btnDerecho7.setBorderPainted(false);
        btnDerecho7.setContentAreaFilled(false);
        btnDerecho7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerecho7ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDerecho7);
        btnDerecho7.setBounds(873, 120, 110, 170);

        btnDerecho8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_der.png"))); // NOI18N
        btnDerecho8.setBorder(null);
        btnDerecho8.setBorderPainted(false);
        btnDerecho8.setContentAreaFilled(false);
        btnDerecho8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerecho8ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDerecho8);
        btnDerecho8.setBounds(873, 120, 110, 170);

        btnDerecho9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_der.png"))); // NOI18N
        btnDerecho9.setBorder(null);
        btnDerecho9.setBorderPainted(false);
        btnDerecho9.setContentAreaFilled(false);
        btnDerecho9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerecho9ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDerecho9);
        btnDerecho9.setBounds(873, 120, 110, 170);

        btnDerecho10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_der.png"))); // NOI18N
        btnDerecho10.setBorder(null);
        btnDerecho10.setBorderPainted(false);
        btnDerecho10.setContentAreaFilled(false);
        btnDerecho10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_der.png"))); // NOI18N
        btnDerecho10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerecho10ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDerecho10);
        btnDerecho10.setBounds(873, 120, 110, 170);

        btnIzquierdo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_izq.png"))); // NOI18N
        btnIzquierdo1.setBorder(null);
        btnIzquierdo1.setBorderPainted(false);
        btnIzquierdo1.setContentAreaFilled(false);
        btnIzquierdo1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdo1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIzquierdo1);
        btnIzquierdo1.setBounds(0, 120, 110, 170);

        btnIzquierdo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_izq.png"))); // NOI18N
        btnIzquierdo2.setBorder(null);
        btnIzquierdo2.setBorderPainted(false);
        btnIzquierdo2.setContentAreaFilled(false);
        btnIzquierdo2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdo2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIzquierdo2);
        btnIzquierdo2.setBounds(0, 120, 110, 170);

        btnIzquierdo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_izq.png"))); // NOI18N
        btnIzquierdo3.setBorder(null);
        btnIzquierdo3.setBorderPainted(false);
        btnIzquierdo3.setContentAreaFilled(false);
        btnIzquierdo3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdo3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIzquierdo3);
        btnIzquierdo3.setBounds(0, 120, 110, 170);

        btnIzquierdo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_izq.png"))); // NOI18N
        btnIzquierdo4.setBorder(null);
        btnIzquierdo4.setBorderPainted(false);
        btnIzquierdo4.setContentAreaFilled(false);
        btnIzquierdo4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdo4ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIzquierdo4);
        btnIzquierdo4.setBounds(0, 120, 110, 170);

        btnIzquierdo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_izq.png"))); // NOI18N
        btnIzquierdo5.setBorder(null);
        btnIzquierdo5.setBorderPainted(false);
        btnIzquierdo5.setContentAreaFilled(false);
        btnIzquierdo5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdo5ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIzquierdo5);
        btnIzquierdo5.setBounds(0, 120, 110, 170);

        btnIzquierdo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_izq.png"))); // NOI18N
        btnIzquierdo6.setBorder(null);
        btnIzquierdo6.setBorderPainted(false);
        btnIzquierdo6.setContentAreaFilled(false);
        btnIzquierdo6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdo6ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIzquierdo6);
        btnIzquierdo6.setBounds(0, 120, 110, 170);

        btnIzquierdo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_izq.png"))); // NOI18N
        btnIzquierdo7.setBorder(null);
        btnIzquierdo7.setBorderPainted(false);
        btnIzquierdo7.setContentAreaFilled(false);
        btnIzquierdo7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdo7ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIzquierdo7);
        btnIzquierdo7.setBounds(0, 120, 110, 170);

        btnIzquierdo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_izq.png"))); // NOI18N
        btnIzquierdo8.setBorder(null);
        btnIzquierdo8.setBorderPainted(false);
        btnIzquierdo8.setContentAreaFilled(false);
        btnIzquierdo8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdo8ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIzquierdo8);
        btnIzquierdo8.setBounds(0, 120, 110, 170);

        btnIzquierdo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_izq.png"))); // NOI18N
        btnIzquierdo9.setBorder(null);
        btnIzquierdo9.setBorderPainted(false);
        btnIzquierdo9.setContentAreaFilled(false);
        btnIzquierdo9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdo9ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIzquierdo9);
        btnIzquierdo9.setBounds(0, 120, 110, 170);

        btnIzquierdo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion1_izq.png"))); // NOI18N
        btnIzquierdo10.setBorder(null);
        btnIzquierdo10.setBorderPainted(false);
        btnIzquierdo10.setContentAreaFilled(false);
        btnIzquierdo10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btntransicion2_izq.png"))); // NOI18N
        btnIzquierdo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdo10ActionPerformed(evt);
            }
        });
        jPanel2.add(btnIzquierdo10);
        btnIzquierdo10.setBounds(0, 120, 110, 170);

        proyectoIMG1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proyectoIMG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/imgprueba_1.jpg"))); // NOI18N
        proyectoIMG1.setText("jLabel1");
        jPanel2.add(proyectoIMG1);
        proyectoIMG1.setBounds(1, 0, 982, 486);

        proyectoIMG2.setBackground(new java.awt.Color(204, 255, 51));
        proyectoIMG2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proyectoIMG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/imgprueba5.jpg"))); // NOI18N
        jPanel2.add(proyectoIMG2);
        proyectoIMG2.setBounds(985, 0, 982, 486);

        proyectoIMG3.setBackground(new java.awt.Color(0, 0, 153));
        proyectoIMG3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proyectoIMG3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/imgprueba3.jpg"))); // NOI18N
        proyectoIMG3.setText("imagen 3");
        proyectoIMG3.setToolTipText("");
        jPanel2.add(proyectoIMG3);
        proyectoIMG3.setBounds(985, 0, 982, 486);

        proyectoIMG4.setBackground(new java.awt.Color(51, 255, 102));
        proyectoIMG4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proyectoIMG4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/imgprueba4.jpg"))); // NOI18N
        proyectoIMG4.setText("imagen 4");
        jPanel2.add(proyectoIMG4);
        proyectoIMG4.setBounds(985, 0, 982, 486);

        proyectoIMG5.setBackground(new java.awt.Color(153, 255, 153));
        proyectoIMG5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proyectoIMG5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/imgprueba5.jpg"))); // NOI18N
        proyectoIMG5.setText("imagen 5");
        jPanel2.add(proyectoIMG5);
        proyectoIMG5.setBounds(985, 0, 982, 486);

        proyectoIMG6.setBackground(new java.awt.Color(255, 153, 153));
        proyectoIMG6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proyectoIMG6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/imgprueba6.jpg"))); // NOI18N
        proyectoIMG6.setText("imagen 6");
        jPanel2.add(proyectoIMG6);
        proyectoIMG6.setBounds(985, 0, 982, 486);

        proyectoIMG7.setBackground(new java.awt.Color(255, 153, 102));
        proyectoIMG7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proyectoIMG7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/imgprueba7.jpg"))); // NOI18N
        proyectoIMG7.setText("imagen 7");
        jPanel2.add(proyectoIMG7);
        proyectoIMG7.setBounds(985, 0, 982, 486);

        proyectoIMG8.setBackground(new java.awt.Color(51, 51, 255));
        proyectoIMG8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proyectoIMG8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/imgprueba8.jpg"))); // NOI18N
        proyectoIMG8.setText("imagen 8");
        jPanel2.add(proyectoIMG8);
        proyectoIMG8.setBounds(985, 0, 982, 486);

        proyectoIMG9.setBackground(new java.awt.Color(102, 255, 102));
        proyectoIMG9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proyectoIMG9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/imgprueba9.jpg"))); // NOI18N
        proyectoIMG9.setText("imagen 9");
        jPanel2.add(proyectoIMG9);
        proyectoIMG9.setBounds(985, 0, 982, 486);

        proyectoIMG10.setBackground(new java.awt.Color(102, 0, 102));
        proyectoIMG10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proyectoIMG10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/imgprueba10.jpg"))); // NOI18N
        proyectoIMG10.setText("imagen 10");
        jPanel2.add(proyectoIMG10);
        proyectoIMG10.setBounds(985, 0, 982, 486);

        jPanel3.setBackground(new java.awt.Color(38, 38, 38));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btnseguir.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btnseguir2.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btnseguir2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 150, 60));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btnMegusta.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btnMegusta2.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/btnMegusta2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 80));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/mg.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 56, 30, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/vitstas.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 30, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("100");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 30, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("100");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 30, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Me gusta");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, 110, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Visualizaciones");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 110, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Nombre del Proyecto");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 420, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Software utilizado");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 520, 20));

        jPanel4.setOpaque(false);

        jLabel10.setBackground(new java.awt.Color(255, 204, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/unity.jpg"))); // NOI18N
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(255, 204, 51));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/maya.jpg"))); // NOI18N
        jLabel11.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(255, 204, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/zbrush.jpg"))); // NOI18N
        jLabel12.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(255, 204, 51));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/netbeans.jpg"))); // NOI18N
        jLabel13.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(255, 204, 51));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/aftefet.jpg"))); // NOI18N
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 204, 51));

        jLabel16.setBackground(new java.awt.Color(255, 204, 51));

        jLabel17.setBackground(new java.awt.Color(255, 204, 51));

        jLabel18.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 588, 60));

        IMG.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        IMG.setForeground(new java.awt.Color(38, 38, 38));
        IMG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IMG.setText("1");
        jPanel3.add(IMG, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 30, 40, 40));

        jPanel5.setBackground(new java.awt.Color(46, 46, 46));
        jPanel5.setOpaque(false);

        jPanel6.setBackground(new java.awt.Color(38, 38, 38));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pd_img_Performance/comentarioIcono.png"))); // NOI18N
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 177, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("COMENTARIOS");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 25, 275, 37));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("DE");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 68, 43, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 153, 255));
        jLabel22.setText("Nombre Del Proyecto");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 68, 740, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("  Comentarios");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 90, 20));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 153, 255));
        jLabel24.setText("1010");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 100, 20));

        ContenedorComentarios.setOpaque(false);
        ContenedorComentarios.setLayout(new javax.swing.BoxLayout(ContenedorComentarios, javax.swing.BoxLayout.Y_AXIS));

        jPanel8.setBackground(new java.awt.Color(38, 38, 38));

        jTextArea1.setBackground(new java.awt.Color(38, 38, 38));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Video increible Kai ¿Siguió El Rey Brujo el mismo camino que el resto de hombres? ¿Fue a las estancias de Mandos? He de confesar que su muerte me decepcionó un poco, cientos de años vivo, espectro del anillo, brujo, no muerto... y es vencido por una puñalada trapera. ¡Un saludo! Video increible Kai ¿Siguió El Rey Brujo el mismo camino que el resto de hombres? ¿Fue a las estancias de Mandos? He de confesar que su muerte me decepcionó un poco, cientos de años vivo, espectro del anillo, brujo, no muerto... y es vencido por una puñalada trapera. ¡Un saludo!Video increible Kai ¿Siguió El Rey Brujo el mismo camino que el resto de hombres? ¿Fue a las estancias de Mandos? He de confesar que su muerte me decepcionó un poco, cientos de años vivo, espectro del anillo, brujo, no muerto... y es vencido por una puñalada trapera. ¡Un saludo!Video increible Kai ¿Siguió El Rey Brujo el mismo camino que el resto de hombres? ¿Fue a las estancias de Mandos? He de confesar que su muerte me decepcionó un poco, cientos de años vivo, espectro del anillo, brujo, no muerto... y es vencido por una puñalada trapera. ¡Un saludo!Video increible Kai ¿Siguió El Rey Brujo el mismo camino que el resto de hombres? ¿Fue a las estancias de Mandos? He de confesar que su muerte me decepcionó un poco, cientos de años vivo, espectro del anillo, brujo, no muerto... y es vencido por una puñalada trapera. ¡Un saludo!");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText(" Sobre");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 153, 255));
        jLabel26.setText("Nombre del proyecto");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContenedorComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContenedorComentarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//pd_InterfacesGraficas_Performance_Portafolio_Comentarios.comentario_Portafolio1 coment2 = new pd_InterfacesGraficas_Performance_Portafolio_Comentarios.comentario_Portafolio1();


ContenedorComentarios.add(coment2);
ContenedorComentarios.revalidate();
coment2.jTextArea1.setText("Presentamos un curso de desarrollo de software un poco alejado de la aburrida pero necesaria teoría, y nos adentramos a la práctica del desarrollo general. \n" +
"Requerimientos: Java8 , jdk1.8.0_181,jre1.8.0_221");
coment2.setVisible(true);


ContenedorComentarios.add(coment1);
ContenedorComentarios.revalidate();
coment1.setVisible(true);

ContenedorComentarios.add(coment3);
ContenedorComentarios.revalidate();
coment3.jTextArea1.setText("asdasdsadasdasdasdasdasd");
coment3.setVisible(true);






    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
ContenedorComentarios.remove(coment1);//////////Remover Comentario
ContenedorComentarios.revalidate();////////////Validar comentario

//pd_InterfacesGraficas_Performance_Portafolio_Comentarios.comentario_Portafolio1 coment1 = new pd_InterfacesGraficas_Performance_Portafolio_Comentarios.comentario_Portafolio1();



    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked


    }//GEN-LAST:event_jLabel14MouseClicked

    private void btnIzquierdo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdo1ActionPerformed
TransicionIzquierda1(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////


    }//GEN-LAST:event_btnIzquierdo1ActionPerformed

    private void btnDerecho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerecho1ActionPerformed

        if(Img>1){ ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
            System.out.println("img es mayor a 1"); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
            TransicionDerecha1(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
        }
        


    }//GEN-LAST:event_btnDerecho1ActionPerformed

    private void btnDerecho2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerecho2ActionPerformed
 if(Img>2){ ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
            System.out.println("img es mayor a 2"); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
            TransicionDerecha2(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
        }
        
             
    }//GEN-LAST:event_btnDerecho2ActionPerformed

    private void btnIzquierdo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdo2ActionPerformed
TransicionIzquierda2(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
    }//GEN-LAST:event_btnIzquierdo2ActionPerformed

    private void btnDerecho3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerecho3ActionPerformed
  if(Img>3){ ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
           System.out.println("img es mayor a 3"); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
           TransicionDerecha3();  ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
        }       
    }//GEN-LAST:event_btnDerecho3ActionPerformed

    private void btnIzquierdo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdo3ActionPerformed
TransicionIzquierda3();  ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
    }//GEN-LAST:event_btnIzquierdo3ActionPerformed

    private void btnIzquierdo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdo4ActionPerformed
TransicionIzquierda4();  ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
    }//GEN-LAST:event_btnIzquierdo4ActionPerformed

    private void btnDerecho4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerecho4ActionPerformed

         if(Img>4){ ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
           System.out.println("img es mayor a 4"); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
         TransicionDerecha4();  ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
        }
    }//GEN-LAST:event_btnDerecho4ActionPerformed

    private void btnIzquierdo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdo5ActionPerformed
TransicionIzquierda5(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
    }//GEN-LAST:event_btnIzquierdo5ActionPerformed

    private void btnDerecho5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerecho5ActionPerformed
 if(Img>5){ ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
           System.out.println("img es mayor a 5"); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
         TransicionDerecha5();  ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
        }      
    }//GEN-LAST:event_btnDerecho5ActionPerformed

    private void btnIzquierdo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdo6ActionPerformed
TransicionIzquierda6(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
    }//GEN-LAST:event_btnIzquierdo6ActionPerformed

    private void btnDerecho6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerecho6ActionPerformed
 if(Img>6){ ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
           System.out.println("img es mayor a 6"); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
         TransicionDerecha6(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
        }
    }//GEN-LAST:event_btnDerecho6ActionPerformed

    private void btnIzquierdo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdo7ActionPerformed
TransicionIzquierda7(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
    }//GEN-LAST:event_btnIzquierdo7ActionPerformed

    private void btnDerecho7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerecho7ActionPerformed
 if(Img>7){ ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
           System.out.println("img es mayor a 7"); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
         TransicionDerecha7(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
        }
    }//GEN-LAST:event_btnDerecho7ActionPerformed

    private void btnDerecho8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerecho8ActionPerformed
 if(Img>8){ ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
           System.out.println("img es mayor a 8"); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
         TransicionDerecha8(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////  
        }
    }//GEN-LAST:event_btnDerecho8ActionPerformed

    private void btnIzquierdo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdo8ActionPerformed
TransicionIzquierda8(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
    }//GEN-LAST:event_btnIzquierdo8ActionPerformed

    private void btnIzquierdo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdo9ActionPerformed
TransicionIzquierda9(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
    }//GEN-LAST:event_btnIzquierdo9ActionPerformed

    private void btnDerecho9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerecho9ActionPerformed
 if(Img>9){ ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
           System.out.println("img es mayor a 9"); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
         TransicionDerecha9(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
        }
    }//GEN-LAST:event_btnDerecho9ActionPerformed

    private void btnIzquierdo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdo10ActionPerformed
TransicionIzquierda10(); ///////////////TAG2: *Transiciones de Imagenes de Interface Portafolio////////////
    }//GEN-LAST:event_btnIzquierdo10ActionPerformed

    private void btnDerecho10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerecho10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDerecho10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorComentarios;
    private javax.swing.JLabel IMG;
    private javax.swing.JButton btnDerecho1;
    private javax.swing.JButton btnDerecho10;
    private javax.swing.JButton btnDerecho2;
    private javax.swing.JButton btnDerecho3;
    private javax.swing.JButton btnDerecho4;
    private javax.swing.JButton btnDerecho5;
    private javax.swing.JButton btnDerecho6;
    private javax.swing.JButton btnDerecho7;
    private javax.swing.JButton btnDerecho8;
    private javax.swing.JButton btnDerecho9;
    private javax.swing.JButton btnIzquierdo1;
    private javax.swing.JButton btnIzquierdo10;
    private javax.swing.JButton btnIzquierdo2;
    private javax.swing.JButton btnIzquierdo3;
    private javax.swing.JButton btnIzquierdo4;
    private javax.swing.JButton btnIzquierdo5;
    private javax.swing.JButton btnIzquierdo6;
    private javax.swing.JButton btnIzquierdo7;
    private javax.swing.JButton btnIzquierdo8;
    private javax.swing.JButton btnIzquierdo9;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel proyectoIMG1;
    private javax.swing.JLabel proyectoIMG10;
    private javax.swing.JLabel proyectoIMG2;
    private javax.swing.JLabel proyectoIMG3;
    private javax.swing.JLabel proyectoIMG4;
    private javax.swing.JLabel proyectoIMG5;
    private javax.swing.JLabel proyectoIMG6;
    private javax.swing.JLabel proyectoIMG7;
    private javax.swing.JLabel proyectoIMG8;
    private javax.swing.JLabel proyectoIMG9;
    // End of variables declaration//GEN-END:variables
}
