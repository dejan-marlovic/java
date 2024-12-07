public class Attributes {

    /*
    git init  creates repository
    git status checks what files are part of the repository
     */

    /*
    Now Git is aware of the file, but has not added it to our repository!

    Files in our Git repository folder can be in one of 2 states:

    Tracked - files that Git knows about and are added to the repository
    Untracked - files that are in your working directory,
    but not added to the repository

    When you first add files to an empty repository,
    they are all untracked. To get Git to track them,
    you need to stage them, or add them to the staging environment.

    git add . adds all files inside the folder into staging environment

    1. git init (only once initiates/creates repository)
    2. git status lists untracked items
    3. git add . adds items to staging

    Small change
     */

    /*
    Note: Short status flags are:

    ?? - Untracked files
    A - Files added to stage
    M - Modified files
    D - Deleted files
    We see the file we expected is modified. So let's commit it directly

    Warning: Skipping the Staging Environment is not generally recommended.

    Skipping the stage step can sometimes make you include unwanted changes.
     */





    /*
     * In the previous chapter, we used the term "variable" for x in the example (as
     * shown below). It is actually an attribute of the class. Or you could say that
     * class attributes are variables within a class
     * Another term for class attributes is fields.
     */

    int x = 5;
    //final int y = 3;
    String fname = "Joe";
    //String lname = "Doe";

    public static void main(String[] args) {

        /*
         * You can access attributes by creating an object of the class, and by using
         * the dot syntax (.):
         * 
         * The following example will create an object of the Main class, with the name
         * myObj. We use the x attribute on the object to print its value
         */
        Attributes obj = new Attributes();
        Attributes obj1 = new Attributes();
        System.out.println(obj.x);
        obj1.x = 83;
        obj.x = 40;
        System.out.println(obj.x + " " + obj.fname);
        System.out.println(obj1.x + " " + obj1.fname);
        // obj.y = 45; //The final field Attributes.y cannot be assigned

        /*
         * The final keyword is useful when you want a variable to always store the same
         * value, like PI (3.14159...).
         * 
         * The final keyword is called a "modifier"
         */
    }

}
