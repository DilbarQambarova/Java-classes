public class Carinfo {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.printCarInfo();

        Car car2 = new Car("Mercedes");
        car2.printCarInfo();

        Car car3 = new Car("BMW", 2020);
        car3.printCarInfo();

        Car car4 = new Car("Toyota", 2020, 34000 );
        car4.printCarInfo();

    }
}

