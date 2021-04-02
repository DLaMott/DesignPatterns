import java.util.ArrayList;
import java.util.List;

class Proxy extends Subject {

    static Subject cs;
    String currentUser;
    // Could be created in  one line
    List<String> registeredUsers;

    public Proxy (String currentUser){

        // Adds authorized users to registered list
        registeredUsers = new ArrayList<String>();
        registeredUsers.add("Admin");
        registeredUsers.add("Rohit");
        registeredUsers.add("Sam");
        this.currentUser = currentUser;
    }


    @Override
    public void doSomeWork() {
        System.out.println("\n Proxy Call happening now...");
        System.out.println(currentUser + "Wants to invoke a proxy method.");

        if(registeredUsers.contains(currentUser)){
            // Won't instantiate until method is called
            if (cs == null){
                cs = new ConcreteSubject();
            }
            cs.doSomeWork();
        }else {
            System.out.println("Sorry " + currentUser + "You do not have access.");
        }

    }
}