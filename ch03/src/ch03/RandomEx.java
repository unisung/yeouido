package ch03;

public class RandomEx {
	public static void main(String[] args) {
		// 0.0<= radom()�޼ҵ��� ���� < 1.0; 
	 System.out.println(Math.random());
	   //1~5������ ������ ���
	      int num=  (int)(Math.random()*10)+1;// 1<= ~ <11
	      System.out.println(num);
	      
	      System.out.print((int)(Math.random()*3));//0,1,2
	}

}
