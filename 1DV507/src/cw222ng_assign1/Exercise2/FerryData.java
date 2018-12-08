package cw222ng_assign1.Exercise2;

import java.util.ArrayList;
import java.util.Iterator;

public class FerryData implements Ferry {

	private int passengerAmount=0; // Passagerar platser
	private int sizeLeft = 200; // Totala storleken i färjan
	private int money = 0; // Pengar tjänat
	private ArrayList<Vehicle> currentVehicles= new ArrayList<>();

	public int countPassengers() {
		// TODO Auto-generated method stub
		return passengerAmount;
	}

	public int countVehicleSpace() {
		// TODO Auto-generated method stub
		return 200 - sizeLeft;
	}

	public int countMoney() {
		// TODO Auto-generated method stub
		return money;
	}

	public Iterator<Vehicle> iterator() {
		return iterator();
	}

	public void embark(Vehicle v) {
		if(hasSpaceFor(v) && hasRoomFor(v.getPassenger()) && !v.getState()){ // Om det finns plats i färjan, för fordon och passagerare och att fordonet inte redan är stationerat i färjan
			sizeLeft = sizeLeft - v.size;
			passengerAmount+=v.getPassenger().getPassAmount();
			v.stationVehicle();
			currentVehicles.add(v);
			switch(v.getType()){
				case Bicycle:
					money+=20;
					break;
				case Car:
					money += 100 +(15*( v.getPassenger().getPassAmount()));
					break;
				case Bus:
					money +=200 +(10*( v.getPassenger().getPassAmount()));
					break;
				case Lorry:
					money +=300 +(15*( v.getPassenger().getPassAmount()));
					break;
			}
		}else throw new IndexOutOfBoundsException();
	}

	public void embark(Passenger p) {
		if(hasRoomFor(p)){
			passengerAmount +=p.getPassAmount();
			money += 20*p.getPassAmount();
		}else throw new IndexOutOfBoundsException();
		
	}

	public void disembark() { // Lossa av alla fordonen, återställer antalet platser och passerare.
		sizeLeft = 200;
		passengerAmount = 0;
		int temp = currentVehicles.size();
		while(currentVehicles.size() >0){
			currentVehicles.get(0).stationVehicle();
			currentVehicles.remove(0);
		}
		
	}

	public boolean hasSpaceFor(Vehicle v) { // Finns det plats för fordonet isåfall return true
		if(v.getSize() <= sizeLeft)
			return true;
		
		return false;
	}

	public boolean hasRoomFor(Passenger p) { // Om antalet passerare som följer med fordonet är mindre än antalet plats går returnera true
		// TODO Auto-generated method stub
		if(p.getPassAmount() + passengerAmount <=200)
			return true;
		
		return false;
	}
	
	public String toString(){
		
		return "Current amount of vehicles on ferry : " + currentVehicles.size()+"."+ "\n"
			+  "Current amount of passengers on ferry : " + passengerAmount + " \n" +
			   "Current money earned : " + countMoney() + " \n"+
			   "Can fit " + (200-passengerAmount) + " passengers " + "\n" +
			   "Can fit " + sizeLeft + " more vehicles" + "\n";
	}

}
