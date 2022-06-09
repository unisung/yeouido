package ch02;

public class MyCalc {
	//실행시 10 + 20 => ["10"]["+"]["20"]
	public static void main(String ...args ) {//String[] args는 길이가 없는 String배열
		int a=Integer.parseInt(args[0]);
		String op = args[1];
		int b=Integer.parseInt(args[2]);

		switch (op) {
		case "+": System.out.println(a+b); break; 
		case "-": System.out.println(a-b); break;
		}
	}
}
