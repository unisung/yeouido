package ch02;

public class ArrayExam {
	public static void main(String[] args) {
	//���� ����� ���ÿ� �迭��ü �����Ͽ� �ʱ�ȭ
		int intArr[]=new int[5];
	    intArr[1] = 10;
	    intArr[1] = 20;
	    
	//�迭 ���� ���ú��� ����
	int intArr2[];
	//�迭��ü �����Ͽ� ���ú����� ����(�ʱ�ȭ)
	intArr2=new int[5];
	
	
	//�迭�� Ÿ���� �ʱⰪ���� �迭�� �� ��ҵ��� �ʱ�ȭ.
	for(int i=0;i<5;i++)
		System.out.println(intArr[i]);
	
	
	double doubleArr[] = new double[5];
	doubleArr[3]=5.5;
	doubleArr[3]=9.9;
	for(int i=0;i<5;i++)
		System.out.println(doubleArr[i]);
	//�迭�� ����ҵ��� ����� �迭Ÿ���� �⺻������ �ʱ�ȭ��.
	boolean boolArr[] =new boolean[5];
	boolArr[0]=true;
	boolArr[0]=false;
	for(int i=0;i<5;i++)
		System.out.println(boolArr[i]);
	
	
	String[] strArr = new String[5];
	strArr[2] = "hello";
	strArr[2] = "hi";
	strArr[2] = null;
	for(int i=0;i<5;i++)
		System.out.println(strArr[i]);
	
	
	
	
	
	

	}

}
