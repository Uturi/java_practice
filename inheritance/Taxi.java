/*
1. ���
  �⺻���(basicPrice)
  	�Ϲ� : 3800
	�ɾ� : 5000
  �����(totalPrice)
  ���(price)
	�Ϲ� : 100/km
	�ɾ� : 150/km
2. ��� ���(calcPrice())
3. �ɾ����� : 0�� ~ 6��
*/
import java.util.*;


public class Taxi extends Car {
	int basicPrice;
	int totalPrice;
	int price;
	int pricePerKm;

	Calendar calendar = Calendar.getInstance();
	int hour = calendar.get(Calendar.HOUR_OF_DAY);

	
	public Taxi() {
		super();
		basicPrice = 3800;
		}

	public Taxi(String carName, String color, String maker) {
			super(carName, color, maker);
		}


	void initPrice(){
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);

		if(hour < 6){
			basicPrice = 5000;
			pricePerKm = 150;
			} else {
				basicPrice = 3800;
				pricePerKm = 100;
			}
	}

	int calcPrice(int km) {
		
			price = basicPrice + (km * pricePerKm);
			return price;
	}

	void sumPrice(){
		totalPrice += price;
		price = 0;
		basicPrice = 0;
	}

	//@�� �ּ��� @Override�ؼ� �޼ҵ带 �������̵���(������).
	//�̸��Ȱ��ƾߵǰ� args�Ȱ��ƾߵǰ�, ���������ڸ� �ٲ� �� ����. ������ �ȿ�����.
	@Override 
	public int speedUp(int speed) {
			speed = super.speedUp(speed);
			if(speed>150)
				this.speed = 150;
			return this.speed;
		}

	@Override
	public String toString() {
		return super.toString() + "�ý�";
	}

}