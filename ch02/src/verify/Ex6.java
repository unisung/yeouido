package verify;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
		System.out.print("���� �׼��� �Է��ϼ���>>");
		int money = scanner.nextInt();

		int n50000 = money/50000; // �������� ����
		money = money%50000; // ������
		int n10000 = money/10000; // ������ ����
		money = money%10000; // ������		
		int n1000 = money/1000; // õ���� ����
		money = money%1000; // ������		
		int n500 = money/500; // ����� ���� ����
		money = money%500; // ������		
		int n100 = money/100; // ��� ���� ����
		money = money%100; // ������		
		int n10 = money/10; // �ʿ� ���� ����
		money = money%10; // ������, 1�� ���� ����		

		System.out.print("������"+n50000+"��,");
		System.out.print("����"+n10000+"��,");
		System.out.print("õ��"+n1000+"��,");
		System.out.print("500��"+n500+"��,");
		System.out.print("100��"+n100+"��,");		
		System.out.print("10��"+n10+"��,");		
		System.out.println("1��"+money+"��");		
		scanner.close();
    
	}
}
