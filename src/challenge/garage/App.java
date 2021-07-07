package challenge.garage;

public class App {

	public static void main(String[] args) {
		Garage garage = new Garage();

		Car car1 = new Car("Mini", "Grey", 4, 4, "Petrol", 3, "Convertible");
		Car car2 = new Car("Mercedes Benz", "Blue", 4, 5, "Diesel", 5, "SUV");
		Bus bus1 = new Bus("Volvo", "Red", 6, 32, "Electric", "Public Transport");
		Bus bus2 = new Bus("Volvo", "Black", 6, 32, "Petrol", "Public Transport");
		Motorbike motorbike1 = new Motorbike("Triumph", "Green", 2, 2, "Petrol", "Cruiser");
		Motorbike motorbike2 = new Motorbike("Triumph", "Blue", 2, 2, "Electric", "Cruiser");

		garage.addVehicle(car1);
		garage.addVehicle(motorbike1);
		garage.addVehicle(motorbike2);
		garage.addVehicle(car2);
		garage.addVehicle(bus1);
		garage.addVehicle(bus2);

		System.out.println(garage);

//		System.out.println(garage.fixVehicle(car1));
//		System.out.println("Bus 1: " + garage.fixVehicle(bus1));
//		System.out.println("Bus 2: " + garage.fixVehicle(bus2));
//		System.out.println(garage.fixVehicle(motorbike1));
//		System.out.println(garage.fixVehicle(motorbike2));

//		garage.removeVehicleByType("Car");
//
//		System.out.println(garage);

		garage.emptyGarage();
		System.out.println(garage);
	}

}
