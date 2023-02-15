class Fruit{
	String sort;
	int count;
	
	Fruit(String sort, int count){
		this.sort = sort;
		this.count = count;
	}
	//멤버 메서드
	void fruitInfo() {
		System.out.println(this.sort + " 가 " + this.count + "개 있습니다.");
	}
}
public class ArrayInstanceEx01 {

	public static void main(String[] args) {
		/** 길이가 3인 객체 배열 생성 
		 * @
		 */
		
		Fruit[]fruit = new Fruit[3];
		fruit[0] = new Fruit("사과", 5);
		fruit[1] = new Fruit("오렌지", 7);
		fruit[2] = new Fruit("포도", 4);
		
		
//		for(int i=0; i<fruit.length; i++)
			//멤버 메서드 호출
			//향상된 for문
		for(Fruit f : fruit ) {
			f.fruitInfo();
		}
	}

}
