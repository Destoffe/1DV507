package cw222ng_assign1.Exercise2;

public class Bus extends Vehicle{
	
	public Bus(int p){
		size = 8;
		vecType = vehicleType.Bus;
		if(p<=20 && p>0){
			passengers.setPassengers(p);
		}else throw new IndexOutOfBoundsException();
	}

}
