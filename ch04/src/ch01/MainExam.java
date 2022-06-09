package ch01;

public class MainExam {
	public static void main(String[] args) {
	  Animal animal = new Animal();//생성자
	  
	  animal.eat();
	  
	  Human human = new Human();//생성자
	  
	  //부모(Animal)로 부터 상속받은 메소드와 필드
	  human.eat();
	  human.name="길동";
	  human.score=88.0;
	  
	  human.hobby="독서";
	  
	  
	  
    
	}
}
