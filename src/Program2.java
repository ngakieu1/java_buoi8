import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.HashSet;
public class Program2 {
    public static void main(String[] args) {
        /*List numbers = List.of(4,5,6,7);
        System.out.println(numbers);
        System.out.println(numbers.get(2));
        List numbers2 = new ArrayList();
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);
        System.out.println(numbers2.get(2));
         */
        /*Double[] numbers3 = new Double[10];
        numbers3[0] = 4.0;
        numbers3[1] = 5.0;
        numbers3[2] = 6.0;

        List numbers4 = new ArrayList(); //get double numbers every single added numbers
        numbers4.add(4);
        numbers4.add(5);
        numbers4.add(6);
        numbers4.add(1,100);
        System.out.println(numbers4);
        numbers4.remove(0);
        System.out.println(numbers4);
        System.out.println(numbers4.contains(6));

        LinkedList numbers5 = new LinkedList();
        numbers5.add(4);
        numbers5.add(5);
        numbers5.add(6);
         */
//HashSet gan giong voi TreeSet
        HashSet set1 = new HashSet();
        set1.add(31);
        set1.add(1);
        set1.add(52);
        System.out.println(set1);
        TreeSet set2 = new TreeSet();
        set2.add(2);
        set2.add(4);
        set2.add(4);
        System.out.println(set2);

    }
}
