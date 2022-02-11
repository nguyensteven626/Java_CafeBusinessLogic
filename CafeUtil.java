import java.util.ArrayList;

public class CafeUtil {
    
    // get streak goal
    // sum every int 1-10 and return sum
    public int getStreakGoal() {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // The sales reps have a competetive rewards system in place.
    // They must increase their leads to 1 more than the day before each day
    // Or net the same amount at the end of 10 days.
    public int leadsAtDay10() {
        int sum = 0;
        for(int day = 1; day <= 10; day++) {
            sum+= day;
        }
        return sum;
    }

    // Display Coffee Menu
    public void displayMenu(ArrayList<String> menuItems) {
        // Given an array of menu item names (strings), iterate through 
        // the array and print all the menu items in the array
        for (String item: menuItems) {
            System.out.println(item);
        }
    }

    public double getOrderTotal(double[] orderPrices) {
        double sum = 0;
        
        for (double price: orderPrices) {
            sum+= price;
        }
        return sum;

    }

    // Add customer
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        System.out.println("There are " + customers.size() + " people before you.");
        customers.add(userName);
    }
}