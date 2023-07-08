import java.util.ArrayList;
public class Order {
    public String name;
    public double total;
    public boolean ready;
    ArrayList<items> item = new ArrayList<items>();

    public Order(String name,double total,boolean ready, items item ) {
        this.name = name;
        this.total = total;
        this.ready = ready;
        this.item.add(item);
    }

}


