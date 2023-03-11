import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task2 {
    //    Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
//    Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
//    ["string", "s", "my_value"]
    //  (object) instanceof (type)
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(list);
        deleteNumbers(list);
        System.out.println(list);
    }

    public static void deleteNumbers(List<String> source) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            try {
                int element = Integer.parseInt(source.get(i));
                if (true) {
                    source.remove(i);
                    i--;
                }
            } catch (NumberFormatException e) {
                stringList.add(source.get(i));
            }
        }
    }
}

