package verify;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��ϼ���>>");
		int n = scanner.nextInt();

		int first = n/10; // 10���� ���� ��
		int second = n%10; // 10���� ���� ������
		
		if(first == 0)	first = 1; // 3�� ����� �ƴ� ������ ���� ����
		if(second == 0) second = 1; // 3�� ����� �ƴ� ������ ���� ����
		
		if(first%3 == 0 && second%3 == 0) { // �Ѵ� 3�� ����� ���
			System.out.println("�ڼ�¦¦");
		}
		else if((first%3 == 0 && second%3 != 0) ||
				(first%3 != 0 && second%3 == 0)) { // �� �� �ϳ��� 3�� ����� ���
			System.out.println("�ڼ�¦");			
		}
		else 
			System.out.println("�ڼ�����");
		
		scanner.close();

	}
}
