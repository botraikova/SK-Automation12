import java.util.List;
import java.util.ArrayList;

public class arrayListWithForLoop150 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(15);
        list1.add(32);
        list1.add(42);
        list1.add(55);
        list1.add(75);
        list1.add(122);
        list1.add(132);
        list1.add(150);
        list1.add(180);
        list1.add(200);

        for (Integer number : list1) {
            if (number > 150) {
                break;
            }
            if (number % 5 == 0) {
                System.out.println(number);
            }
        }
    }
}