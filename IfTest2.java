public class IfTest2
{
	public static void main(String[] args) 
	{
		int jumin = 2;
		String gender = "여자";
			if(jumin % 2 != 0){
				 gender = "남자";
			}
	    System.out.println(gender);      //변수를 이용하여 if문을 한 번으로 줄임!
	}
}
