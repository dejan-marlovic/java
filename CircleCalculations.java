public class CircleCalculations{
    final static double PI = 3.14;

    public static void main(String[] args){
        System.out.println(calculateCircleArea(5.0));
        System.out.println(calculateCircleCircumference(5.0));
    }

    static double calculateCircleArea(double radius){
        return radius * radius * PI;
    }

    static double calculateCircleCircumference(double radius){
        return 2 * PI * radius;
    }
}