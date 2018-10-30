/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw1;
import javax.swing.ImageIcon;

/**
 *
 * @author fran9
 */
public class Producto 
{
   private String nombre;
   private float volumen;
   private float precio;
   private ImageIcon img;


    public Producto() {
    }

    public Producto(String nombre, float volumen, float precio,ImageIcon i) {
        this.nombre = nombre;
        this.volumen = volumen;
        this.precio = precio;
        img=i;

    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


   
   
   
   
    
}
