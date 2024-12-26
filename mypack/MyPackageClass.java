/**
 * User-defined Packages To create your own package, you need to understand that Java uses a file
 * system directory to store them. Just like folders on your computer:
 * <p>
 * └── root └── mypack └── MyPackageClass.java
 * <p>
 * Save the file as MyPackageClass.java, and compile it:
 * <p>
 * C:\Users\Your Name>javac MyPackageClass.java Then compile the package:
 * <p>
 * C:\Users\Your Name>javac -d . MyPackageClass.java
 * <p>
 * This forces the compiler to create the "mypack" package.
 *
 * The -d keyword specifies the destination for where to save the class file. You can use any
 * directory name, like c:/user (windows), or, if you want to keep the package within the same
 * directory, you can use the dot sign ".", like in the example above.
 * <p>
 * Note: The package name should be written in lower case to avoid conflict with class names.
 */
//now the package has to be in the folder named mypack
//we run it: java mypack.MyPackageClass
package mypack;

public class MyPackageClass {
    public static void main(String[] args) {
        System.out.println("This is my package");
    }
}
