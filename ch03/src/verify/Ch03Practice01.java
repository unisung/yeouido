package verify;

import java.util.Scanner;

public class Ch03Practice01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ĺ� �� ���ڸ� �Է��ϼ���>>");
		String s = scanner.next(); // �Է��� ���ڿ��� ����
		char c = s.charAt(0); // ���ڿ��� ù ��° ����
		
		for(char a='a'; a<=c; a++) {
			for(char b=a; b<=c; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		scanner.close();
	}

}
