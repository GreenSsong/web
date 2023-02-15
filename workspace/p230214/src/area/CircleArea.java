/*
 * [package]
 * : 현재 파일의 위치(경로)
 * : 1개 이상의 package는 올 수 없음
 * : 파일의 첫 라인에 와야 함
 */
package area;

public class CircleArea {
	private double rad;
	private final double PI;
		//생성자(constructor)	
	public CircleArea(double r) {
		rad = r;
		PI = 3.14;
	}

	public double getArea() {
		return (rad * rad) * PI;
	}
}

//public class CircleArea {
//	public static void main(String[] args) {
//		Circle c = new Circle(1.5);
//		System.out.println("반지름이 1.5인 원의 넓이 : " + c.getArea());
//	}

