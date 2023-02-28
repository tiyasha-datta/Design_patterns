package strategy;

import strategy.strategies.DriveStrategy;
import strategy.strategies.NormalDriveStrategy;

public class ManualVehicle extends Vehicle{

    public ManualVehicle() {
        super(new NormalDriveStrategy());
    }
}
