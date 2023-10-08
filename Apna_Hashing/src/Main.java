import java.util.HashSet;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        if(set.contains(2)){
//            System.out.println("YEst it is contain ");
//        }
//        if(!set.contains(3)){
//            System.out.println("Does not contain");
//        }
//        else {
//            System.out.println("It is contain");
//        }
//
//        set.remove(2);
//        if(!set.contains(2  )){
//            System.out.println("Removed");
//        }
//        System.out.println(set.size());
//    }
//
//
// }
}}