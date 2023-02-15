import area.CircleArea;
import per.CirclePerimeter;

public class Circle {

	public static void main(String[] args) {

		CircleArea ca = new CircleArea(1.5);
		System.out.println("원의 넓이 " + ca.getArea());
		
		CirclePerimeter cp = new CirclePerimeter(2);
		System.out.println("원 둘레" + cp.getPerimeter());
		
		
	}

}
