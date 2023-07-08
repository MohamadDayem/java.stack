
import java.util.Date;

public class AlfredQuotes {


public String baiscGreeting() {
    return "hello,lovely to see you";

}
public String guestGreeting(String name, String dayPeriod) {
    return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String dateAnnouncement() {
        return String.format("It is currently %s", new Date());
    }


}

