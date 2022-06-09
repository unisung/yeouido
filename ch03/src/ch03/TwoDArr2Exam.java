package ch03;

public class TwoDArr2Exam {
	public static void main(String[] args) {
		//[][][]
		//[][][]
		//[][][]
		int[][] arr1 = {{1,2,3},
				          {4,5,6},
				          {7,8,9}};
		System.out.println(arr1.length);
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {//안쪽 for문의 배열의 길이는 각행의 배열의 길이만큼 표시
				System.out.print(arr1[i][j]+" \t");
			}
			System.out.println();
		}
		
		double[][] dArr = {{0.001, 0.002},
				                {0.003, 0.004}};
		System.out.println(dArr.length);
		
		System.out.println(dArr[0]);
		
		char[][] cArr = {{'a','b'},{'c','d'},{'e','f'}};
		System.out.println(cArr.length);
		
		
		
	}

}
