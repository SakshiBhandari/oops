import java.util.ArrayList;

public class ArrayListGenerics {

    /* Complete the code below to create an ArrayList named ‘random’, using Generics, with five elements — 2, 4, 5, 10, and 99.9
    — stored as float-type values in ArrayList, and then, print this ArrayList using the printList method.*/

    public static void main(String[] args) {

        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);

        printArray(random);
    }

    public static void printArray(ArrayList arr) {
        for (Object a : arr) {
            System.out.println(a);
        }
    }
}

