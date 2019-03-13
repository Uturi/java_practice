public class SwitchTest 
{
	public static void main(String[] args) 
	{
		/*
* 가위 바위 보 게임.
1. 0 (가위), 1(바위), 2(보)
2. 컴 : 난수 (0, 1, 2)
3. 결과 Logic 실행 (이김, 짐, 비김)
4. 결과 출력
    나 : 보, 컴 : 바위 결과 : 이겼다.
    나 : 보, 컴 : 보 결과 : 비겼다.
    나 : 보, 컴 : 가위 결과 : 졌다.
*/
        int my = 2; //내가 낼 것(보)
        int com = (int) (Math.random() * 3); //컴퓨터가 내는 것 (난수)   *난수 발생 함수 random()은 0.0<=n<1.0의 난수를 발생
                                                                        //: 1~3의 난수를 발생시키기 위해 3을 곱하고, 정수형으로 형변환.
        String result;
        String my_result;
        String com_result;
 
        int mid = (my-com+2)%3;  //(my-com)의 결과 중 음수가 있어, 양수로 만들기 위해 2이상의 수를 더함.    (+2)
                                 //경우의 수가 3이므로, 3으로 나눈 나머지를 구하면 나머지 경우의 수가 나옴.  (%3)
 
        // 결과 비교
        if(mid == 0){
            result = "이겼다.";
        } else if(mid == 1){
            result = "졌다.";
        } else {
            result = "비겼다.";
        }
 
        // 내 결과 한글로 변환
        switch(my){
            case 0 : my_result = "가위"; break;
            case 1 : my_result = "바위"; break;
            default : my_result = "보";
        }
 
        // 컴퓨터 결과 한글로 변환
        switch(com){
            case 0 : com_result = "가위"; break;
            case 1 : com_result = "바위"; break;
            default : com_result = "보";
        }
 
        System.out.println("나 : " + my_result + ", 컴 : " + com_result + " 결과 : " + result);
	}
}
