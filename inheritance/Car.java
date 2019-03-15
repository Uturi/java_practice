public class Car {
	
		String carName;
		String color;
		String maker;
		int	speed;

		public Car() {
			/*carName = "쏘나타";
			color = "검정색";
			maker = "현대";*/
			this("쏘나타", "검정색", "현대");
		}
		public Car(String color) {
		/*	this.carName = "쏘나타";
			this.color = color;
			maker = "현대";*/
			this("쏘나타", color, "현대");
		}
		public Car(String carName, String color) {
			/*this.carName = carName;
			this.color = color;
			this.maker = "현대";*/
			this(carName, color, "현대");
		}
		public Car(String carName, String color, String maker) {
			super();
			this.carName = carName;
			this.color = color;
			this.maker = maker;
		}

		

		int speedUp(int speed) {
			this.speed += speed;
			return this.speed;
		}

		

		int speedDown(int speed) {
			this.speed -= speed;
			if (this.speed < 0)
				stop();
			return this.speed;
		}

		void stop() {
			speed = 0;
		}


		@Override
		public String toString() {
			return maker + "에서 만든 "+color+" "+carName;
		}
		
		public String busInfo() {
			return maker + "에서 타는 "+color+" "+carName;
		}

		@Override
		public boolean equals(Object obj) {
			Car car = (Car) obj;
			if(carName == car.carName)
				return true;
			return false;
		}

		
	
}
