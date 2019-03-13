/*
1. 체력 hp 100, 모드 ( 0 : 일반모드, 1 : 흥분모드 )
2. 공격 attack()
	1회 공격당 적체력 (0 : -10, 1 : -15)
   모드변경 changeMode()
   	내체력 -25;
	내체력 40이하일 경우는 모드변경 불가능.
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
				System.out.println("경고 : 모드 변경 불가!!!!");
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
		System.out.println("내 체력 : "+hp+"  적 체력 : die");
		} else{
		System.out.println("내 체력 : "+hp+"  적 체력 : "+enemy.hp);
		}	
	}
		

}	
