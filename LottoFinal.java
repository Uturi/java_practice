public class LottoFinal
{
	public static void main(String[] args) 
	{

		int num1 = (int) (Math.random()*45 + 1);
        int num2 = (int) (Math.random()*45 + 1);
        int num3 = (int) (Math.random()*45 + 1);
		int num4 = (int) (Math.random()*45 + 1);
        int num5 = (int) (Math.random()*45 + 1);
        int num6 = (int) (Math.random()*45 + 1);
		for (int i=1; i < 6; i++){
		do{
			num1 = (int) (Math.random()*45 + 1);
			num2 = (int) (Math.random()*45 + 1);
			num3 = (int) (Math.random()*45 + 1);
			num4 = (int) (Math.random()*45 + 1);
			num5 = (int) (Math.random()*45 + 1);
			num6 = (int) (Math.random()*45 + 1);
		}
		while (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num2 == num3 || num2 == num4	|| 
			num2 == num5 || num2 == num6 || num3 == num4 || num3 == num5 || num3 == num6 || num4 == num5 || num4 == num6 || num5 == num6);
		System.out.println(i + " 번째 게임");
		
		System.out.print("당첨 번호 : ");
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);
		}

		
	}
}
