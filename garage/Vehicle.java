
package project.oop1;


 abstract public class Vehicle {
     int id;
     String name;

    public Vehicle(String name,int id) {
        this.name=name;
        this.id = id;
    }
     
  abstract  public int  get_id();
 
  abstract public double get_price(double a);
  
  abstract public String get_name(); 
  abstract public double get_lenght(); 
    
}
