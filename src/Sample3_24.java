public class Sample3_24 {

    public static void main(String[] args) {
        CarP[] car1 = new CarP[3];
        
        for (int i = 0; i < car1.length; i++) {
            car1[i] = new CarP();
        }
        
        car1[0].setCar(1234, 20.5);
        car1[1].setCar(2345, 30.5);
        car1[2].setCar(3456, 40.5);
        
        for (CarP car : car1) {
            car.show();
        }
    }
}

class CarP {
    private int num;
    private double gas;
    
    public CarP() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
    
    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + num + "，汽油量設為" + gas);
    }
    
    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}
