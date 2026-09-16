import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        var left = List.of(3, 8);
        var right = List.of(4, 5);

        System.out.println(merge(left, right));
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> sortedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                sortedList.add(left.get(i));
                i++;
            } else {
                sortedList.add(right.get(j));
                j++;
            }
        }


        return sortedList;
    }

}
