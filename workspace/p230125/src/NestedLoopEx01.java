/*
 * for문 안에 for문
 * 
 * 
 * 
 */
public class NestedLoopEx01 {

	public static void main(String[] args) {

		for(int i=0; i<3; i++) {
			System.out.println("[바깥쪽 for문] " + (i+1));
			
			for(int j=0; j<3; j++) {
				System.out.println("\t[안쪽 for문] " +(j+1) + "차 회전");
				System.out.println("\t[안쪽 for문] i >>" +i);
				for(int y=0; y<7; y++) {
					System.out.println(y+"돌고");
		}
			System.out.println();
		}
	}

	}
}