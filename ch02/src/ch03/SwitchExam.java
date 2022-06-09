package ch03;

public class SwitchExam {

	public static void main(String[] args) {
		
		char grade='A';
		switch(grade) {
		case 'A':
			System.out.println("축하합니다.");
			System.out.println("잘했습니다.");
			break;//switch블럭을 빠져나가는 역할
		case 'B':
			System.out.println("좋아요.");
			break;
		case 'C':
			System.out.println("노력하세요.");
			break;
		default:
			System.out.println("탈락입니다!");
		}
	}

}
