
public class Sample3_12 {

	public static void main(String[] args) {
		CarJ car1;
		car1 = new CarJ();
		
		car1.show();

	}

}

class CarJ
{
	private int num;
	private double gas;
	
	public CarJ() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void show() {
		System.out.println("車號是" + num);
		System.out.print("汽油量是" + gas);
	}
}
