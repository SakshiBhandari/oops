import java.util.*;

abstract class Homeloan {
    double amount;
    int time;
    //Write your code here
    public Homeloan(double amount, int time) {
        this.amount = amount;
        this.time = time;
    }
    abstract double getRateOfInterest();
    abstract double simpleInterest();
}

class Bank1 extends Homeloan {
    //Write your code here
    public Bank1(double amount, int time){
        super(amount, time);
    }
    public double getRateOfInterest() {
        return 7.2;
    }
    double simpleInterest() {
        double SI = (amount * this.getRateOfInterest() * time)/100;
        double totalAmount = SI + amount;
        return totalAmount;        }
}

class Bank2 extends Homeloan {

    //Write your code here
    public Bank2(double amount, int time){
        super(amount, time);
    }
    public double getRateOfInterest() {
        return 8.1;
    }
    double simpleInterest() {
        double SI = (amount * this.getRateOfInterest() * time)/100;
        double totalAmount = SI + amount;
        return totalAmount;
    }
}

class Source3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        if (amount <= 0 && time <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest());
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest());
        }

    }
}
