public class Car {
    int modelYear;
    String modelName;

    //Creating constructor that takes parameters and assigns values to variables
    public Car(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Car myCar = new Car(1969, "Mustang");
        System.out.println(myCar.modelName + " " + myCar.modelYear);
    }
}