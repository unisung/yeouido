package ch02;

public class Test01 {
	//��������global, Ŭ����(�ɹ�)����,
	static int x=10; 
	static int y=20;
	
	public static void main(String[] args) {
		int result1 =sum(10,10);
		System.out.println("result1="+result1);
		sum2(10,10);
	}
	//�Ű����� �ް� ����� ����
	static int sum(int x, int y) {//�����ε�
		return x +y;
	}
	//�Ű����� �ް� ����� �������� �ʴ� �޼ҵ�
	static void sum2(int x, int y) {
		System.out.println("���:"+(x+y));
		return;
	}
    //�Ű������� ���� �ʰ� ����� �����ϴ� �޼ҵ�
	static int sum() {
		return x +y;
	}
	//�Ű������� ���� �ʰ� ����� �������� �ʴ� �޼ҵ�
	static void sum2() {
		System.out.println(x+y);
	}
	
	

}
