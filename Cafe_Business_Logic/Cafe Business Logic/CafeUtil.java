import java.util.ArrayList;
import java.io.*;
public class CafeUtil {
private ArrayList<String> customers = new ArrayList<String>();
public int getStreakGoal() { 
    int goal = 0 ;
    for ( int i = 1 ; i <= 10 ; i++  ) {
        goal += i; 
    }
    return goal;
}
public double getOrderTotal(double[] prices) {
    double total = 0;
    for (int i=0; i < prices.length; i++) {
        total = total + prices[i];
    }
    return total;
}
public void displayMenu(ArrayList<String> menuItems) {
    for (int i = 0 ; i < menuItems.size(); i++ ){
        String item = menuItems.get(i);
        System.out.println(item);
    }
}
public void addCustomer(){
    System.out.println("Please enter your name");
    String username = System.console().readLine();
    System.out.println("Hello " + username);
    int peopleAhead = customers.size();
    System.out.println("there are " + peopleAhead + " people in front of you");
    customers.add(username);
    for (int i = 0 ; i < customers.size(); i++){
    System.out.print(customers.get(i) + ", "); 
    }
}
}
