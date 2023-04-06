package entity;

import parking.parkingSpot.ParkingSpot;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class Ticket {
    Timestamp entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    public Ticket(Timestamp entryTime, Vehicle v, ParkingSpot spot) {
        this.entryTime = entryTime;
        this.vehicle = v;
        this.parkingSpot = spot;
    }

    public Timestamp getEntryTime() {
        return this.entryTime;
    }

    public void setEntryTime(Timestamp entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "\nentryTime=" + entryTime+
                ",\n vehicleId=" +vehicle.getVehicleNumber() + " vehicleType- "+vehicle.getType() +
                ",\n parkingSpot= " +"id: " +parkingSpot.getSpotId() +
                "\n}";
    }
}
