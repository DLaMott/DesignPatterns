/**
 * Serves as example for Singleton Design approach
 * Ensures a class only has one instance and provides a global access point.
 * Helps to eliminate unnecessary object creation.
 * Utilize to implement a centralized management system.
 */

final class Captain {

    private static Captain captain;

    // Private preventing use of new
    private Captain() {
    }

    // Attempt to create thread safety by locking use to one thread at a time
    public static synchronized Captain getCaptain() {

        // Thread safety achieved by restricting object creation
        if (captain == null) {
            captain = new Captain();
            System.out.println("New captain selected");
        } else {
            System.out.println("You already have a captain");
        }
        return captain;
    }
}
