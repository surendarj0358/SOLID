   
   //liskov substitution
    interface CarEngineOn{
    public void turnonTheEngine();
    
    }

    interface CarAccelerator{
    
    public void setFirstGear();
    public void raiseTheAccelerator();
    }


class Car implements CarEngineOn,CarAccelerator {

    public void checkTheFuelLevel(){
    
    }  
        @Override
        public void turnonTheEngine() {
            
            System.out.println("turn on");
        }
        @Override
        public void setFirstGear() {
            System.out.println("first gear");
            
        }
         @Override
        public void raiseTheAccelerator() {
            System.out.println("raise the accelerator");
            
        }
       
}

    class TeslaCar implements CarAccelerator{

        public void checkTheBatteryLevel(){
         System.out.println("TESLA");
         }  
    
         public void switchOnTheCar(){
        System.out.println("On the car");

        }
        @Override
        public void setFirstGear() {
        System.out.println("Tesla set the first gear");
            
        }
        @Override
        public void raiseTheAccelerator() {
        System.out.println("raise the accelerator");
        System.out.println("--------------------------------------");
            
        }

}
    class BMW extends Car{

        public void checkTheFuelLevel(){
            System.out.println("BMW");
        }  
   
         public void turnonTheEngine() {
       
           System.out.println("turn on the Engine");
         }

         public void setFirstGear() {
           System.out.println("BMW set the first gear");
       
         }
         public void raiseTheAccelerator() {
            System.out.println("raise the accelerator");
            System.out.println("--------------------------------------");
       
         }
        }

public class Ford extends Car{
    public void checkTheFuelLevel(){
        System.out.println("FORD");
    }  
        
    public void turnonTheEngine() {
            
    System.out.println("turn on the Engine");
    }

    public void setFirstGear() {
    System.out.println("Ford set the first gear");
            
    }
    public void raiseTheAccelerator() {
    System.out.println("raise the accelerator");
    System.out.println("--------------------------------------");
            
        }

public static void main(String[] args){

    
    Car bmw = new BMW();
    Car ford = new Ford();
    bmw.checkTheFuelLevel();
    bmw.turnonTheEngine();
    ford.checkTheFuelLevel();
    ford.turnonTheEngine();
    

    CarAccelerator teslacar = new TeslaCar();
    CarAccelerator bmwcar = new BMW();
    CarAccelerator fordcar = new Ford();
    teslacar.setFirstGear();
    teslacar.raiseTheAccelerator();
    bmwcar.setFirstGear();
    bmwcar.raiseTheAccelerator();
    fordcar.setFirstGear();
    fordcar.raiseTheAccelerator(); 
    
}

}
