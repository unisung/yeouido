package ch02;

public class IntLiteralExample {
	static final double PI=3.141592;
	
	public static void main(String[] args) {
		//변수도 타입을 가지고, 리터럴도 타입을 가짐
		int m=15;//int 리터럴
		int k=015;//8진수 리터럴
		int n = 0x15;//16진수 리터럴
		String s = "0b0101";//2진수 리터럴
		int b = 0b0101;
		//System.out.println(Integer.toBinaryString(b));
		//System.out.println(Integer.toBinaryString(15));
		long l = 24L;// =(연산자)을 기준으로 왼쪽과 오른쪽 타입이 같아야 대입연산 성립.
	
		System.out.println(m);
		System.out.println(k);
		System.out.println(n);
	//	System.out.println(b);
		
		//실수
		float f = .1234f;//double로 인식 ->리터럴 뒤에 f를 붙임 
 		double d = .1234;
 		
		
 		//문자
 	   char c1='글';
 	   char c2 ='\uae00'; //u는 unicode라는 표시
 	   System.out.println(c1);
 	  System.out.println(c2);
 	  
 	  //문자열 리터럴
 	  String str = "Good";//아래처럼 new String("Good")으로 문자열 객체가 생성됨.
 	  String str2 = new String("Good");
 	  
 	 //상수
 	  //final - 상수키워드
 	  //상수는 대문자로 표시 - 일반적
 	 final double PI = 3.141592;
 	  //final로 선언 후 PI에 값 변경시 오류발생
 	 //  PI = 3.14;
 	  
 	 StaticExam s1 = new StaticExam();
 	 StaticExam s2 = new StaticExam();
 	 StaticExam s3 = new StaticExam();
 	 
	}
	
	
}
