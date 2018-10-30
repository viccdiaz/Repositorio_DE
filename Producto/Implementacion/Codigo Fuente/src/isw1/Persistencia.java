/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Rodriguez
 */
public class Persistencia {
    
   public void grabar(Pedido pedido)
   {
       
       
       try
       {
           Pedido pedidos[]=(Pedido[])get();
       Pedido pedidosAux[]= new Pedido[pedidos.length+1];
       int i;
       for (i = 0; i < pedidos.length; i++) {
           pedidosAux[i]=pedidos[i];
       }
       pedidosAux[i]=pedido;
           
            FileOutputStream fos = new FileOutputStream("D:\\Pedidos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(pedidosAux);
            
            oos.close();
            fos.close();
            
       }
       catch(Exception e)
       {
           System.out.println(e.toString());
       }
       
   }
   
   public Object get()
   {
       Object s=null;
       try
       {
       FileInputStream fis = new FileInputStream("D:\\Pedidos.txt");	//C:\\Users\\Rodriguez\\Desktop\\Implementacion 2.4\\ISW1\\test.txt
       ObjectInputStream ois = new ObjectInputStream(fis);
       s=(Pedido[])ois.readObject();
       fis.close();
       ois.close();
       
       }
       catch(Exception e)
       {
           System.out.println(e.toString());
       }
       return s;
   }
   
   public void grabarPrimero(Pedido pedido)
   { 
       Pedido[] pedidos = new Pedido[1];
       pedidos[0]=pedido;
       try
       {
           
           
            FileOutputStream fos = new FileOutputStream("D:\\Pedidos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(pedidos);
            
            oos.close();
            fos.close();
            
       }
       catch(Exception e)
       {
           System.out.println(e.toString());
       }
       
   }
   public void borrar()
   {                    //"C:\\Users\\Rodriguez\\Desktop\\Implementacion 2.4\\ISW1\\num.txt"
       try
       {
           
           Pedido[] p = new Pedido[0];
            FileOutputStream fos = new FileOutputStream("D:\\Pedidos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(p);
            
            oos.close();
            fos.close();
            fos = new FileOutputStream("D:\\NumeroPedido.txt");
            oos = new ObjectOutputStream(fos);
            int s=0;
            oos.writeObject(s);
            
            oos.close();
            fos.close();
       }
       catch(Exception e)
       {
           System.out.println(e.toString());
       }
       
   }
   
   public int getNumeroPedido()
   {
       int s=0;
       try
       {
       FileInputStream fis = new FileInputStream("D:\\NumeroPedido.txt");//abro conexion y obtengo el numero de pedido	
       ObjectInputStream ois = new ObjectInputStream(fis);
       s=(int)ois.readObject();
       fis.close();
       ois.close();//Cierro conexion
       s++; //aumento la variable s que seria el numero de pedido actual
       
       FileOutputStream fos = new FileOutputStream("D:\\NumeroPedido.txt");//abro conexion y grabo el nuevo numero de pedido	
       ObjectOutputStream oos = new ObjectOutputStream(fos);
            
       oos.writeObject(s);
            
       oos.close();
       fos.close();//Cierro conexion
       return s;
       
       }
       catch(Exception e)
       {
           System.out.println(e.toString());
           return -1;
       }
       
   }
   
   public void inicializarNumeroPedido()
   {
       int s;
       try
       {
       FileInputStream fis = new FileInputStream("D:\\NumeroPedido.txt");//abro conexion y obtengo el numero de pedido	
       ObjectInputStream ois = new ObjectInputStream(fis);
       s=(int)ois.readObject();
       fis.close();
       ois.close();//Cierro conexion
          
           
       }
       catch(Exception e)
       {
           try{
               s=0;
               FileOutputStream fos = new FileOutputStream("D:\\NumeroPedido.txt");
               ObjectOutputStream oos = new ObjectOutputStream(fos);
            
               oos.writeObject(s);
            
               oos.close();
               fos.close();
           }
           catch(Exception d)
           {
               System.out.println(d.toString());
           }
           
        System.out.println(e.toString());
       }
   }
   
    public void inicializarPedidos()
   { 
       Object s=null;

       try
       {
             FileInputStream fis = new FileInputStream("D:\\Pedidos.txt");
             ObjectInputStream ois = new ObjectInputStream(fis);
             s=(Pedido[])ois.readObject();
             fis.close();
             ois.close();
           
            
       }
       catch(Exception e)
       {
           Pedido[] pedidos = new Pedido[0];
           try{
           FileOutputStream fos = new FileOutputStream("D:\\Pedidos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(pedidos);
            
            oos.close();
            fos.close();
           }
           catch(Exception d){
               System.out.println(d.toString());}
           System.out.println(e.toString());
       }
       
   }
   
   
     
       
 
	

	

   
    
}
