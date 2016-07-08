public class TestClass {
	public static void main(String[] args) {
		AnRun(new Cat());
	}
	
	public static void AnRun(Animal an) {
		an.run();
	}
}

class Animal {
	
	public void run(){
		System.out.println("动物在跑");
	}
}

class Cat extends Animal {
	
	public void run() {
		System.out.println("猫在跑");
	}
}

class Dog extends Animal {
	
	public void run() {
		System.out.println("狗在跑");
	}
}