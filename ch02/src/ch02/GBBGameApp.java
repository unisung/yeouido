package ch02;

import java.util.Scanner;

public class GBBGameApp {

			public static void main(String[] args) {
				Scanner s = new Scanner(System.in); // Ű���� �Է��� ���� Scanner ��ü ���� 		
				System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
				System.out.print("ö�� >> ");
				String a = s.next(); // ö���� ����, ����, ��, ���ڿ���  �Է¹޴´�.
				System.out.print("���� >> ");
				String b = s.next(); // ������ ����, ����, ��, ���ڿ��� �Է¹޴´�.
				

		String result=a.equals(b)?"���":
			  (a.equals("����")&&b.equals("��")||a.equals("����")&&b.equals("����")||a.equals("��")&&b.equals("����") 
					  ?"ö���� �̱�":"���� �̱�");		
	           System.out.println("���:"+result);
	           
		}
}
