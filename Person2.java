//Exercise Personuppgifter 1

import java.util.Scanner;

public class Person2 {
    String firstName, lastName;
    //double because can have decimal value
    double height, weight;
    //age is an integer
    int age;
    //is either true or false
    boolean student;
    String streetName;
    String streetNumber;

    Person2(String firstN, String lastN, String streetN, String streetNo) {
        //String name is text
        firstName = firstN;
        lastName = lastN;
        streetName = streetN;
        streetNumber = streetNo;

        //double because can have decimal value
        height = 1.75;
        //double can have decimal value
        weight = 70.5;
        //age is an integer
        age = 48;
        //is either true or false
        student = true;


    }

    public boolean isStudent() {
        return student;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public boolean isOfAge(int age) {
        return age >= 18;
    }

    public double calculateBMI(double weight, double height) {
        return weight / (height * height);

    }

    public String formatHeight(double height) {
        if (height < 1 && height > 0) {
            return (height * 100) + " cm";
        } else if (height == 0)
            return "0 cm";
        else {
            int meters = (int) height;
            double fractionalPart = height - meters;
            int centimeters = (int) (fractionalPart * 100);
            return meters + " meter " + "and " + centimeters + " cm";
        }
    }

    public String getStreet() {
        return streetName + " " + streetNumber;
    }

    public String printFormattedInfo() {
        return this.fullName()
                + " is " + this.age + " years old "
                + "they weigh "
                + this.weight + " kg " + "and are " + this.formatHeight(height) + " tall.\n"
                + "This means that their BMI is: "
                + String.format("%.2f", this.calculateBMI(this.weight, this.height)) + "."
                + " They are "
                + (this.isStudent() ? "a student" : "not a student") + " and "
                + (isOfAge(this.age) ? "of age. " : " not of age.")
                + this.fullName() + " currently resides at: " + this.getStreet();
    }

    static void validateName(String name) throws Exception {

        if (name.matches(".*\\d.*")) {
            throw new Exception("Name can not contain numbers!");
        } else if (name.length() <= 2) {
            throw new Exception("Name has to be longer than 2 characters!");

        } else if (name.matches("^-.*|.*-$")) {
            throw new Exception("Name can not start or end with a hyphen!");
        }
    }

    static void validateStreetName(String streetName) throws Exception {
        if (!streetName.matches("^[a-zA-Z]+$")) {
            throw new Exception("Street name should only contain letters!");
        }
    }

    static void validateStreetNumber(String streetNumber) throws Exception {

        if (!streetNumber.matches("^[0-9]+[a-zA-Z]?$")) {
            throw new Exception("Street number can only contain numbers and optionally a letter at the end!");
        }

    }

    static void validateSocialSecurityNumber(String socialSecurityNumber) throws Exception {
        if (!socialSecurityNumber.matches("^[0-9]{6}-[0-9]{4}$")) {
            throw new
                    Exception("Social Security Number can only contain numbers and be in following format: YYMMDD-NNNN");
        }
    }

    public static void main(String[] args) {
        boolean tryAgain = true;
        Scanner scanner = new Scanner(System.in);
        int state = 1;
        String firstName = "";
        String lastName = "";
        String streetName = "";
        String streetNumber = "";
        do {

            try {
                switch (state) {
                    case 1:
                        System.out.println("Please enter first name!");
                        firstName = scanner.nextLine();
                        validateName(firstName);
                        if (!firstName.trim().isEmpty()) {
                            state++;
                        }

                    case 2:
                        System.out.println("Please enter last name!");
                        lastName = scanner.nextLine();
                        validateName(lastName);
                        if (!lastName.trim().isEmpty()) {
                            state++;
                        }
                    case 3:
                        System.out.println("Please enter street name!");
                        streetName = scanner.nextLine();
                        validateStreetName(streetName);
                        if (!streetName.trim().isEmpty()) {
                            state++;
                        }
                    case 4:
                        System.out.println("Please enter street number!");
                        streetNumber = scanner.nextLine();
                        validateStreetNumber(streetNumber);
                        if (!streetNumber.trim().isEmpty()) {
                            tryAgain = false;
                        }
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Do you want to try again? y/n");
                String answer = scanner.nextLine();
                tryAgain = answer.equals("y");
            }
        } while (tryAgain);

        Person2 person = new Person2(firstName, lastName, streetName, streetNumber);
        System.out.println("I have created person object ");
        System.out.println(person.printFormattedInfo());
    }
}