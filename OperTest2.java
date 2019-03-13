public class OperTest2 
{
	public static void main(String[] args) 
	{
		int num1 = 13, num2 = 5, num3 = num1 + num2; 		

		System.out.println(num1+" + "+num2+" = "+num3);
		System.out.println(num1+" + "+num2+" = "+num1+num2);
		System.out.println(num1+" + "+num2+" = "+(num1+num2));

		num3 = num1 - num2;
		System.out.println(num1+" - "+num2+" = "+num3);
		System.out.println(num1+" + "+num2+" = "+(num1-num2));							

		num3 = num1 * num2;
		System.out.println(num1+" * "+num2+" = "+num3);
		System.out.println(num1+" + "+num2+" = "+num1*num2);

		num3 = num1 / num2;
		System.out.println(num1+" / "+num2+" = "+num3);
		System.out.println(num1+" + "+num2+" = "+num1/num2);

		num3 = num1 % num2;
		System.out.println(num1+" % "+num2+" = "+num3);
		System.out.println(num1+" + "+num2+" = "+num1%num2);
	}
}

