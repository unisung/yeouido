package verify;
import java.util.Scanner;

public class Ch03Practive06 {
	public static void main(String[] args) {
		String eng[] = { "student", "love", "java", "happy", "future" };
		String kor[] = { "�л�", "���", "�ڹ�", "�ູ��", "�̷�" };
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("���� �ܾ �Է��ϼ���>>");			
			String s = scanner.nextLine(); // ���ڿ� �б�
			if(s.equals("exit")) 
				break; // while �� ���. ���α׷� ����

			int i;
			for(i=0; i<eng.length; i++) {
				if(eng[i].equals(s)) {
					System.out.println(kor[i]);
					break;
				}
			}
			if(i==eng.length) // ���������� �˻��Ͽ��ٸ�
				System.out.println("�׷� ���� �ܾ �����ϴ�.");
		}
		System.out.println("�����մϴ�...");
		scanner.close();
	}
}
