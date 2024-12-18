//Exercise Personuppgifter 1

public class Person2{
    String firstName, lastName;
    //double because can have decimal value
    double height, weight;
    //age is an integer
    int age;
    //is either true or false
    boolean student;

    String streetName;

    String streetNumber;

    Person2 (){
        //String name is text
        firstName = "Karl-Erik";
        lastName = "Doe";
        //double because can have decimal value
        height = 1.75;
        //double can have decimal value
        weight = 70.5;
        //age is an integer
        age = 48;
        //is either true or false
        student = true;

        streetName = "Lundagatan";

        streetNumber = "?34";
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

   boolean validateName(String name){

        if(name.matches(".*\\\\d.*")) {
            System.out.println("Name can not contain numbers!");
            return false;
        }
        else if (name.length() <= 2){
            System.out.println("Name has to be longer than 2 characters!");
            return false;
        }
        else if(name.matches("^-.*|.*-$")) {
            System.out.println("Name can not start or end with an hyphen!");
            return false;

        }else{
            return true;
        }

   }

   boolean validateStreetName(String streetName){
        if (!streetName.matches("^[a-zA-Z]+$"))
        {
            System.out.println("Street name should only contain letters!");
            return false;
        }
        else return true;
   }

   public boolean validateStreetNumber(String streetNumber){

        if (streetNumber.matches("^\\d+([a-zA-Z]?)$")){
            return true;
        }
        else {
            System.out.println("Street number can only contain numbers and optionally a letter at the end!");
            return false;
        }
   }
    public static void main(String[] args){
        Person2 person = new Person2();
        //System.out.println(person.printFormattedInfo());
        System.out.println(person.firstName);
        System.out.println(person.streetName);
        System.out.println(person.validateName(person.firstName));
        System.out.println(person.validateStreetName(person.streetName));
        System.out.println(person.streetNumber);
        System.out.println(person.validateStreetNumber(person.streetNumber));
    }
}