package challenge.garage;

public class App {

	public static void main(String[] args) {
		Garage garage = new Garage();

		Car car1 = new Car("Mini", "Grey", 4, 4, "Petrol", 3, "Convertible");
		Car car2 = new Car("Mercedes Benz", "Blue", 4, 5, "Diesel", 5, "SUV");
		Bus bus1 = new Bus("Volvo", "Red", 6, 32, "Electric", "Public Transport");
		Bus bus2 = new Bus("Greyhound", "Black", 6, 27, "Petrol", "School Bus");
		Motorbike motorbike1 = new Motorbike("Triumph", "Green", 2, 2, "Petrol", "Cruiser");
		Motorbike motorbike2 = new Motorbike("Suzuki", "Blue", 2, 2, "Electric", "Sport");

		garage.addVehicle(car1);
		garage.addVehicle(motorbike1);
		garage.addVehicle(motorbike2);
		garage.addVehicle(car2);
		garage.addVehicle(bus1);
		garage.addVehicle(bus2);

		System.out.println(garage);

		System.out.println(garage.fixVehicle(car1));
		System.out.println(garage.fixVehicle(car2));
		System.out.println(garage.fixVehicle(bus1));
		System.out.println(garage.fixVehicle(bus2));
		System.out.println(garage.fixVehicle(motorbike1));
		System.out.println(garage.fixVehicle(motorbike2));

//		garage.removeVehicleByType("Car");
//
//		System.out.println(garage);

//		garage.emptyGarage();
//		System.out.println(garage);
	}

}
