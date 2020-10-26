import java.util.*;

/*Create three classes – Shape, Triangle, and Rectangle – which constitute a method display that has to be overridden.
You need to take the number of sides in a shape as the input and predict the kind of shape it is. The output of your \
program is as follows:
If the number of the input side is 0, print “The shape is a circle”.
If the number of the input side is 3, print “The shape is a triangle”.
If the number of the input side is 4, print “The shape is a rectangle”.
If the number of sides is anything other than 0, 3, or 4, print “Enter a valid number of sides!”. */

public class Shape{
    public void display(){
        System.out.println("The shape is circle");
    }
   public void print(){
        System.out.println("The shape is circle");
   }
}
class Triangle extends Shape{
    public void display(){
        System.out.println("The shape is triangle");
    }
}
class RectangleX extends Shape{
    public void display(){
        System.out.println("The shape is rectangle");
    }
}
class Source10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shape obj2 = new Shape();
        Shape obj = new Triangle();
        Shape obj1 = new RectangleX();
        int numberOfSides = in.nextInt();
        switch(numberOfSides){
            case 0:
                obj2.display();
                break;
            case 3:
                obj.display();
                break;
            case 4:
                obj1.display();
                break;
            default:
                System.out.println("Enter a valid number of sides!");
                break;
        }
    }
}


