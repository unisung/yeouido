package ch03;

public class IfExam01 {

	public static void main(String[] args) {
		int n=5;
		
		//if(����){��ɹ�;} <- ������ ���̸� ��ɹ� ����, �����̸� skip
		if(n%2==0) {
			System.out.println(n);
			System.out.println("¦��");
		}

		int score=80;
		if(score>=80 && score <=89) {
			System.out.println("B");
		}
		
		if(score>=90) {
			System.out.println("�հ�");
		}else {//score < 90
			System.out.println("���հ�");
		}
		
		
		System.out.println("����");
	}
}
