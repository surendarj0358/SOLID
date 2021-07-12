
// dependency inversion principle

    interface ReverseFunction {

      void setTheReverseGear();
      void raiseTheAccelerator();
  }

  

public class TataNanoCar implements ReverseFunction {

  
  public void starTheCar(){

  }
  @Override
  public void setTheReverseGear() {
  
  }
  @Override
  public void raiseTheAccelerator() {
    
  }
  

  public static void main(String[] args){

    ReverseFunction reverse = new TataNanoCar();
    TataNanoCar start = new TataNanoCar();
    start.starTheCar();
    reverse.setTheReverseGear();
    reverse.raiseTheAccelerator();
    
  }
}



  

