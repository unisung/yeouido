package ch03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DevideByZero2 extends Object{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend; // 나뉨수
		int divisor; // 나눗수

	try {
		System.out.print("나뉨수를 입력하시오:");
		dividend = scanner.nextInt(); // 나뉨수 입력
		System.out.print("나눗수를 입력하시오:");
		divisor = scanner.nextInt(); // 나눗수 입력
		//예외를 회피하기 
		//if(divisor ==0)
		//	System.out.println("0을 입력하지마세요!!!");
		//else
		System.out.println(dividend+"를 " + divisor + "로 나누면 몫은 "
					+ dividend/divisor + "입니다.");
	}catch(InputMismatchException  | ArithmeticException e) {
		System.out.println("에러발생: "+e.toString());
	}catch(Exception e) {
		System.out.println("에러발생: "+e.toString());
	}finally {
		System.out.println("항상 실행");
		scanner.close();
	}
	}

}
