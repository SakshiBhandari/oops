import java.util.ArrayList;

public class OperationsOnArrayList {
 /* Given below is the code of ArrayList, which contains an object named ‘random’ with
 five elements: 2, 4, 5, 10, and 99.9 stored as float-type values. Can you use add and
 remove methods to replace the fourth element (10) with 15? */

        public static void main(String[] args) {
            ArrayList<Float> random = new ArrayList<Float>();
            random.add(2f);
            random.add(4f);
            random.add(5f);
            random.add(10f);
            random.add(99.9f);

            //Write new statements here
            random.remove(3);
            random.add(3, 15f);

            printList(random);
        }

        public static void printList(ArrayList<Float> arr) {
            for(Float num : arr) {
                System.out.println(num);
            }
        }
    }

