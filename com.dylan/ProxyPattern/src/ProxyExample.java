
/***
 * Provides a surrogate or placeholder for another object to control access to it.
 * Generally work on the same interfaces.
 */

public class ProxyExample {

    public static void main(String[] args) {
        System.out.println("***PROXY DEMO***");
        // Actual authorized as defined in Proxy
        Proxy p1 = new Proxy("Admin");
        p1.doSomeWork();
        // Not authorized in Proxy
        Proxy p2 = new Proxy("Someone");
        p2.doSomeWork();
    }
}