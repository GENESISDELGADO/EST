/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author ACER
 */
public record Person(String name, int age){
    
    public Person{
        if (age <0){
            System.out.println("No hay edad ");
        
        }
    
    }
    public String infor(){
    
        return "Nombre:  "+name+"edad: "+age;
    
    }

}