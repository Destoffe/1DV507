package cw222ng_assign1.Exercise2;
  
public class Lorry extends Vehicle {

	public Lorry(int p){
		size = 8;
		vecType = vehicleType.Lorry;
		if(p<=2 && p>0){
			
		}else throw new IndexOutOfBoundsException();
	}

}
