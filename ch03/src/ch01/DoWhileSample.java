package ch01;

public class DoWhileSample {
	public static void main(String[] args) {
		char a='a';
		
		do {
			   System.out.println(a);
			   //System.out.println(a+1);
			    a=(char)(a+1);//java의 char,byte,short,int는 연산식에서 모두 int타입으로 변환
		}while(a<='z');
	}
}
