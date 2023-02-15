package p230130;

public class InstanceEx05_1 {

	public static Robot constructRobot() {
		
		//메서드 정의
		
		//객체 생성 (robot =지역 변수)
		Robot robot = new Robot();
		robot.setProductYear(2000);
		robot.setProductName("옵티머스");
		return robot; //return (클래스)는 main으로 클래스에 주소가 삽입
	}	//객체에 참조 변수로 return 될 수 있다
	
	
	public static void main(String[] args) {

//main 메서드 정의
		Robot robot = constructRobot();
		System.out.println("생산년도 " + robot.getProductYear());
		System.out.println("로봇 제품명 " + robot.getProductName());
		
		// 자료형 @ 주소(16진수)
		Robot robot2 = constructRobot();
		System.out.println("같은 robot ?? " + (robot == robot2));
		System.out.println("참조 변수 robot1에 저장된 주소" + robot);
		System.out.println("참조 변수 robot2에 저장된 주소" + robot2);
	}

}
