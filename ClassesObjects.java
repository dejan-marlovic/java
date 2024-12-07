public class ClassesObjects {
    int x = 5;
    int y = 8;

    public static void main(String[] args) {
        ClassesObjects myObject = new ClassesObjects();
        ClassesObjects myObject1 = new ClassesObjects();
        System.out.println(myObject.x);
        System.out.println(myObject1.x + myObject1.y);
    }

    /*
     * You can also create an object of a class and access it in another class. This
     * is often used for better organization of classes (one class has all the
     * attributes and methods, while the other class holds the main() method (code
     * to be executed)).
     * 
     * Remember that the name of the java file should match the class name. In this
     * example, we have created two files in the same directory/folder:
     * 
     * Main.java
     * Second.java
     */
}
