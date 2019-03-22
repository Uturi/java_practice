public class IfTest
{
	public static void main(String[] args) 
	{
	int jumin = 2;
	  if(jumin % 2 == 0){
		  System.out.println("여자");
	    }
	  if(jumin % 2 != 0){
		  System.out.println("남자");         //같은 실행문을 가진 if문을 두 번 쓰는 것은 비효율적
	    }
			System.out.println("");
	}
}
