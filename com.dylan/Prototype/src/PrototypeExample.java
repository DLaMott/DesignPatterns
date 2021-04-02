public class PrototypeExample {
    public static void main(String[] args) throws CloneNotSupportedException{
            System.out.println("Prototype demo");

            BasicCar nano = new Nano("nano yellow");
            nano.basePrice=100000;

            BasicCar ford = new Ford("Ford black");
            ford.basePrice= 500000;

            BasicCar bc1;
            //Nano
            bc1 = nano.clone();
            bc1.onRoadPrice = nano.basePrice + BasicCar.setAdditionalPrice();
        System.out.println("Car is: " + bc1.modelName + "and the price is: " + bc1.onRoadPrice);
            //Ford
            bc1 = ford.clone();
        bc1.onRoadPrice = ford.basePrice + BasicCar.setAdditionalPrice();
        System.out.println("Car is: " + bc1.modelName + "and the price is: " + bc1.onRoadPrice);
    }
}

