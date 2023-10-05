import java.util.HashMap;

public class Itenarary_Path {
    public static String getStarted(HashMap<String, String> tickets){
        HashMap<String, String> revmap = new HashMap<>();
        for (String key : tickets.keySet()) {
            revmap.put(tickets.get(key), key);
        }
        for (String key : tickets.keySet()) {
            if (!revmap.containsKey(key)) {
                return key; // starting point
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Banglore");
        tickets.put("Bombay", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStarted(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.println(key);//ye line delete kr dena run krne ke time🎁🎁🎁
            System.out.print("-->" + tickets.get(start));
            start = tickets.get(start);
        }
    }
}
