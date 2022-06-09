package ch03;

public class SwitchExam2 {

	public static void main(String[] args) {
		int b=3;
		switch(b%2) {
		case 0: System.out.println("Â¦¼ö"); break;
		case 1:System.out.println("È¦¼ö");
		}
		
		char op='+';
		switch(op) {
		case '+': System.out.println(1+1);break;
		case '-':System.out.println(1-1);
		}
		
		//since jdk1.7
		String msg="¿¹";
		switch(msg) {
		case "¿¹":System.out.println("yes");break;
		case "¾Æ´Ï¿À":System.out.println("no");
		}
		
	}
}
