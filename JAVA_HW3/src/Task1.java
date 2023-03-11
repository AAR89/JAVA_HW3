import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
//        Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 1, 6, 3, 5, 6, 11, 9));
        System.out.println(integers);
        removeOdd(integers);
        System.out.println(integers);
    }

    public static void removeOdd(List<Integer> source) {
        List<Integer> Odds = new ArrayList<>();
        int i = 0;
        while (i < source.size()) {
            Integer element = source.get(i);
            if (element % 2 == 0) {
                Odds.add(element);
            } else {
                source.remove(i);
                i--;
            }
            i++;
        }
    }
}