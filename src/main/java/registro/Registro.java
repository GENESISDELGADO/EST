/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package registro;

import java.util.ArrayList;
import person.Person;
import producto.Producto;

/**
 *
 * @author ACER
 */

public class Registro {

    public static void main(String[] args) {
        //instanciar record
        Person person = new Person("Pedro", -10);
        /*System.out.println(person.name());
        System.out.println(person.age());
        System.out.println(person)
        System.out.println(person);
        System.out.println(person.infor());*/
        
        Producto producto = new Producto("nn", 1.2, "ks");
        Producto producto2 =new Producto("jjd", 3.4, "fr");
        Producto producto3 =new Producto("df", 5.2, "ssj");
        
       ArrayList<Producto> productos= new ArrayList<>();
       productos.add(producto);
       productos.add(producto2);
       productos.add(producto3);
       
       for(Producto productop:productos){
           System.out.println(productop);
       }
       
        /*System.out.println(Person);*/
        System.out.println(person.infor());
       
        
    }
}
        
        
      