package ch03;

import java.util.Scanner;

public class DevideByZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend; // ������
		int divisor; // ������

		System.out.print("�������� �Է��Ͻÿ�:");
		dividend = scanner.nextInt(); // ������ �Է�
		System.out.print("�������� �Է��Ͻÿ�:");
		divisor = scanner.nextInt(); // ������ �Է�
		//���ܸ� ȸ���ϱ� 
		//if(divisor ==0)
		//	System.out.println("0�� �Է�����������!!!");
		//else
		System.out.println(dividend+"�� " + divisor + "�� ������ ���� "
					+ dividend/divisor + "�Դϴ�.");

	}

}
