package ch01;

import java.util.Scanner;

public class WhileSample {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int count=0, n=0; 
	float sum=0f; 

	System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");
	while((n = scanner.nextInt()) != 0) { // 0�� �ԷµǸ� while �� ���
		sum = sum + n;
		count++;
	}
	System.out.print("���� ������ " + count + "���̸� ");
	System.out.println("����� " + sum/count + "�Դϴ�.");

	scanner.close();
	}
}
