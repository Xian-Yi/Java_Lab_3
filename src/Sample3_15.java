
public class Sample3_15 {

	public static void main(String[] args) {
		CarM.showSum();
		
		CarM car1 = new CarM();
		car1.setCar(1234, 20.5);
		
		CarM.showSum();
		
		CarM car2 = new CarM();
		car2.setCar(4567, 30.5);;
	}
}

class CarM
{
	public static int sum = 0;
	private int num;
	private double gas;
	
	public CarM() {
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	public static void showSum() {
		System.out.println("車子總共有" + sum + "台");
	}
	
	public void show() {
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}
