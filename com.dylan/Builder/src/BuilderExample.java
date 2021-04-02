/***
 * Demonstrates power of builder design approach.
 *
 * Used for good encapsulation of construction processes.
 * Immutable objects desired due to being safely shared between multiple threads.
 *
 * Not suitable if desire is to have many mutable objects.
 *
 */
public class BuilderExample {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***");
        /*
        Step1: Get builder object
        Step2: Setter like methods used
        Step3: Invoke construct car to get final car
         */
        final Product customCar1 = new CarBuilder().addHeadlights(5)
                .insertWheels(5)
                .buildBody("Plastic")
                .constructCar();
        System.out.println(customCar1);
        System.out.println("____________");
        // Making another custom car
        Builder customBuilder2 = new CarBuilder();
        final Product customCar2 = customBuilder2.insertWheels(20)
                .addHeadlights(4)
                .startUpOperations("This will be a semi")
                .constructCar();
        System.out.println(customCar2);
        System.out.println("___________");
        // Verifying the get car method
        final Product customCar3 = customBuilder2.getConstructedCar();
        System.out.println(customCar3);
    }
}
