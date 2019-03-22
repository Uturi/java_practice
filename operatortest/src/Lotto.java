public class  Lotto
{
	public static void main(String[] args) 
	{
		/*
* Lotto
1 - 3까지의 서로 다른 난수 3개 발생.
*/
        int num1 = (int) (Math.random() * 3 + 1);
        int num2 = 0;
        int num3 = 0;
        //num1과 num2만 비교
        for(;;){
            num2 = (int) (Math.random() * 3 + 1);
            if(num1 != num2){
                break;
            }
        }
        //num3과 num1, num2만 비교
        for(;;){
            num3 = (int) (Math.random() * 3 + 1);
            if(num1 != num3 && num2 != num3){
                break;
            }
        }
         System.out.println("금주 당첨 번호 : " + num1 + " " + num2 + " " + num3);
	}
}
