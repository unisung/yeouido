package ch01;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료");
		
		System.out.println("exit".hashCode()+"-");
		System.out.println(System.identityHashCode("exit"));
		
		System.out.println("new-"+"exit".hashCode()+"-");
		System.out.println(System.identityHashCode("exit"));
		
		String a ="exit"+"a";
		String b="exit";
		String st=new String("exit");
		String st2=new String("exit");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(st.hashCode());
		System.out.println(st2.hashCode());
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(st));
		System.out.println(System.identityHashCode(st2));
		
		
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			System.out.print(text);
			System.out.print(text.hashCode()+"-");
			System.out.println(System.identityHashCode(text));
			
			if(text.equals("exit")) 	break; // while 문을 벗어남
			
			
		}
      
		System.out.println("종료");
		scanner.close();
			
		}

}
