import java.util.HashMap;
import java.util.HashMap.*;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Pakistan",12);
        map.put("America",22);
        map.put("China",33);
        System.out.println(map);

        for(Map.Entry<String,Integer>e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key+ " " + map.get(key));
        }


        //Removing
       ;



//        if(map.containsKey("Chinaa")){
//            System.out.println("Present");
//        }else {
//            System.out.println("Absent");
//        }
//        System.out.println(map.get("China"));
//        System.out.println(map.get("Hassan "));
    }
}
