package parkingLot;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ParkingLot lot = new ParkingLot();
		lot.print();
		Vehicle v = null;
		v = new Bus();
		System.out.print("\nParking a B1 \n");		
		lot.parkVehicle(v);
		lot.print();
		v = new Bus();
		System.out.print("\nParking a B2 \n");		
		lot.parkVehicle(v);
		lot.print();
		v = new Bus();
		System.out.print("\nParking a B3 \n");		
		lot.parkVehicle(v);
		lot.print();
		v = new Bus();
		System.out.print("\nParking a B4 \n");		
		lot.parkVehicle(v);
		lot.print();
		v = new Bus();
		System.out.print("\nParking a B5 \n");		
		lot.parkVehicle(v);
		lot.print();
		lot.removeVehical(v);		
		System.out.println("removed vehical \n");
		lot.print();
		v = new Bus();
		System.out.print("\nParking a B6 \n");		
		lot.parkVehicle(v);
		lot.print();
		
		
		/*while (v == null || lot.parkVehicle(v)) {
			lot.print();
			int r = (int)(Math.random()*10);
			if (r < 2) {
				v = new Bus();
			} else if (r < 4) {
				v = new Motorcycle();
			} else {
				v = new Car();
			}
			System.out.print("\nParking a ");
			v.print();
			System.out.println("");
		}*/
		
		/*System.out.println("Parking Failed. Final state: ");
		lot.print();*/
	}

}
