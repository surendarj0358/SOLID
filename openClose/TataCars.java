

// open and close method

        interface CostOfTheCar{ //interface for the requirement of getCostOfTheCar

            void getCostOfTheCar();

}

    class MarutiCar implements CostOfTheCar{

        static String maruti = "Maruti 800";
        double carprice = 2.5;

        @Override
        public void getCostOfTheCar() {
            System.out.println("the  name of the car is " +maruti);
            System.out.println(maruti +" is cost of " + carprice+ " Lakh Rupees");
}

}

public class TataCars implements CostOfTheCar {//implement the interface costOfTheCar for class TataCars

        String tata = "Nano";  
        double carprice = 1;
  
        @Override
        public void getCostOfTheCar() {
             System.out.println("the  name of the car is "+tata);
             System.out.println(tata+ " is cost of " + carprice+ " Lakh Rupees");   
    }

public static void main(String[] args){
    MarutiCar marutiCar = new MarutiCar();
        marutiCar.getCostOfTheCar();
    TataCars tataCars = new TataCars();
        tataCars.getCostOfTheCar();

}
}


       
        