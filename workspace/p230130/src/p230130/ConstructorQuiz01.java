package p230130;
class Car{
	
	//멤버 변수
	int door;
	String color;
	
	Car(){
		this(4, "black");
	}
		Car(int door){
			this.door = door;
			this.color = "black";
		}
			Car(String color){
				this.door = 4;
				this.color = color;
			}
				Car(int door, String color){
					this.door = door;
					this.color = color;
				}
	
	//멤버 메서드
	void carInfo() {
		System.out.println("\n문 개수 : " + door + "\n색 : " + color);
	}
}

public class ConstructorQuiz01 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.carInfo();
		Car c2 = new Car(2);
		c2.carInfo();
		Car c3 = new Car("white");
		c3.carInfo();
		Car c4 = new Car(6, "gray");
		c4.carInfo();
	}

}
