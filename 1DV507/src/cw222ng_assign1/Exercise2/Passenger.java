package cw222ng_assign1.Exercise2;

public class Passenger {
	
	private int passengerAmount;
	
	public Passenger(){
		passengerAmount = 1;
	}
	
	public Passenger(int n){
		passengerAmount = n;
	}
	
	public void setPassengers(int n){
		passengerAmount = n;
	}
	
	public int getPassAmount(){
		return passengerAmount;
	}

}
