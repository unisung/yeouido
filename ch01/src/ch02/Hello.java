package ch02;


//class는 클래스를 선언하는 예약어(reversed word)
//public은 다른 패키지의 클래스나 같은 패키지의 클래스에서 모두 접근 가능하게 하는 예약어
//Hello는 사용자가 만든 식별자
public class Hello {
	//메소드 선언
	public static int sum(int m, int n) {
		return m+n;
	}
	//static은 static이라는 메모리공간에 로딩하라는 예약어(만드는게 아닙니다.)
	//void는 메소드의 실행결과를 리턴하지 않겠다는 예약어
	//String[]는 배열이라는 의미 String타입의 배열
	//args는 String[]배열의 이름(식별자)
	public static void main(String[] args) {
		int i=20;//정수타입 변수명 i(식별자)를 선언하고 초기값 정수리터럴20을 대입
		int s;//정수타입 변수 s(식별자)를 선언.
		char a;//문자타입 변수 a(식별자)를 선언.
		
		s=sum(i,10);
        a='?';//변수a를 읽기 전에 초기화를 했음.
		System.out.println(a);//로컬변수(메소드내에서 선언한 변수)는 반드시 초기화해야 읽을수 있음.
		System.out.println(s);
		System.out.println("Hello");
	}
}
