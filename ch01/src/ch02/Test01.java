package ch02;

public class Test01 {
	//전역변수global, 클래스(맴버)변수,
	static int x=10; 
	static int y=20;
	
	public static void main(String[] args) {
		int result1 =sum(10,10);
		System.out.println("result1="+result1);
		sum2(10,10);
	}
	//매개변수 받고 결과를 리턴
	static int sum(int x, int y) {//오버로딩
		return x +y;
	}
	//매개변수 받고 결과를 리턴하지 않는 메소드
	static void sum2(int x, int y) {
		System.out.println("결과:"+(x+y));
		return;
	}
    //매개변수를 받지 않고 결과를 리턴하는 메소드
	static int sum() {
		return x +y;
	}
	//매개변수를 받지 않고 결과도 리턴하지 않는 메소드
	static void sum2() {
		System.out.println(x+y);
	}
	
	

}
