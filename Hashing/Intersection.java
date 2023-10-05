import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
     public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        for(int i : nums2){
            if(set.contains(i)){
                list.add(i);
                set.remove(i);
            }
        }
        int count[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            count[i] = list.get(i); 
        }
        return count;
    }
}
