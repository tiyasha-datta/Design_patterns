package strategy;

import strategy.strategies.DriveStrategy;
import strategy.strategies.SportsDriveStretegy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SportsDriveStretegy());
    }
}
