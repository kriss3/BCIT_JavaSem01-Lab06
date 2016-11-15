
/**
 * Playground class to created and manipulate instances of other classes in the project.
 * 
 * @author Krzysztof Szczurowski 
 * @version 1.1;
 * @since 11/15/2016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2117246/View
 */
public class Playground
{
    /**
     * Public run method to created and manipulate instances of other available classes;<br>
     * Does not take any parameter and does not return any value;
     */
    public void run()
    {
        Person p1 = new Person();
        
        System.out.println("*** DEFAULT VALUES ***");
        System.out.println(p1.getFirstName() + " " + p1.getLastName());
        System.out.println("AGE: " + p1.getAge());
        System.out.println("HEIGHT: " + p1.getHeight());
        System.out.println();
        
        //Setting new values
        p1.setFirstName("Tony");
        p1.setLastName("Hawk");
        p1.setAge(25);
        p1.setHeight(199);
        
        System.out.println("*** MUTATED VALUES ***");
        System.out.println(p1.getFirstName() + " " + p1.getLastName());
        System.out.println("AGE: " + p1.getAge());
        System.out.println("HEIGHT: " + p1.getHeight());
    }
}
