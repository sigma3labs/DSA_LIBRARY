import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
// import java.util.Map.Entry;

public class Classroom {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Taha", 20);
        hm.put("Badar", 23);
        hm.put("Hasan", 26);
        hm.put("Umar", 34);

        System.out.println(hm);
        
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Taha", 20);
        lhm.put("Badar", 23);
        lhm.put("Hasan", 26);
        lhm.put("Umar", 34);

        System.out.println(lhm);
        
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Taha", 20);
        tm.put("Badar", 23);
        tm.put("Hasan", 26);
        tm.put("Umar", 34);

        System.out.println(tm);


        // System.out.println(hm);
        // System.out.println(hm.entrySet());

        // for (Entry<String, Integer> k : hm.entrySet()) {
        //     System.out.print(k);
        //     System.out.print(" , ");
        // }
        
    }
}