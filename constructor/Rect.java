/*
1. ���� width, ���� height
2. ���� : calcArea()
   �ѷ� : calcRound()
*/
public class Rect {

	int width, height, area, round;
	

	void calcArea(){
		this.area = width * height;
		
	}

	void calcRound(){
		this.round = (width*2) + (height*2);
		
	}

	public Rect(){
		this(4,3);
	}

	public Rect(int width, int height){
		this.width = width;
		this.height = height;
	}

	String info() {
			return "���ΰ� "+width+"�̰� ���ΰ� "+height+"�� �簢���� ���̴� "+area+"�̰� �ѷ��� "+round+"�Դϴ�.";
		}
	
}
