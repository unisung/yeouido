package ch02;

public class Dog extends Animal {
	//�޼ҵ� �������̵��� �θ�޼ҵ��� �޼ҵ� �ñ״��İ� ���ƾ���
	void speak() {//signature -�޼ҵ��~�Ű�����Ÿ��/��/����
		System.out.println("�۸�");
	}
	//�����ε��� �޼ҵ� �ñ״��İ� �޶����.
	void speak(String msg) {
		System.out.println(msg+"���� �۸�");
	}
	
}