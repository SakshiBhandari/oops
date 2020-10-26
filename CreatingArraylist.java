import java.util.*;                  //ArrayList library imported
public class CreatingArraylist {
    /*The following code was written using an array in your previous practice coding question.
    Modify the code, and implement it using the ArrayList. Also, a new element 99 must be added at
     the end of the newly implemented ArrayList. This implementation is already written in the code.
     */
        public static void main(String[] args) {
            ArrayList random = new ArrayList();
            //Declare and create an object of the ArrayList class named 'random', in place of the line above
            //Add the first four elements to this 'random' ArrayList
            random.add(2);
            random.add(4);
            random.add(5);                    //Command for adding a new element
            random.add(10);
            random.add(99);

            printArray(random);
        }

        public static void printArray(ArrayList arr) {   //Change the type of the parameter to ArrayList
            for(Object a : arr) {              //Change the data type of 'a' from 'int' to 'Object'
                System.out.println(a);
        }
   }
}

