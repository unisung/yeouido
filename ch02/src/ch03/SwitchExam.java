package ch03;

public class SwitchExam {

	public static void main(String[] args) {
		
		char grade='A';
		switch(grade) {
		case 'A':
			System.out.println("�����մϴ�.");
			System.out.println("���߽��ϴ�.");
			break;//switch���� ���������� ����
		case 'B':
			System.out.println("���ƿ�.");
			break;
		case 'C':
			System.out.println("����ϼ���.");
			break;
		default:
			System.out.println("Ż���Դϴ�!");
		}
	}

}
