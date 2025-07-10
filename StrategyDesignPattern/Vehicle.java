public class Vehicle {
    DriveStrategy strategy;
    public Vehicle(DriveStrategy strat){
        this.strategy=strat;
    }
    public void drive(){
        strategy.drive();
    }
}
