package verify;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
		String coffee = scanner.next();
		System.out.print("������ �ֹ��Ͻó���?>>");
		int count = scanner.nextInt();
		
		switch(coffee) {
		case "����������":
			if (count < 10)
				System.out.println(2000 * count + "���Դϴ�.");
			else {
				System.out.println((int) (2000 * count * 0.95) + "���Դϴ�.");
			}
			break;
		case "�Ƹ޸�ī��": System.out.println(2500 * count + "���Դϴ�."); break;
			
		case "īǪġ��": System.out.println(3000 * count + "���Դϴ�."); break;
		case "ī���": System.out.println(3500 * count + "���Դϴ�."); break;
			default:System.out.println(coffee + "�� ���� �޴��Դϴ�.");
		}
			
		if (coffee.equals("����������")) {
			if (count < 10)
				System.out.println(2000 * count + "���Դϴ�.");
			else {
				System.out.println((int) (2000 * count * 0.95) + "���Դϴ�.");
			}
		} else if (coffee.equals("�Ƹ޸�ī��"))
			System.out.println(2500 * count + "���Դϴ�.");
		else if (coffee.equals("īǪġ��"))
			System.out.println(3000 * count + "���Դϴ�.");
		else if (coffee.equals("ī���"))
			System.out.println(3500 * count + "���Դϴ�.");
		else
			System.out.println(coffee + "�� ���� �޴��Դϴ�.");
		scanner.close();

	}
}
