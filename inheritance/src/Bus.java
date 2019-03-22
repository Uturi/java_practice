public class Bus extends Car{
	int pcount;
	int sumCount;
	int maxCount = 50;

	public Bus(){
		super();
		sumCount = 0;
	}

	public Bus(String carName, String color, String maker) {
			super(carName, color, maker);
			sumCount = 0;
		}


	int getOn(int pcount){
		if(sumCount>=50){
			System.out.println("�°��� ���� á���ϴ�.");
		} else {
		sumCount += pcount;
		}
		return sumCount;
	}


	int getOut(int pcount){
		if(sumCount<=0){
			System.out.println("�°��� ��� ���Ƚ��ϴ�.");
		} else {
		sumCount -= pcount;
		}
		return sumCount;
	}


}
