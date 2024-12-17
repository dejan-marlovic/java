//Exercise Personuppgifter 1

public class Person1{

    String firstName, lastName;

    //double because can have decimal value
    double height, weight;

    //age is an integer
    int age;

    //is either true or false
    boolean student;

    Person1 (){
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

    public String isStudent(){
        return student ? "a student" : "not a student";
    }
    public static void main(String[] args){
        Person1 person = new Person1();

        System.out.println(person.firstName + " "
                + person.lastName + " is " +
                person.age + " years old and he is " +
                person.isStudent());
    }
}