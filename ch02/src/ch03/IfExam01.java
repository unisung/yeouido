package ch03;

public class IfExam01 {

	public static void main(String[] args) {
		int n=5;
		
		//if(조건){명령문;} <- 조건이 참이면 명령문 실행, 거짓이면 skip
		if(n%2==0) {
			System.out.println(n);
			System.out.println("짝수");
		}

		int score=80;
		if(score>=80 && score <=89) {
			System.out.println("B");
		}
		
		if(score>=90) {
			System.out.println("합격");
		}else {//score < 90
			System.out.println("불합격");
		}
		
		
		System.out.println("종료");
	}
}
