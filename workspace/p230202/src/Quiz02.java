import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {			//메인으로 설정값 받음
		int count =0;									// 카운터 변수 초기화
		Scanner input = new Scanner(System.in);			// 스캐너 input 값
			System.out.println("1 ~ 10까지 정수를 입력해주세요~");		//출력
		
		int userN = input.nextInt();					// input 를 userN으로 변경
		int num =(int)(Math.random()*10+1);				// 랜덤 값 설정
		
		while (num!=userN) {							//while 설정
			if(num > userN) {							// if 트루문
				System.out.println("컴퓨터의 숫자가 더 높아요");
			}
			else (num < userN) {
				System.out.println("컴퓨터의 숫자가 더 낮아요");
			}
			count++;									// 횟수 카운터
			break;
			}
		if(num==userN) {								//출력
			System.out.println("정답 : " + count + "회 만에 맞췄습니다.");
		}
	}
}

/** 답변:
*   구조를 생성할 때 정수를 받는 유저값, 랜덤 정수를 생성하는 컴퓨터 값을 변수를 만들어 while 반복문으로 작성
*   문제점: whele 무한 반복문으로 작성 하고 무한 반복문 일때, if 값을 줘서 출력 값으로 만들 수 있게 작성
*   
	