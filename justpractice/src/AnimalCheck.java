
public class AnimalCheck {

	public static void main(String[] args) {
		
		int c3=0, c4=0, c5=0, c8=0;
		int num=24;
		
		for(int i=1;i<=num;i++) {
			System.out.print(i + ". ");
		if(i%3==0) {
			c3++;
			System.out.print("dog\t");
		}
		if(i%4==0) {
			c4++;
			System.out.print("cat\t");
		}
		
		if(i%5==0) {
			c5++;
			System.out.print("rabbit\t");
		}
		
		if(i%8==0) {
			c8++;
			System.out.print("turtle\t");
		}
		System.out.println("");
		}
		
		System.out.println("----------------------");
		System.out.println("dog "+c3+" ȸ");
		System.out.println("cat "+c4+" ȸ");
		System.out.println("rabbit "+c5+" ȸ");
		System.out.println("turtle "+c8+" ȸ");
		

	}

}
