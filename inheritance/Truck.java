public class Truck extends Car {
	int weight;
	int maxWeight=50;
	int sumWeight;

	public Truck(){
		super();
	}

	public Truck(String carName, String color, String maker){
		super(carName, color, maker);
	}




	int loadUp(int weight){
		sumWeight += weight;
		if(sumWeight>=maxWeight)
			System.out.println("Àü·¡ ¹«°Å¿ö »©¾Ú");
		return weight;
	}


	int loadDown(int weight){
		sumWeight -= weight;
		if(sumWeight<=0)
			System.out.println("Àü·¡ °¡º­¿ö »©¾Ú");
		return weight;
	}

}
