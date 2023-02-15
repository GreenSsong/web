/*
 * 
 * 상속 관계
 * 
 * IS - A 관계
 * : 문장 
 * ~는 ~다.
 * :ef) 학생은 사람이다. 
 * :	사람은 학생이다.
 * !) 부모 조건 : 추상적, 일반적
 * 	  자식 조건 : 구체적 
 * 
 * HAS - A 관계 소유 관계 , 포함 관계
 * ~는 ~를 소유(포함) 하고 있다.
 * ef) phone 은 camera 를 포함하고 있다. 
 * 		camera는 phone 를 포함하고 있다 (x)
 */


//class Police extends Gun{
//	int handcuffs;
//	public Police(int bnum, int bcuff) {
//		super(bnum);
//		handcuffs=bcuff;
//	}
//	public void putHandcuff() {
//		System.out.println("snap!");
//		handcuffs--;
//	}
//}
class Gun{
	int bullet;
	public Gun(int bnum) {
		bullet = bnum;
	}
	public void shoot() {
		System.out.println("BBang");
		bullet--;
	}
}

// 객체 안에서 다른 객체를 관리 한다 (포함 관계) containment
class Police {
	int handcuffs;
	Gun pistol;
	
	public Police(int bnum, int bcuff) {
		handcuffs=bcuff;
		if(bnum!=0)
				pistol=new Gun(bnum);
		else
				pistol=null;
	}
	public void putHandcuff() {
		System.out.println("Snap");
		handcuffs--;
	}
	public void shoot() {
		if(pistol==null)
				System.out.println("hut BBang");
		else
				pistol.shoot();
	}
}
public class InheritanceEx05 {
	public static void main(String[] args) {
		Police pman = new Police(5, 3);
		pman.shoot();
		pman.putHandcuff();
	}
}
