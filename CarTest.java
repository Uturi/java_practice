public class CarTest 
{
	public static void main(String[] args) 
	{
		Car car1 = null;
		car1 = new Car();
		System.out.println("1. ���̸� : " + car1.carName +" ���� : "+car1.color+" ������ : "+car1.maker);
		car1.carName = "�Ÿ";
		car1.color = "������";
		car1.maker = "����";
		System.out.println("2. ���̸� : " + car1.carName +" ���� : "+car1.color+" ������ : "+car1.maker);

		Car car2 = new Car();
		car2.carName = "K5";
		car2.color = "���";
		car2.maker = "���";
		System.out.println("Z. ���̸� : " + car2.carName +" ���� : "+car2.color+" ������ : "+car2.maker);


		Car car = new Car();

		car.speedUp();
		System.out.println("���� �ӵ���"+ car.speed);	
		car.speedUp();
		System.out.println("���� �ӵ���"+ car.speed);	
		car.speedDown();
		System.out.println("���� �ӵ���"+ car.speed);	
		car.stop();
		System.out.println("���� �ӵ���"+ car.speed);
		
	}
}

















