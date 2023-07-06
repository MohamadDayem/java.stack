import java.util.ArrayList;
public class cafatest {
    public static void main(String[] args) {
    
        // Menu items
    items item1 = new items("Mocha" , 3.3);
    items item2 = new items("latte", 5.55);
    items item3 = new items("dripcofee",8.22);
    items item4 = new items("pino",4.22);
        // Order variables -- order1, order2 etc.
    Order order1 = new Order("jimmy", 8.22, true, item1);
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("item: %s\n", order1.item.get(0).name );
        System.out.printf("Ready: %s\n", item1.name);
        System.out.printf("item: %s\n", order1.item);
    }
}

