public class RealandImaginary {

    public static void findRealAndImag(String s) {
        String real = new String();
        String imaginary = new String();
        int i = s.length();
        // variable for the index of the separator
        // Storing the index of '+'
        if (s.indexOf('+') != -1) {
            int j = s.indexOf('+');
            real = s.substring(0, j);
            imaginary = s.substring(j + 2, i);
        }
        // else storing the index of '-'
        else if (s.indexOf('-') != -1) {
            int j = s.indexOf('-');
            real = s.substring(0, j);
            imaginary = s.substring(j + 2, i);
        }
    }
//    public void findComplex(){
//
//        if(real != null && imaginary != null){
//            System.out.println("The number is complex");
//        }
//        else if(real != null && imaginary == null) {
//            System.out.println("The number is real.");
//        }
//        else if(real == null && imaginary != null){
//            System.out.println("The number is purely imaginary");
//        }
//        System.out.println("Real part: " + real );
//        System.out.println("Imaginary part: "+
//                imaginary);
//    }
//    // Driver code
    public static void main(String []args)
    {
        String s = "2";

        findRealAndImag(s);

    }
}

