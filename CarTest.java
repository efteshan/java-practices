// The Question: Create a class Car with: brand, model, price. 
// Initialize values using constructor

class Car{

    private String brand;
    private String model;
    private double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void display(){
        System.out.println(" Brand: "+brand+"  Model: "+model+" Price: "+price);
    }
}

public class CarTest{
    public static void main(String[] args){
        Car c1 = new Car("Toyota", "MK5", 40000);
        Car c2 = new Car("Bugatti", "Chiron", 6000000);
    
    System.out.println("---These Are The Cars Available---");
    c1.display();
    c2.display();
    }
}