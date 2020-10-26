/*Declare a parameterised constructor in the Number class that will take the real and imaginary parts of a number as input.
 The Number class should contain the getter and setter methods for getting and setting the real and imaginary parts of a number.
 Create two more classes ‘Complex’ and ‘PurelyImaginary’. Class Complex extends the Number class and checks if the input number is
  complex or not using checkComplex(). The PurelyImaginary class inherits the Complex class and decides if the input number is
   purely imaginary using checkPurelyImaginaryNumber().
   Output: The output of your program will consist of four lines:
-The first line will display the imaginary part of the input number.
-The next line will print “The given number is complex” if the number is complex; else, it will print “The given number is real”.
-The third line will display the number in the standard format, which is:
x + iy.
-The last line will display “The number is purely imaginary” if the number is purely imaginary; else, it will print “The number is not purely imaginary”.
Note: If the number is purely imaginary then print only the imaginary part of it like “i8” */

import java.util.*;

public class Number {
    //Write your code here
    double realPart;
    double imaginaryPart;
    public Number(double realPart, double imaginaryPart ){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public double getImaginaryPart() {
        //Write your code here
        return imaginaryPart;
    }
    public void setImaginaryPart(double imaginaryNumber){
        this.imaginaryPart = imaginaryNumber;
    }
    public double getRealPart(){
        return realPart;
    }
    public void setRealPart(double realNumber){
        this.realPart = realPart;
    }
}

class Complex extends Number {
//Write your code here
    public Complex(double realPart, double imaginaryPart){
        super(realPart, imaginaryPart);
    }
    public void checkComplex(){
        double complexNumber = getRealPart() + getImaginaryPart();
        if(getImaginaryPart() != 0 && getRealPart() == 0) {
            System.out.println("The given number is complex");
        }
        else if (getImaginaryPart() != 0 && getRealPart() != 0) {
            System.out.println("The given number is complex");
        }
        else if (getImaginaryPart() == 0 && getRealPart() != 0) {
            System.out.println("The given number is real");
        }
        else if (getImaginaryPart() == 0 && getRealPart() == 0){
            System.out.println("The given number is real");
        }
    }
}

class PurelyImaginary extends Complex {

//Write your code here
    public PurelyImaginary(double realPart, double imaginaryPart){
        super(realPart, imaginaryPart);
    }
    public void checkPurelyImaginaryNumber(){

        if(getRealPart() == 0 && getImaginaryPart() != 0){
            System.out.println("i"+getImaginaryPart());
            System.out.println("The number is purely imaginary");
        }
        else if(getImaginaryPart() == 0 && getRealPart() != 0) {
            System.out.println(getRealPart() + "+"+"i" + getImaginaryPart());
            System.out.println("The number is not purely imaginary");
        }
        else if(getImaginaryPart() == 0 && getRealPart() == 0) {
            System.out.println(getRealPart() + "+"+"i" + getImaginaryPart());
            System.out.println("The number is not purely imaginary");
        }
        else if(getImaginaryPart() != 0 && getRealPart() != 0){
            System.out.println(getRealPart() + "+"+"i" + getImaginaryPart());
            System.out.println("The number is not purely imaginary");
        }
    }
}

class Sourcex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        num.checkPurelyImaginaryNumber();

    }
}

