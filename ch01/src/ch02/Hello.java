package ch02;


//class�� Ŭ������ �����ϴ� �����(reversed word)
//public�� �ٸ� ��Ű���� Ŭ������ ���� ��Ű���� Ŭ�������� ��� ���� �����ϰ� �ϴ� �����
//Hello�� ����ڰ� ���� �ĺ���
public class Hello {
	//�޼ҵ� ����
	public static int sum(int m, int n) {
		return m+n;
	}
	//static�� static�̶�� �޸𸮰����� �ε��϶�� �����(����°� �ƴմϴ�.)
	//void�� �޼ҵ��� �������� �������� �ʰڴٴ� �����
	//String[]�� �迭�̶�� �ǹ� StringŸ���� �迭
	//args�� String[]�迭�� �̸�(�ĺ���)
	public static void main(String[] args) {
		int i=20;//����Ÿ�� ������ i(�ĺ���)�� �����ϰ� �ʱⰪ �������ͷ�20�� ����
		int s;//����Ÿ�� ���� s(�ĺ���)�� ����.
		char a;//����Ÿ�� ���� a(�ĺ���)�� ����.
		
		s=sum(i,10);
        a='?';//����a�� �б� ���� �ʱ�ȭ�� ����.
		System.out.println(a);//���ú���(�޼ҵ峻���� ������ ����)�� �ݵ�� �ʱ�ȭ�ؾ� ������ ����.
		System.out.println(s);
		System.out.println("Hello");
	}
}
