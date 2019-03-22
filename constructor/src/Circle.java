/*
1. 반지름 radius
2. 넓이 : calcArea()	공식 : πr²
3. 둘레 : calcRound()	공식 : 2πr
*/
public class Circle {
		
		double radius, area, round;

		void calcArea(){
			this.area = 3.14 * radius * radius;
		}

		void calcRound(){
			this.round = 2 * 3.14 * radius;
		}

		public Circle(){
			this(4);
		}

		public Circle(double radius){
			this.radius = radius;
		}

		String info() {
			return "반지름이 "+radius+"인 원의 넓이는 "+area+"이고 둘레는 "+round+"입니다.";
		}

}
