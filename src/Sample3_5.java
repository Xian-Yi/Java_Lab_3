
public class Sample3_5 {
	public static void main(String[] args) {
		CarC car1;
		car1 = new CarC();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
	}
}

class CarC {
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是" + this.num);
		System.out.println("汽油量是" + this.gas);
	}
	
	void showCarC() {
		System.out.println("開始顯示車子子資料");
		this.show();
	}
}
