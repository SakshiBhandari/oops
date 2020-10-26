public class Rectangle{
    private float length;
    private float breadth;

    public float areaOfRectangle(float length, float breadth){
        float area = length*breadth;
        return area;
    }
}

class Answer{
    public static void main(String[] args){

        Rectangle R1 = new Rectangle();
        System.out.println(R1.areaOfRectangle(7.33f, 4.22f));
    }
}

