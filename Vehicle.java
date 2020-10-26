public class Vehicle
{
    protected static String type = "Car";

    public void printType()
    {
        System.out.println(type);
    }
}

class Bike extends Vehicle {
    protected static String type = "Bike";
}
class main{
    public static void main(String[] args){
        new Bike().printType();
    }
}