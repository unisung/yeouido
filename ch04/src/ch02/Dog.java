package ch02;

public class Dog extends Animal {
	//메소드 오버라이딩은 부모메소드의 메소드 시그니쳐가 같아야함
	void speak() {//signature -메소드명~매개변수타입/수/순서
		System.out.println("멍멍");
	}
	//오버로딩은 메소드 시그니쳐가 달라야함.
	void speak(String msg) {
		System.out.println(msg+"나도 멍멍");
	}
	
}