package ch02;

public class IntLiteralExample {
	static final double PI=3.141592;
	
	public static void main(String[] args) {
		//������ Ÿ���� ������, ���ͷ��� Ÿ���� ����
		int m=15;//int ���ͷ�
		int k=015;//8���� ���ͷ�
		int n = 0x15;//16���� ���ͷ�
		String s = "0b0101";//2���� ���ͷ�
		int b = 0b0101;
		//System.out.println(Integer.toBinaryString(b));
		//System.out.println(Integer.toBinaryString(15));
		long l = 24L;// =(������)�� �������� ���ʰ� ������ Ÿ���� ���ƾ� ���Կ��� ����.
	
		System.out.println(m);
		System.out.println(k);
		System.out.println(n);
	//	System.out.println(b);
		
		//�Ǽ�
		float f = .1234f;//double�� �ν� ->���ͷ� �ڿ� f�� ���� 
 		double d = .1234;
 		
		
 		//����
 	   char c1='��';
 	   char c2 ='\uae00'; //u�� unicode��� ǥ��
 	   System.out.println(c1);
 	  System.out.println(c2);
 	  
 	  //���ڿ� ���ͷ�
 	  String str = "Good";//�Ʒ�ó�� new String("Good")���� ���ڿ� ��ü�� ������.
 	  String str2 = new String("Good");
 	  
 	 //���
 	  //final - ���Ű����
 	  //����� �빮�ڷ� ǥ�� - �Ϲ���
 	 final double PI = 3.141592;
 	  //final�� ���� �� PI�� �� ����� �����߻�
 	 //  PI = 3.14;
 	  
 	 StaticExam s1 = new StaticExam();
 	 StaticExam s2 = new StaticExam();
 	 StaticExam s3 = new StaticExam();
 	 
	}
	
	
}
