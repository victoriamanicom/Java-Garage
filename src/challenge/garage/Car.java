package challenge.garage;

public class Car extends Vehicle {

	private int noOfDoors;

	private String style;

	public Car(String model, String colour, int noOfWheels, int seatingCapacity, String fuelType, int noOfDoors,
			String style) {
		super(model, colour, noOfWheels, seatingCapacity, fuelType);
		this.setNoOfDoors(noOfDoors);
		this.setStyle(style);
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return "\n Car [" + noOfDoors + "-door " + getColour() + " " + getModel() + " " + style + " with capacity "
				+ getSeatingCapacity() + " people. Fuel Type: " + getFuelType() + "]";
	}

}
