package ch02;

public class ArrayMinMaxExam {
	public static void main(String[] args) {
		int[] intarr = {60, 35, 20, 70,55, 100};
		int max=20;
		//�ִ밪 ã��
		for(int i=0;i<intarr.length;i++) {
			if(max<intarr[i]) {
				max=intarr[i];
			}
		}
		System.out.println("max="+max);
		
		//�ּҰ� ã��
		int min=100;
		for(int i=0;i<intarr.length;i++) {
			if(min > intarr[i]) {
				min=intarr[i];
			}
		}
		System.out.println("min="+min);
	}
}
