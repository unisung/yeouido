package ch01;

public class DoWhileSample {
	public static void main(String[] args) {
		char a='a';
		
		do {
			   System.out.println(a);
			   //System.out.println(a+1);
			    a=(char)(a+1);//java�� char,byte,short,int�� ����Ŀ��� ��� intŸ������ ��ȯ
		}while(a<='z');
	}
}
