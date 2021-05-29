import java.util.Scanner;

public class SimpleFactory {

    public Animal createAnimal(){

        Animal intendedAnimal =null;
        System.out.println("Enter an animal choice ( 0 for dog, 1 for tiger)");
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int choice = Integer.parseInt(input.nextLine());
        System.out.println("You entered:" + choice);
        switch (choice){
            case 0:
                intendedAnimal = new Dog();
                break;
            case 1:
                intendedAnimal = new Tiger();
                break;
            default:
                System.out.println("Input must be 0 or 1");
                throw new IllegalArgumentException("Your choice tries to create a new unknown animal");
        }
        return intendedAnimal;
    }
}
