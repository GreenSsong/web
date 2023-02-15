/*
 * 해답편
 */




public class Ifquiz01_1 {

	public static void main(String[] args) {
		
		int n1 = 11, n2 = 11;
		
		//if문 조건 2개
		// frist rule 
		
//		if (n1 > n2) {
//				System.out.println("큰 값 : " + n1 + ", 작은 값 : " + n2);
//			else if (n1 < n2) {
//				System.out.println("큰 값 : " + n2 ", 작은 값 : " + n1);
//				
				
		// secend		
		//변수를 두고 초기화를 하는 것을 권장한다. 
	
		int max = 0, min = 0; //초기화 할때 어떤 값을 넣을지 생각하라. 
		
		if(n1 > n2) {
			max = n1;
			min = n2;
			
		}	else if (n1 < n2)  {
			max = n2;
			min = n1;
			
		}else {		
				
		
				System.out.println("큰 값 >> " + max + ", 작은 값 >> " + min );

			}
	}

	
			
			
			
			
		
		
		
		
		

		
	}

}
