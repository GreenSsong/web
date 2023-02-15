class ArrayStack{
	int top= -1;								// 최대량 초기값 설정
	int[] arr;									//arr 스택 설정
	final int max = 5;
	public ArrayStack(int[] size);{				
		this.size = size;
		
		
	public void setArr(int[] arr) {				
		this.arr = arr;
		System.out.println(arr);
	}
	public void push(String item) {
		ArrayStack number = new ArrayStack(arr);
		number.item = item;
		number.link = top;
		top = number;
	}
	public void pop() {
		if(isEmpty()) {
				System.out.println("스택이 비어 있음");
				reu
		}
	}
	public showInfo
	private int seaich(int item) {
		}
		return -1;
	}
	private boolean empty() {
		return size == 0;
	}
	private boolean contains(int item) {
		for(int x : arr) {
			if(x == item) return true;
		}
		return false;
	}
}
public class Quiz03 {

	public static void main(String[] args) {
		
		ArrayStack stack = new ArrayStack(5);
		
		stack.push(20);
		stack.push(15);
		stack.push(10);
		stack.push(55);
		stack.push(8);
		stack.push(5);
		while(!stack1.isEmpty()) {
			ArrayStack date = stack1.pop();
			
		}
		stack.setarr(5);
		
		
		
		stack.pop();
		
		System.out.println("\ntop에 있는 아이템 출력 : " + stack1.peek());
		
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
		System.out.println("pop 실행 : " + stack.pop());
	}

}

// 답변 : 스택을 설정 해서 넣고 빼는 설정을 하려는 것을 만들려고 함.
// 스택 구조가 어려웠음.
