public class  IfTest3
{
	public static void main(String[] args) 
	{
		int score=95;
		String level; 
		/*
score(����)��
    90�̻��̸� ���� = A
    80�̻��̸� ���� = B
    70�̻��̸� ���� = C
    60�̻��̸� ���� = D
    60�̸��̑m ���� = F
 
x5�� �̻��̸� +
 
��� : ������ xx���̹Ƿ� X�����Դϴ�.
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
 
        // *�켱���� [ && > || ]
        // ���� > 60 �̸鼭,
        // ���� >= 100 �Ǵ� ���� x5 >= 5�� ���
        if(score > 60 && (score >= 100 || (score % 10) >= 5 )) {
            level += "+";
        }
 
        System.out.println("������ " + score + "���̹Ƿ� " + level + "�����Դϴ�.");
	}
}
