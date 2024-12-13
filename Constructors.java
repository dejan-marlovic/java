public class Constructors{
    int x;
    //Creating constructor thats sets x value when the object is created
    public Constructors(){
        x = 5;
    }

    public static void main(String [] args){
        //Creating an object and calling the constructor.
        Constructors obj = new Constructors();
        System.out.println(obj.x);
        Constructors obj1 = new Constructors(50);
        System.out.println(obj1.x);

        /*
        Note that the constructor name must match the class name, and it
        cannot have a return type (like void).

        Also note that the constructor is called when the object is created.

        All classes have constructors by default: if you do not create a class
        constructor yourself, Java creates one for you. However,
        then you are not able to set initial values for object attributes.
         */

        /*
        Constructor Parameters
        Constructors can also take parameters, which is used to initialize attributes.

        The following example adds an int y parameter to the constructor.
        Inside the constructor we set x to y (x=y). When we call the constructor,
        we pass a parameter to
        the constructor (5), which will set the value of x to 5:

        We can have several different constructors of the same class.
         */
    }
    //second constructor
    public Constructors(int y){
        x = y;
    }
}