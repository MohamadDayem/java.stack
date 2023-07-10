import java.util.HashMap;

public class Map {
   HashMap<String, String> userMap = new HashMap<String, String>();

   public Map(String sName, String sLyric){
      userMap.put(sName, sLyric);
   }
   public void display(String i){
      System.out.println(userMap.get(i));
   }


}
