
public class ArrayEx02 {

	public static void main(String[] args) {
		//1차원 배열 길이가 1개인 배열
		//지칭 : int형의 길이가 5인 1차원 배열 "모양" ㅁㅁㅁㅁㅁ
		//자료형[] 배열명 = new 자료형[열길이]
		int[] arr = new int[5]; //
//		System.out.println(arr);
		
		//2차원 배열 길이가 2개인 배열 곧 2차원 배열은 1차원 배열이 여러개
		//int형의 6행 4열 2차원 배열 arr2 생성
		//2차원 배열은 table(표 형태) ig) 행 * 열 / 6 * 4 
		int[][] arr2 = new int[2][3]; //의미상 강추 아래 코드와 동일
		int[] arr3[] = new int[2][3];
		int arr4[][] = new int[2][3];
		System.out.println(arr2);
		
	//문법
//		자료형[][] 배열명 = new 자료형[행 길이][행 길이]
		//일반 for문  : 중첩 for 문
//			System.out.println(arr2[0][0]);
//			System.out.println(arr2[0][1]);
//			System.out.println(arr2[0][2]);
//			System.out.println(arr2[1][0]);
//			System.out.println(arr2[1][1]);
//			System.out.println(arr2[1][2]);
//			System.out.println(arr2[2][0]);
//			System.out.println(arr2[2][1]);
//			System.out.println(arr2[2][2]);
		
			//2. 2c차원 배열 arr2에 값 설정
			arr2[0][0] = 2;
			arr2[0][1] = 4;
			arr2[0][2] = 6;
			arr2[1][0] = 8;
			arr2[1][1] = 10;
			arr2[1][2] = 12;
			
		
		
//			for(int i=0; i<2; i++) {
//				System.out.println();
//				for(int j=0; j<3; j++) {
//					System.out.print(" " + arr2[i][j]);

			// 일반 for문 : 내장변수 length 사용
//					for(int i=0; i < arr2.length; i++) {//행
//						for(int j=0; j<arr2[i].length; j++) {//열
//							System.out.println();
//							System.out.print(" " + arr2[i][j]);
//							
//						}
			//2차원 배열의 참조 변수
			//arr2 : 참조 변수
			//arr[0] : 참조 변수 = 첫번째 1차원 배열의 시작 주소
			//arr[1] : 참조 변수 = 두 번째 1차원 배열의 시작 주소
//							System.out.println("행 길이 arr2.length :" + arr2.length);
//							System.out.println("arr2[0].length :" + arr2[0].length);
//							System.out.println("arr2[1].length :" + arr2[1].length);
//							System.out.println("arr2 : " + arr2);
//							System.out.println("'행의 정보' 첫 번째 1차원 배열의 주소 : arr2[0] <행의 정보> :" + arr2[0]);
//							System.out.println("'행의 정보' 두 번째 1차원 배열의 주소 : arr2[0][0] <행의 정보> :" + arr2[0][0]);
				
					
		//향상된 for문(중첩)
			//for(자료형 변수
	
					for(int[] ar : arr2) {
						for(int s : ar) 
					System.out.print(" " + s);
						
					System.out.println();
						}
					}
	{				
}
	}
	
// [I@1ee0005  I는 integer
// [[I@6504e3b2