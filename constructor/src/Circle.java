/*
1. ������ radius
2. ���� : calcArea()	���� : ��r��
3. �ѷ� : calcRound()	���� : 2��r
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
			return "�������� "+radius+"�� ���� ���̴� "+area+"�̰� �ѷ��� "+round+"�Դϴ�.";
		}

}
