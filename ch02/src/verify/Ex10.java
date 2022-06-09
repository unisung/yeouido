package verify;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("커피 주문하세요>>");
		String coffee = scanner.next();
		System.out.print("몇잔을 주문하시나요?>>");
		int count = scanner.nextInt();
		
		switch(coffee) {
		case "에스프레소":
			if (count < 10)
				System.out.println(2000 * count + "원입니다.");
			else {
				System.out.println((int) (2000 * count * 0.95) + "원입니다.");
			}
			break;
		case "아메리카노": System.out.println(2500 * count + "원입니다."); break;
			
		case "카푸치노": System.out.println(3000 * count + "원입니다."); break;
		case "카페라떼": System.out.println(3500 * count + "원입니다."); break;
			default:System.out.println(coffee + "는 없는 메뉴입니다.");
		}
			
		if (coffee.equals("에스프레소")) {
			if (count < 10)
				System.out.println(2000 * count + "원입니다.");
			else {
				System.out.println((int) (2000 * count * 0.95) + "원입니다.");
			}
		} else if (coffee.equals("아메리카노"))
			System.out.println(2500 * count + "원입니다.");
		else if (coffee.equals("카푸치노"))
			System.out.println(3000 * count + "원입니다.");
		else if (coffee.equals("카페라떼"))
			System.out.println(3500 * count + "원입니다.");
		else
			System.out.println(coffee + "는 없는 메뉴입니다.");
		scanner.close();

	}
}
