
public class Sample3_13 {

	public static void main(String[] args) {
		CarK car1;
		car1 = new CarK();
		car1.show();
		
		CarK car2;
		car2 = new CarK(1234, 25.0);
		car2.show();
	}
}

class CarK
{
	private int num;
	private double gas;
	
	public CarK() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public CarK(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為" + num + "，汽油量為" + gas + "的車子");
	}
	
	public void show() {
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}