package ch03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DevideByZero2 extends Object{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend; // ������
		int divisor; // ������

	try {
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
	}catch(InputMismatchException  | ArithmeticException e) {
		System.out.println("�����߻�: "+e.toString());
	}catch(Exception e) {
		System.out.println("�����߻�: "+e.toString());
	}finally {
		System.out.println("�׻� ����");
		scanner.close();
	}
	}

}
