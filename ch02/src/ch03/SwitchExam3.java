package ch03;

import java.util.Scanner;

public class SwitchExam3 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("����ð�:");
          int time = scanner.nextInt();
          
		 switch(time){
		 case 7: System.out.println("���");
		 case 8: System.out.println("���");
		 case 9:System.out.println("ȸ��");
		 case 10:System.out.println("��������");
		 case 11:System.out.println("����");
		 }
		 
	}
}
