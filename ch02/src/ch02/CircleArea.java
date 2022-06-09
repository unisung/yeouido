package ch02;

public class CircleArea {
	public static void main(String[] args) {
	final double PI = 3.14;//실수 리터럴
	double radius = 10.2;//실수 리터럴
	double circleArea = radius*radius*PI;
	
	System.out.print("반지름:"+radius);//출력후 같은 줄에 머무르기
	System.out.println("원의 면적:"+circleArea);//출력 후 다음줄로 내려가기

	 System.out.println(Integer.toBinaryString(227));
	 
	 System.out.println(3.14*10.0);
	 
	 System.out.printf("%.5f",3.14*10);//printf("포멧",값);
	 
	 
	}
}
