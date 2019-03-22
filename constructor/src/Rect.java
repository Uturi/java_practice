/*
1. 가로 width, 세로 height
2. 넓이 : calcArea()
   둘레 : calcRound()
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
			return "가로가 "+width+"이고 세로가 "+height+"인 사각형의 넓이는 "+area+"이고 둘레는 "+round+"입니다.";
		}
	
}
