package challenge.garage;

public class Bus extends Vehicle {

	private String busUsage;

	public Bus(String model, String colour, int noOfWheels, int seatingCapacity, String fuelType, String busUsage) {
		super(model, colour, noOfWheels, seatingCapacity, fuelType);
		this.setBusUsage(busUsage);
	}

	public String getBusUsage() {
		return busUsage;
	}

	public void setBusUsage(String busUsage) {
		this.busUsage = busUsage;
	}

}
