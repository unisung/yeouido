package ch03;

public class TwoDArr3Exam {
	public static void main(String[] args) {
		//�迭 �������� ������
		//���߿� �迭��ü�� �ʱⰪ���� �����Ͽ� �����ϴ� ���
		//���� = new Ÿ��[]{�ʱⰪ};
		int[] myArr=new int[5];
		myArr =new int[] {1,2,3,4,5};
		
		int[][] intArr =new int[2][3];
		//int[][] intArr = {{1,2,3},{4,5,6}};
		//1,2,3,4,5,6 ���� intArr�� �����ϰ�, ���
        //����
		
		//�迭������ ���� ��
		//���߿� ��ü�� �����Ͽ� �����ϴ� ���
		intArr =new int[][] {{1,2,3},{4,5,6}};
		/*intArr[0][0]=1;
		intArr[0][1]=2;
		intArr[0][2]=3;
		intArr[1][0]=4;
		intArr[1][1]=5;
		intArr[1][2]=6;
		*/
		
	   //���
		for(int i=0;i<intArr.length;i++) {
			for(int j=0;j<intArr[i].length;j++) {
				System.out.print(intArr[i][j]);
			}
		  System.out.println();
		}
	}
}
