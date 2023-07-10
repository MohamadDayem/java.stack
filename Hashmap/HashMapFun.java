import java.util.HashMap;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();

        userMap.put("adel","lala");
        userMap.put("enzo","shit");
        userMap.put("amal","lolo");


        System.out.println(userMap.get("adel"));
        System.out.println((userMap.get("enzo")));
        System.out.println(userMap);
    




    }
}