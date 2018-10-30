/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw1;

import java.util.Calendar;
import javax.swing.ImageIcon;

/**
 *
 * @author fran9
 */
public class ISW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        CarritoDeCompras c = new CarritoDeCompras();
        Comercio com = new Comercio("Multirrubros Juana","");
        Producto p3 = new Producto("Dentifrico Colgate",10,35,new ImageIcon("imgs\\dentifrico.jpg"));
        Producto p2= new Producto("Coca Cola 1 lt.",10,50,new ImageIcon("imgs\\coca.jpg"));
        Producto p4= new Producto("Lays Clásicas",10,60,new ImageIcon("imgs\\lays.jpg"));
        
        c.setComercio(com);
        c.agregarProducto(p3);
         c.agregarProducto(p2);
         c.agregarProducto(p4);
         Persistencia persistencia = new Persistencia();
         persistencia.inicializarNumeroPedido();
         persistencia.inicializarPedidos();
      Principal p = new Principal(c);
      p.setVisible(true);
      
        
       
  }
    
}
