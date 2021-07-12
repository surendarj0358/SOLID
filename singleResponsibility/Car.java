
// single responsibility principle

     class EngineType {
    
        public void getEngineType() {

            System.out.println("Diesel Engine");
            
        }
    
    }

     class CarrModel{
        public void getCarName() {

            System.out.println("5 series");

        }
    }
public class Car {
    
        public void getCarNmae() {
    
            System.out.println("BMW");
                
            }
      
public static void main(String[] args){
    Car car = new Car();
    car.getCarNmae();
    EngineType engineType = new EngineType();
    engineType.getEngineType();
    CarrModel carModel = new CarrModel();
    carModel.getCarName();

    
     
}}

