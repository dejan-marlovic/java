/*
The public keyword is an access modifier, meaning that
it is used to set the access level for classes,
attributes, methods and constructors.

We divide modifiers into two groups:

Access Modifiers - controls the access level
Non-Access Modifiers - do not control access level,
but provides other functionality
 */

/*
Access Modifiers
Modifier	Description
public	    The class is accessible by any other class
default	    The class is only accessible by classes in the same package.
            This is used when you don't specify a modifier.

For attributes, methods and constructors, you can use the one of the following:
Modifier	Description
public	    The code is accessible for all classes
private	    The code is only accessible within the declared class
default	    The code is only accessible in the same package.
            This is used when you don't specify a modifier.
protected	The code is accessible in the same package and subclasses.
 */


/*
Non-Access Modifiers
For classes, you can use either final or abstract:

Modifier	Description
final	    The class cannot be inherited by other classes

abstract	The class cannot be used to create objects. To access an abstract class,
            it must be inherited from another class.


For attributes and methods, you can use the one of the following:

Modifier	    Description
final	        Attributes and methods cannot be overridden/modified
static	        Attributes and methods belongs to the class, rather than an object
abstract	    Can only be used in an abstract class, and can only be used on methods.
                The method does not have a body, for example abstract void run();.
                The body is provided by  the subclass (inherited from).
transient	    Attributes and methods are skipped when serializing the object containing them
synchronized	Methods can only be accessed by one thread at a time
volatile	    The value of an attribute is not cached thread-locally, and is
                always read from the "main memory"

 */

/*
    Final
    If you don't want the ability to override existing attribute values,
    declare attributes as final:
 */

public class Modifiers{
    final int x = 10;
    final double PI = 3.14;

    public static void main (String[]args){
        Modifiers obj = new Modifiers();
        // will generate an error: cannot assign a value to a final variable
        //obj.x = 50;
        // will generate an error: cannot assign a value to a final variable
        //obj.PI = 25;
        System.out.println(obj.x);
        System.out.println(obj.PI);

        obj.myPublicMethod();

        //This would output an error
        //myPublicMethod();

        //this works
        myStaticMethod();
        // create an object of the Student class (which inherits attributes and methods from Person)
        Student student = new Student();
        System.out.println("Name: " + student.fname);
        System.out.println("Age: " + student.age);
        System.out.println("Graduation Year: " + student.graduationYear);
        student.study(); // call abstract method

    }

    /*
    Static
    A static method means that it can be accessed without
    creating an object of the class, unlike public:
     */
    // Static method
    static void myStaticMethod(){
        System.out.println("Static method can be called without creating objects!");
    }
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

}