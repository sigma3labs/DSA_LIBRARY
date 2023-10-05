import java.util.HashMap;
import java.util.Set;

public class Majority_Element {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(check(arr));
        System.out.println(check2(arr));
    }

    public static int check(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        Set<Integer> st = map.keySet();
        for (Integer i : st) {
            if (map.get(i) > n / 2) {
                return i;
            }
        }
        return -1;
    }

    // same approach but less lines of code
    public static int check2(int arr[]) {

        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > n / 2) {
                return key;
            }
        }
        return -1;
    }
}
