
public class ArrayEx02CleanCode {

	public static void main(String[] args) {
		int[] arr = new int[] {2, 4, 6, 8, 10}; 
		
					//의미상 강추 아래 코드와 동일
		//2차원 배열 생성과 동시에 초기화
		//int[][] arr2 = new int[][] {{2, 4,},{8, 10, 12}}; 
		int[][] arr2 = {{2, 4,},{8, 10, 12}}; //초기화 할때만		
//		int[] arr3[] = new int[2][3];
//		int arr4[][] = new int[2][3];
		
		System.out.println("1행   :" +arr2.length);
		System.out.println("1행 1열   :" +arr2[0].length);
		System.out.println("1행 2열   :" +arr2[1].length);
		
					//향상된 for문(중첩)
		
		
			for(int[] ar : arr2) {
				for(int s : ar) 
					System.out.print(" " + s);
						
			System.out.println();
			}
	}
}
	
// [I@1ee0005  I는 integer
// [[I@6504e3b2