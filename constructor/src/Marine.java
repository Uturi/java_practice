/*
1. ü�� hp 100, ��� ( 0 : �Ϲݸ��, 1 : ��и�� )
2. ���� attack()
	1ȸ ���ݴ� ��ü�� (0 : -10, 1 : -15)
   ��庯�� changeMode()
   	��ü�� -25;
	��ü�� 40������ ���� ��庯�� �Ұ���.
*/
public class Marine {
	
	int hp, mode;
	boolean kill;


	public void attack(int count, Marine enemy){
		if(enemy.hp<=0){
			kill = true;
		}
			 else{
			if(mode==1){
				for(int i=0;i<count;i++){
					enemy.hp -= 15;
					if(enemy.hp<=0){
						kill=true;
					}
				}
			} else {
				for(int i=0;i<count;i++){
					enemy.hp -= 10;
					if(enemy.hp<=0){
						kill=true;
					}
					}
				}
		}
	
	}
		


	
	public void changeMode(){	
		if(hp<=40){
				System.out.println("��� : ��� ���� �Ұ�!!!!");
		} else{
			mode=1;
			hp -= 25;
		}

	}
		
	public Marine(){
			this(100,0,false);
		}

	public Marine(int hp, int mode, boolean kill){
			this.hp = hp;
			this.mode = mode;
			this.kill = kill;
		}

	public void info(Marine enemy){
		if(kill==true){
		System.out.println("�� ü�� : "+hp+"  �� ü�� : die");
		} else{
		System.out.println("�� ü�� : "+hp+"  �� ü�� : "+enemy.hp);
		}	
	}
		

}	
