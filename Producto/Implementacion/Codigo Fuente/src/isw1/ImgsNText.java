/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isw1;

/**
 *
 * @author Rodriguez
 */
import javax.swing.Icon;

///MODEL FOR CUSTOM ROW IN A JLIST
    public class ImgsNText
     {
        //FIELDS
        private String name;
        private Icon img;
        private float price;

        //CONSTRUCTOR
        public ImgsNText(String text,Icon icon,float p)
        {
            this.name=text;
            this.img=icon;
            price = p;
            
        }

        //GETTERS AND SET

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
        

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Icon getImg() {
        return img;
    }

    public void setImg(Icon img) {
        this.img = img;
    }

 }
