public class  Lotto
{
	public static void main(String[] args) 
	{
		/*
* Lotto
1 - 3������ ���� �ٸ� ���� 3�� �߻�.
*/
        int num1 = (int) (Math.random() * 3 + 1);
        int num2 = 0;
        int num3 = 0;
        //num1�� num2�� ��
        for(;;){
            num2 = (int) (Math.random() * 3 + 1);
            if(num1 != num2){
                break;
            }
        }
        //num3�� num1, num2�� ��
        for(;;){
            num3 = (int) (Math.random() * 3 + 1);
            if(num1 != num3 && num2 != num3){
                break;
            }
        }
         System.out.println("���� ��÷ ��ȣ : " + num1 + " " + num2 + " " + num3);
	}
}
