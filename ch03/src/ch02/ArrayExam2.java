package ch02;

public class ArrayExam2 {

	public static void main(String[] args) {
		
		//초기값으로 배열 생성하여 초기화
		int[] intArr= {10,20,30,40};
		//속성값 length는 배열 생성시 값이 주어짐
		//수정불가
		//intArr.length=50;
		System.out.println(intArr.length);
		
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]);
		}
		
		double[] doubleArr= {0.02,0.03,0.05,0.07};
		System.out.println(doubleArr.length);
		for(int i=0;i<doubleArr.length;i++) {
			System.out.println(doubleArr[i]);
		}
		
		String[] greets = {"hello","hi","bye",null};
		for(int i=0;i<greets.length;i++)
			System.out.println(greets[i]);
		
		
		int[] intarr;
		intarr = new int[3];
		
		intarr[2]=8;
	}
}
