package verify;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ch03ChallengeExam {
	
	public static void main(String[] args) {
		int low, high; // ī�忡 ���� ���� ����
		int card; // ī�忡 ���� ��ȣ ��(����� ��, ����)
		Random r = new Random(); // ���� �߻��� ����
		Scanner scanner = new Scanner(System.in); // Ű���� �Է±� ����
		
		// "n"�� �Էµ� ������ �ݺ��Ͽ� ������ �����Ѵ�.
		while(true) {
			int i=0; // ������� ���� Ƚ��
			low = 0; // ī�� ���� �ּ� ����
			high = 99; // ī�� ���� �ִ� ����			
			card = r.nextInt(100);// 0��  99 ������ ���� ����(����� ��) ����
			System.out.println("Up & Down�����Դϴ�. ������ ���� ���߾� ������");
			
			while(true) {
				System.out.println(low +"-" + high); // ���� ���� ���
				System.out.print(i+1+">>"); // ���� Ƚ�� ���
				int n=0;

				try {
					n= scanner.nextInt(); // ���� �Է¹޴´�.
				} 
				catch(InputMismatchException e) { // Ű �Է��� ������ ��ȯ���� ���ϴ� ���� ó�� 
					System.out.println("������ �Է��ϼž� �մϴ�!!");
					scanner.nextLine(); // ������ ��� Ű�� �о ������.
					continue; // �ٽ� �õ��Ѵ�.
				}
				
				if(n>high || n<low) // high�� low�� ������ ��� ���
					System.out.println("������ ������");
				else {// �������� ������ ���� �Էµ� ���
					if(n==card) {
						System.out.println("�¾ҽ��ϴ�.");
						break; // while �� ����
					}
					else if(n>card){ // �Էµ� ���� ���亸�� ���� ������ ���� ��� 
						System.out.println("�� ����");
						high = n;					
					}
					else { // �Էµ� ���� ���亸�� ���� ������ ���� ���
						System.out.println("�� ����");
						low = n;									
					}
				}
				i++; // ���� Ƚ�� ����
			} // end of while
			
			System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
			if(scanner.next().equals("n"))
				break; // while �� ����
		}// end of while
		
		scanner.close();
		
	} // end of main
}
