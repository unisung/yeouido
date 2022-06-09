package ch02;

import java.util.Scanner;

public class GBBGameApp {

			public static void main(String[] args) {
				Scanner s = new Scanner(System.in); // 키보드 입력을 위한 Scanner 객체 생성 		
				System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
				System.out.print("철수 >> ");
				String a = s.next(); // 철수의 가위, 바위, 보, 문자열을  입력받는다.
				System.out.print("영희 >> ");
				String b = s.next(); // 영희의 가위, 바위, 보, 문자열을 입력받는다.
				

		String result=a.equals(b)?"비김":
			  (a.equals("가위")&&b.equals("보")||a.equals("바위")&&b.equals("가위")||a.equals("보")&&b.equals("바위") 
					  ?"철수가 이김":"영희가 이김");		
	           System.out.println("결과:"+result);
	           
		}
}
