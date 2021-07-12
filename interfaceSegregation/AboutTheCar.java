    interface CarDetails {
        void carbrand();
        void colour();
        void engineType();
        void model();
        void milage();
    
    }
    interface RegistrationProcess {
        void interior();
        void registrationProcessDetails();
        void gettingAFancyNumber();
        void documentsRequired();

    }

    class Registration implements RegistrationProcess {
        @Override
        public void interior() {

            System.out.println("Registration Process");
            System.out.println("warm and cool interior");
            
        }
    
        @Override
        public void registrationProcessDetails() {
            
            System.out.println("registration process");
        }
    
        @Override
        public void gettingAFancyNumber() {
            System.out.println("7777");
            
        }
        @Override
        public void documentsRequired() {
            
            System.out.println("ID proofd and passport size photo");
        }

    }

public class AboutTheCar implements CarDetails {

    @Override
    public void carbrand() {

        System.out.println("About The Car");
        System.out.println("HONDA");
    }

    @Override
    public void colour() {
      
        System.out.println("Red");
    }

    @Override
    public void engineType() {
        
        System.out.println("Petrol Engine");
    }

    @Override
    public void model() {
        
        System.out.println("Amaze");
    }

    @Override
    public void milage() {
        System.out.println("20KM/L");
        System.out.println("-----------------------------------------------------------");

        
        
    }
    public static void main(String[] args){

        CarDetails carDetail = new AboutTheCar();
        carDetail.carbrand();
        carDetail.colour();
        carDetail.engineType();
        carDetail.model();
        carDetail.milage();

        RegistrationProcess registerProcess = new Registration();
        registerProcess.interior();
        registerProcess.registrationProcessDetails();
        registerProcess.gettingAFancyNumber();
        registerProcess.documentsRequired();


    }

   
}

