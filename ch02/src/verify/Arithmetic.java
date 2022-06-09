package verify;

import java.util.Scanner; // Scanner Ŭ������ ����ϱ� ���� import ��
public class Arithmetic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner ��ü ����
		System.out.print("���� �Է��ϼ���>>");
		double op1 = scanner.nextDouble(); // ù ��° �ǿ����� �Է�
		String operator = scanner.next(); // ������ ��Ʈ�� �Է�
		double op2 = scanner.nextDouble(); // �� ��° �ǿ����� �Է�		
		double result = 0;
		switch(operator) {
			case "+" : 	result = op1 + op2; break;
			case "-" : 	result = op1 - op2; break;
			case "*" : 	result = op1 * op2; break;
			case "/" :
				if(op2 == 0) { // ������ ���� 0�̸�
					System.out.println("0���� ���� �� �����ϴ�.");		
					return; //���α׷� ����
				}
				result = op1 / op2;
				break;
			default: System.out.println("���� ��ȣ�� �߸��Ǿ����ϴ�.");
		}
		System.out.println("���� ��� " + result); // ���� ��� ���
	}
}
