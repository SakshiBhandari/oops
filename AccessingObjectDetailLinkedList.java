import java.util.LinkedList;
public class AccessingObjectDetailLinkedList {
//Given below is the code for a linked list named studentList, with five students’ data stored in the format of the
// Student data type in the list. Write statements using the get method, to print the details of the student at index 1 in this list.

        public static void main(String[] args) {
            LinkedList<Students> studentList = new LinkedList<Students>();

            Students s1 = new Students("Sujit", 1);
            Students s2 = new Students("Siddharth", 2);
            Students s3 = new Students("Karanpreet", 3);
            Students s4 = new Students("Hari", 5);
            Students s5 = new Students("Tricha", 4);

            studentList.add(s1);
            studentList.add(s2);
            studentList.add(s3);
            studentList.add(s4);


            studentList.get(1);
            System.out.println(s2.getDetails());

        }

        public static void printStudentList(LinkedList<Students> students) {
            for(Students s : students) {
                System.out.println(s.getDetails());
            }
        }
    }

    class Students {
        private final String name;
        private final int rollNumber;

        public Students(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
        }

        public String getDetails() {
            return
                    "name = " + this.name + '\n' +
                            "roll number = " + this.rollNumber + '\n';
        }
    }

