
public class Sample3_4_1 {
	public static void main(String[] args) {
		CarB car1;
		car1 = new CarB();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
	}
}

class CarB {
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}
