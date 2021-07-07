package challenge.garage;

public class Motorbike extends Vehicle {

	private String bikeType;

	public Motorbike(String model, String colour, int noOfWheels, int seatingCapacity, String fuelType,
			String bikeType) {
		super(model, colour, noOfWheels, seatingCapacity, fuelType);
		this.setBikeType(bikeType);
	}

	public String getBikeType() {
		return bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

}
