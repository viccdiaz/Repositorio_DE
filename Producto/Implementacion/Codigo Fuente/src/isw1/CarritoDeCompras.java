/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw1;

/**
 *
 * @author fran9
 */
public class CarritoDeCompras 
{
    private Producto productos[];
    private float capacidad; //capacidad restante, por cada vez que se agrega un producto se va disminuyendo
    private Comercio comercio;

    public CarritoDeCompras(Producto[] productos, int capacidad) {
        this.productos = productos;
        this.capacidad = capacidad;
    }

    public CarritoDeCompras() 
    {
      productos = new Producto [3];  
      capacidad=100;
    }

    public Producto[] getProductos() {
        return productos;
    }
   
    public boolean agregarProducto(Producto p)
    {
        if(productos[0]==null && capacidad > p.getVolumen())
        {
            productos[0]=p;
            capacidad = (capacidad - p.getVolumen());
            return true;
        }
        else
        {
            if( capacidad > p.getVolumen()) //se fija si es del mismo comercio que los productos anteriores y si la capacidad del carrito es mayor al volumen del producto
            {
                for (int i = 0; i < productos.length; i++) 
                {
                    if(productos[i]==null)
                    {
                        productos[i]=p;
                        capacidad = (capacidad - p.getVolumen());
                        return true;
                    }
                }
            }
        }
        return false;
        
    }

    @Override
    public String toString() {
        String c= "CarritoDeCompras{" + "capacidad=" + capacidad + ", comercio=" + comercio + '}' + "/n";
        c+= "Productos: ";
        for (int i = 0; i < this.productos.length; i++) 
        {
            if(productos[i]!=null)
            {
                c+=productos[i].getNombre() + "/n";
            }
        }
        return c;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }

    public Comercio getComercio() {
        return comercio;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }
   
    
    
}
