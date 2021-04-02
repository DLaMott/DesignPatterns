public class SingletonExample {
    public static void main(String[] args) {
        System.out.println("Singleton example");
        System.out.println("Trying to make a captain");

        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying to make another captain");

        Captain captain2 = Captain.getCaptain();
        if (captain1 == captain2) {
            System.out.println("cap1 and cap2 are the same instance");
        }
    }
}
