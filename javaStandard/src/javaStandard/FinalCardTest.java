package javaStandard;

class Cards {
	final int NUMBER; // 상수지만 선어과 함꼐 ㅗㅊ기화 하지않고
	final String KIND; // ㅐㅇ성자에서 단 한번만 초기화할 수 있다.
	static int width = 100;
	static int height = 250;
	
	Cards(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}
	
	Cards() {
		this("HEART",1);
	}
	
	public String toString() {
		return KIND + "" + NUMBER;
	}
}

class FinalCardTest {
	public static void main(String args[]) {
		Cards c = new Cards("HEART", 10);
		//c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // System.out.println(c.toString());
	}
}
