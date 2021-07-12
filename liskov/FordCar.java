package liskov;
    // the liskov substitution principle


  abstract class Cars{  


    public void turnonTheEngine(){
      System.out.println("Start the engine");

    }
    public void setFirstGearAndRaiseTheAccelerator(){

    } 
  }


  class Tesla extends Cars{ //extends the abstract class EngineOn

    public void turnonTheEngine(){
      throw new UnsupportedOperationException("I Dont Have Engine");
    }
    public void setFirstGearAndRaiseTheAccelerator(){
    
    }                 
}

public class FordCar extends Cars{ //extends the abstract class EngineOn
  
  public void turnonTheEngine(){
    System.out.println("Start the engine");
  }
  
  public void setFirstGearAndRaiseTheAccelerator(){
    String engine = "Started";
    if (engine.equals("Started")) {
    System.out.println("Set the first gear and raise the accelerator the car will move");
    } 
  }            


  public static void main(String[] args){
    
    FordCar ford = new FordCar();
    ford.turnonTheEngine();
    ford.setFirstGearAndRaiseTheAccelerator();
    TeslaCar tesla = new TeslaCar();
    tesla.turnonTheEngine();
    tesla.setFirstGearAndRaiseTheAccelerator();
  }
}   

