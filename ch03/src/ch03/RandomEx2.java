package ch03;

import java.util.Random;

public class RandomEx2 {
	public static void main(String[] args) {
		//seed���� ����
	 Random r = new Random();
	 System.out.println(r.nextInt());//0<= ~ <10
	 
	 //seed�� ������ ����
	 Random k = new Random(9);
	 System.out.println(k.nextInt());
	 
	 Random m = new Random(10);
	 System.out.println(m.nextInt());

	}

}
