/**
 * GIT REPETITION Working with Git Branches In Git, a branch is a new/separate version of the main
 * repository.
 * <p>
 * Let's say you have a large project, and you need to update the design on it.
 * <p>
 * How would that work without and with Git:
 * <p>
 * Without Git:
 * <p>
 * Make copies of all the relevant files to avoid impacting the live version Start working with the
 * design and find that code depend on code in other files, that also need to be changed! Make
 * copies of the dependant files as well. Making sure that every file dependency references the
 * correct file name EMERGENCY! There is an unrelated error somewhere else in the project that needs
 * to be fixed ASAP! Save all your files, making a note of the names of the copies you were working
 * on Work on the unrelated error and update the code to fix it Go back to the design, and finish
 * the work there Copy the code or rename the files, so the updated design is on the live version (2
 * weeks later, you realize that the unrelated error was not fixed in the new design version because
 * you copied the files before the fix)
 * <p>
 * With Git:
 * <p>
 * With a new branch called new-design, edit the code directly without impacting the main branch
 * EMERGENCY! There is an unrelated error somewhere else in the project that needs to be fixed ASAP!
 * Create a new branch from the main project called small-error-fix Fix the unrelated error and
 * merge the small-error-fix branch with the main branch You go back to the new-design branch, and
 * finish the work there Merge the new-design branch with main (getting alerted to the small error
 * fix that you were missing) Branches allow you to work on different parts of a project without
 * impacting the main branch.
 * <p>
 * When the work is complete, a branch can be merged with the main project.
 * <p>
 * You can even switch between branches and work on different projects without them interfering with
 * each other.
 * <p>
 * Branching in Git is very lightweight and fast! we use git branch branch-name to create new branch
 * we use git checkout branch-name to move to that branch
 * <p>
 * Note: Using the -b option on checkout will create a new branch, and move to it, if it does not
 * exist to merge with master we use git merge branch-name, but we need to be on the master branch
 * <p>
 * to connect local repository to remote repository we use:
 * <p>
 * git remote add origin https://github.com/our-githubusername
 * <p>
 * git remote add origin URL specifies that you are adding a remote repository, with the specified
 * URL, as an origin to your local Git repo. Now we can push our master branch to the origin url,
 * and set it as the default remote branch:
 * <p>
 * git push --set-upstream origin master
 * <p>
 * Pulling to Keep up-to-date with Changes When working as a team on a project, it is important that
 * everyone stays up to date.
 * <p>
 * Any time you start working on a project, you should get the most recent changes to your local
 * copy.
 * <p>
 * With Git, you can do that with pull.
 * <p>
 * pull is a combination of 2 different commands:
 * <p>
 * fetch merge
 * <p>
 * Git Pull But what if you just want to update your local repository, without going through all
 * those steps?
 * <p>
 * pull is a combination of fetch and merge. It is used to pull all changes from a remote repository
 * into the branch you are working on. INHERITANCE Java Inheritance (Subclass and Superclass) In
 * Java, it is possible to inherit attributes and methods from one class to another. We group the
 * "inheritance concept" into two categories:
 * <p>
 * subclass (child) - the class that inherits from another class superclass (parent) - the class
 * being inherited from To inherit from a class, use the extends keyword.
 * <p>
 * In the example below, the Car class (subclass) inherits the attributes and methods from the
 * Vehicle class (superclass):
 */
public class Vehicle {
    /**
     * We set the brand attribute in Vehicle to a protected access modifier. If it was set to
     * private, the Car1 class would not be able to access it.
     */
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut");
    }
}

class Car1 extends Vehicle {
    private String modelName = "Mustang";

    /**
     * Why And When To Use "Inheritance"? - It is useful for code reusability: reuse attributes and
     * methods of an existing class when you create a new class.
     * <p>
     * Tip: Also take a look at the next chapter, Polymorphism, which uses inherited methods to
     * perform different tasks.
     * If you don't want other classes to inherit from a class, use the final keyword:
     */
    public static void main(String[] args) {
        Car1 myCar = new Car1();

        myCar.honk();


        System.out.println(myCar.brand + " " + myCar.modelName);

    }
}
