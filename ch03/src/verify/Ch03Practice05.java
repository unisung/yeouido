package verify;

import java.util.Scanner;

public class Ch03Practice05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n[] = new int [10];
		
		System.out.print("���� 10�� �Է�>>");
		for(int i=0; i<n.length; i++) {
			n[i] = scanner.nextInt(); // ���� �б�			
		}
		
		// ���� ����
		for(int i=0; i<n.length; i++) { 
			for(int j=i; j<n.length; j++) { // ���� ����
				if(n[i] > n[j]) {// ���� �б�
					int tmp = n[i];
					n[i] = n[j];
					n[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i] + " ");			
		}		
		scanner.close();		
	}

}
