public class CarTest 
{
	public static void main(String[] args) 
	{
		Car car1 = null;
		car1 = new Car();
		System.out.println("1. 차이름 : " + car1.carName +" 색상 : "+car1.color+" 제조사 : "+car1.maker);
		car1.carName = "쏘나타";
		car1.color = "검정색";
		car1.maker = "현대";
		System.out.println("2. 차이름 : " + car1.carName +" 색상 : "+car1.color+" 제조사 : "+car1.maker);

		Car car2 = new Car();
		car2.carName = "K5";
		car2.color = "흰색";
		car2.maker = "기아";
		System.out.println("Z. 차이름 : " + car2.carName +" 색상 : "+car2.color+" 제조사 : "+car2.maker);


		Car car = new Car();

		car.speedUp();
		System.out.println("현재 속도는"+ car.speed);	
		car.speedUp();
		System.out.println("현재 속도는"+ car.speed);	
		car.speedDown();
		System.out.println("현재 속도는"+ car.speed);	
		car.stop();
		System.out.println("현재 속도는"+ car.speed);
		
	}
}

















