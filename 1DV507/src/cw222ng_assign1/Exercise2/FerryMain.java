package cw222ng_assign1.Exercise2;
  
public class FerryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FerryData ferry = new FerryData();
		Car car = new Car(4);
		Bus bus = new Bus(10);
		Bicycle bicycle = new Bicycle();
		Lorry lorry = new Lorry(2);
		Passenger passenger = new Passenger();
		
		
		ferry.embark(car);
		ferry.embark(bus);
		ferry.embark(passenger);
		ferry.embark(bicycle);
		ferry.embark(lorry);
		System.out.println(ferry.toString());
		ferry.disembark();
		System.out.println(ferry.toString());

	}

}
