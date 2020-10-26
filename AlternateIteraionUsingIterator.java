import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Iterator;

public class AlternateIteraionUsingIterator {
    /*Given below is the code for ArrayList, which contains a random object with six elements — 2, 4, 5, 10, 99.9, and 101
    — stored as float-type values. The code prints all the elements forwards, using the ‘iterateFwd( )’ method. Modify this
     method, and rename it to c, with a code that prints the elements stored at the even positions of ArrayList,
      i.e. print alternate elements, starting from index 1*/
        public static void main(String[] args) {
            List<Float> random = new ArrayList<Float>();
            random.add(2f);
            random.add(4f);
            random.add(5f);
            random.add(10f);
            random.add(99.9f);
            random.add(101f);

            iterateAltn(random);
        }

        public static void iterateAltn(List<Float> random ) {
            ListIterator<Float> it = random.listIterator();
            it.next();
            while (it.hasNext()){
                System.out.println(it.next());
                if (it.hasNext()) {
                    it.next();
            }
        }
    }
}
