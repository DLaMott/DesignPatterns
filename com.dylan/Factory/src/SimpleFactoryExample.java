/***
 * Used for creating objects without exposing instantiation logic to the client.
 * Uses a method that can return with varying prototypes.
 */
public class SimpleFactoryExample {

    public static void  main(String[] args){
        Animal prefType = null;
        SimpleFactory simpleFactory = new SimpleFactory();
        prefType = simpleFactory.createAnimal();
        prefType.speak();
        prefType.preferredAction();
    }
}
