//Exercise Personuppgifter 1

public class Person2{
    String firstName, lastName;
    //double because can have decimal value
    double height, weight;
    //age is an integer
    int age;
    //is either true or false
    boolean student;

    Person2 (){
        //String name is text
        firstName = "John";
        lastName = "Doe";
        //double because can have decimal value
        height = 1.75;
        //double can have decimal value
        weight = 70.5;
        //age is an integer
        age = 48;
        //is either true or false
        student = true;
    }
    public boolean isStudent(){
        return student;
    }
    public String fullName(){
        return firstName + " " + lastName;
    }
    public boolean isOfAge(int age){
        return age > 18;
    }
    public double calculateBMI(double weight, double height ){
        return weight / (height * height);
    }
    public String formatHeight(double height){
        if (height < 1 && height > 0) {
            return  (height * 100) + " cm";
        }else if (height == 0)
            return "0 cm";
        else{
         int meters = (int) height;
         double fractionalPart = height - meters;
         int centimeters  = (int) (fractionalPart * 100);
            return meters + " meter " + "and " + centimeters + " cm";
        }
    }
   public String printFormattedInfo(){
        return this.fullName() + " is " + this.age + " years old " + "they weigh " +
                this.weight + " kg "+ "and are " + this.formatHeight(height) +" tall."
                + " This means that their BMI is: " +
                this.calculateBMI(this.weight, this.height) +"." + " They are " +
                (this.isStudent() ? "student" : "not a student") + " and " +
                (isOfAge(this.age) ? "of age " : " not of age");
   }
    public static void main(String[] args){
        Person2 person = new Person2();
        System.out.println(person.printFormattedInfo());
    }
}