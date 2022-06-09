package ch03;

import java.util.Scanner;

public class SwitchExam3 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("현재시각:");
          int time = scanner.nextInt();
          
		 switch(time){
		 case 7: System.out.println("기상");
		 case 8: System.out.println("출근");
		 case 9:System.out.println("회의");
		 case 10:System.out.println("오전업무");
		 case 11:System.out.println("출장");
		 }
		 
	}
}
