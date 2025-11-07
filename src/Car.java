public class Car {
    String model;
    int year;
    double price;

    public Car(){
        System.out.println("Default");
    }
    public Car(String model){
        this.model = model;
    }

    public Car(String model,int year){
        this.model=model;
        this.year=year;
    }
    public Car(String model, int year, double price){
        this.model=model;
        this.price=price;
        this.year=year;
    }
    public void printCarInfo(){
        System.out.println("Model:" + " " + model + " " + "Year:" + " " + year + " " +
                            "Price:" + " " + price);

    }


}