package challenge.garage;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> listOfVehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		listOfVehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		listOfVehicles.remove(vehicle);
	}

//	public void removeVehicleByType(Class<?> classType) {
//		for (Vehicle vehicle : listOfVehicles) {
//			if (vehicle instanceof classType) {
//				removeVehicle(vehicle);
//			}
//		}
//	}

	public void removeVehicleByType(String type) {
		ArrayList<Vehicle> vehiclesToBeRemoved = new ArrayList<>();
		for (Vehicle vehicle : listOfVehicles) {
			if (vehicle.getClass().getSimpleName().equals(type)) {
				vehiclesToBeRemoved.add(vehicle);
			}
		}
		listOfVehicles.removeAll(vehiclesToBeRemoved);

	}

	public int fixVehicle(Vehicle vehicle) {
		int bill = 0;
		if (vehicle.getClass().getSimpleName().equals("Car")) {
			if (vehicle.getFuelType().equals("Electric")) {
				bill = applyElectricDiscount((vehicle.getSeatingCapacity() * vehicle.getNoOfWheels()) * 100);
			} else {
				bill = (vehicle.getSeatingCapacity() * vehicle.getNoOfWheels()) * 100;
			}
		} else if (vehicle.getClass().getSimpleName().equals("Motorbike")) {
			if (vehicle.getFuelType().equals("Electric")) {
				bill = applyElectricDiscount((vehicle.getSeatingCapacity() * vehicle.getNoOfWheels()) * 300);
			} else {
				bill = (vehicle.getSeatingCapacity() * vehicle.getNoOfWheels()) * 300;
			}
		} else if (vehicle.getClass().getSimpleName().equals("Bus")) {
			if (vehicle.getFuelType().equals("Electric")) {
				bill = applyElectricDiscount((vehicle.getSeatingCapacity() * vehicle.getNoOfWheels()) * 15);
			} else {
				bill = (vehicle.getSeatingCapacity() * vehicle.getNoOfWheels()) * 15;
			}
		} else {
			System.out.println("There are no vehicles to fix.");
		}
		return bill;
	}

	public int applyElectricDiscount(int bill) {
		int discountRate = 15;
		int discountedBill = ((100 - discountRate) * bill) / 100;
		return discountedBill;
	}

	public void emptyGarage() {
		for (Vehicle vehicle : listOfVehicles)
			removeVehicle(vehicle);

	}

	@Override
	public String toString() {
		return "Garage [Vehicles in Garage:" + listOfVehicles + "\n]";
	}

}
