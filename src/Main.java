import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(mergeSort(List.of(9, 8, 3, 11, 4, 5, 9)));
    }

    private static List<Integer> mergeSort(List<Integer> values) {
        if (values.size() <= 1) return values;// condição de parada

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> sortedLeft;
        List<Integer> sortedRight;

        int i = 0;
        var middle = values.size() / 2;// calcula middle

        // cria left e right
        for (; i < middle; i++) {
            left.add(values.get(i));
        }
        for (; i < values.size(); i++) {
            right.add(values.get(i));
        }

        // ordena left recursivamente
        sortedLeft = mergeSort(left);

        // ordena right recursivamente
        sortedRight = mergeSort(right);


        return merge(sortedLeft, sortedRight);
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> sortedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                sortedList.add(left.get(i));
                i++;
            } else {
                sortedList.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            sortedList.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            sortedList.add(right.get(j));
            j++;
        }

        return sortedList;
    }

}
