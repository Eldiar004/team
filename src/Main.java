import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello world!");
        System.out.println("Hello");
    }

    public static List<Integer> addTwoNumbers1(List<Integer> q1, List<Integer> w1) {
        List<Integer> arr1 = new ArrayList<>();
        Set<Integer> arr2 = new LinkedHashSet<>();
        for (int i = q1.size() - 1; i >= 0; i--) {
            for (int j = w1.size() - 1; j >= 0; j--) {
                arr2.add(w1.get(i));
            }
            int sum1 = q1.get(i);
            arr1.add(sum1);

        }
        System.out.println(arr2);
        return arr1;
    }
}