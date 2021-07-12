// viloate the open close principle

    class MarutiCarName {

    public void getMarutiCarModelName() {
         String marutiCarModelName= "Maruti 800";
         System.out.println(marutiCarModelName);
                
    }
}

    class TataCar  {

    public void getTataCarModelName() {  
         String tataCarModelNaame = "Nano";
         System.out.println(tataCarModelNaame);
            
    }
}

public class PrintCarDetails{

    public void getTheCostOfTheCar() {
        System.out.println("Maruti 800 is cost of 2.5Lakh Rupees");
        System.out.println("Nano is cost of 1Lakh Rupees");
    }
    

public static void main(String[] args){
    TataCar tataCar = new TataCar();
    MarutiCarName marutiCar = new MarutiCarName();
    PrintCarDetails print = new PrintCarDetails();
    marutiCar.getMarutiCarModelName();
    tataCar.getTataCarModelName();
    print.getTheCostOfTheCar();
}       
}

