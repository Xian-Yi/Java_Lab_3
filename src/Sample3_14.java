
public class Sample3_14 {

	public static void main(String[] args) {
		CarL car1;
		car1 = new CarL();
		car1.show();
		
		CarL car2;
		car2 = new CarL(1234, 25.0);
		car2.show();

	}

}

class CarL
{
	private int num;
	private double gas;
	
	public CarL() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public CarL(int n, double g) {
		this();
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
	}
	
	public void show() {
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}
