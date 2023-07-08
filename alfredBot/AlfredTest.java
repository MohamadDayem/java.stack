public class AlfredTest {
    

    public static void main(String[] args) {
        
        AlfredQuotes alfa = new  AlfredQuotes();


        String testgreeting =alfa.baiscGreeting();
        String testGusestGreeString = alfa. guestGreeting("beth" ,"beth");
        String testDateAnnouncement=alfa.dateAnnouncement();

        System.out.println( testgreeting);
        System.out.println(testGusestGreeString);
        System.out.println(testDateAnnouncement);
    }        
    }

