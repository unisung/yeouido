package ch03;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("����");
	 int score = scanner.nextInt();
		
	 System.out.println("�г�");
	 int year = scanner.nextInt();
	 
	 if(score >= 60) { // 60�� �̻�
			if(year != 4)
				System.out.println("�հ�!"); // 4�г� �ƴϸ� �հ�
			else if(score >= 70)
				System.out.println("�հ�!"); // 4�г��� 70�� �̻��̸� �հ�
		else
			System.out.println("���հ�!"); // 4�г��� 70�� �̸��̸� ���հ�
		}
		else // 60�� �̸� ���հ�
			System.out.println("���հ�!");
	}
}
