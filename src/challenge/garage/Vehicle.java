package challenge.garage;

public abstract class Vehicle {
	private String model;

	private String colour;

	private int noOfWheels;

	private int seatingCapacity;

	private String fuelType;

	public Vehicle(String model, String colour, int noOfWheels, int seatingCapacity, String fuelType) {
		super();
		this.setModel(model);
		this.setColour(colour);
		this.setNoOfWheels(noOfWheels);
		this.setSeatingCapacity(seatingCapacity);
		this.setFuelType(fuelType);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "\n" + this.getClass().getSimpleName() + " [Model: " + model + ", Colour: " + colour
				+ ", Number of Wheels: " + noOfWheels + ", Seating Capacity: " + seatingCapacity + ", Fuel Type: "
				+ fuelType + "]";
	}

}
