package ch03;

public class TwoDArr3Exam {
	public static void main(String[] args) {
		//배열 참조변수 선언후
		//나중에 배열객체를 초기값으로 생성하여 대입하는 경우
		//변수 = new 타입[]{초기값};
		int[] myArr=new int[5];
		myArr =new int[] {1,2,3,4,5};
		
		int[][] intArr =new int[2][3];
		//int[][] intArr = {{1,2,3},{4,5,6}};
		//1,2,3,4,5,6 값을 intArr에 저장하고, 출력
        //저장
		
		//배열변수를 선언 후
		//나중에 객체를 생성하여 대입하는 경우
		intArr =new int[][] {{1,2,3},{4,5,6}};
		/*intArr[0][0]=1;
		intArr[0][1]=2;
		intArr[0][2]=3;
		intArr[1][0]=4;
		intArr[1][1]=5;
		intArr[1][2]=6;
		*/
		
	   //출력
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				System.out.print(intArr[i][j]);
			}
		  System.out.println();
		}
	}
}
