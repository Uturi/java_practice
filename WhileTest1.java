public class WhileTest1 
{
	public static void main(String[] args) 
	{
		System.out.println("1 - 10 까지 출력.");
		int i = 0;
		while(i < 10){
			System.out.println(++i);
		}

		System.out.println("1 - 10 까지의 수 중 난수 발생.");
		boolean flag = true;
		int wc = 0;
		while (flag) {
			wc++;
			int number = (int) (Math.random()*11);//0 - 11
			if(number !=0) {
				System.out.println("number == " + number);
			} else {
				System.out.println("0이 발생("+ wc +"번째)되어 프로그램 종료!!!!");
				flag = false;
			}
		}
	}
}




