
package project.oop1;


public class Bus extends Vehicle {
   private  double lenght =10;
 private  double price =15;
  Bus( String name,int id){
    super(name,id);
    
  }
      @Override
  public String get_name(){
      return name;
  }
  public double get_time(){
      return lenght;
  }

    @Override
  public int get_id(){
      return id;
  }
      @Override
  public double get_price(double spendhours){
      return spendhours*price;
  }
   @Override
  public double get_lenght(){
      return lenght;
  }
      
    
}
