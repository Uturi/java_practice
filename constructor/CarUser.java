public class CarUser 
{
	public static void main(String[] args) 	{
		Car car1 = new Car();
		System.out.println(car1.info());
		Car car2 = new Car("흰색");
		System.out.println(car2.info());
		Car car3 = new Car("그랜져","흰색");
		System.out.println(car3.info());
		Car car4 = new Car("K5","흰색","기아");
		System.out.println(car4.info());
	
		
		System.out.println("car4의 속도를 3회 증가!!!");
		for(int i=0;i<3;i++)
			car4.speedUp();
		System.out.println("car4 속도 : " + car4.speed);

		System.out.println("car4의 속도를 85 증가!!!");
		int speed = car4.speedUp(85);
		System.out.println("car4 속도 : " + speed);
		System.out.println("car4 속도 : " + car4.speed);
		
		speed = car4.speedUp(10);
		car4.speedUp();
		car4.speedUp();
		System.out.println("car4 : " + speed);
		System.out.println("car4의 속도를 65 감소!!!");
		car4.speedUp(-65);
		System.out.println("car4 속도 : " + car4.speed);
		System.out.println("car4 정지");
		car4.stop();
		System.out.println("car4 속도 : " + car4.speed);
	
	}
}
