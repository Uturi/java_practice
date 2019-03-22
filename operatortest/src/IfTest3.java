public class  IfTest3
{
	public static void main(String[] args) 
	{
		int score=95;
		String level; 
		/*
score(점수)가
    90이상이면 학점 = A
    80이상이면 학점 = B
    70이상이면 학점 = C
    60이상이면 학점 = D
    60미만이몀 학점 = F
 
x5점 이상이면 +
 
결과 : 점수가 xx점이므로 X학점입니다.
*/
 
	if(score >= 90) {
            level = "A";
        } else if(score >= 80) {
            level = "B";
        } else if(score >= 70) {
            level = "C";
        } else if (score >= 60){
            level = "D";
        } else {
            level = "F";
        }
 
        // *우선순위 [ && > || ]
        // 점수 > 60 이면서,
        // 점수 >= 100 또는 점수 x5 >= 5인 경우
        if(score > 60 && (score >= 100 || (score % 10) >= 5 )) {
            level += "+";
        }
 
        System.out.println("점수가 " + score + "점이므로 " + level + "학점입니다.");
	}
}
