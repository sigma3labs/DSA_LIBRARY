import java.util.HashSet;

public class Dinstinct_element {
    public static int Count(int arr[]) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            // if (!set.contains(arr[i])) {
                set.add(arr[i]);
            // }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 5, 6, 7, 3, 2, 4, 1, 8, 2, 9};
        System.out.println(Count(arr));
    }
}
