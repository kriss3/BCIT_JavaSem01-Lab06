/**
 * A class to model a Person.
 * This class is provided as is and is NOT part of the lab submission.
 * 
 * @author Gary Tong
 * @version 1.0
 * @date 2016-10-28
 */
public class Person
{
    // these are instance variables.
    // every instance of this Person class has their own instance variable
    private String firstName;
    private String lastName;
    private int age;
    private double height;

    // static fields are shared across all instances
    // in other words, every object created from this Person class will share the same counter variable
    public static int counter = 0;
    
    // constants are declared with the final keyword
    // this means these variables are immutable; they can not be changed
    // by convention, they are in all uppercase with _ denoting spaces
    public static final double PI = 3.14159;
    public static final int NUMBER_OF_SECONDS_IN_MINUTES = 60;

    /**
     * Default constructor.
     */
    public Person()
    {
        firstName = "Gary";
        lastName = "Tong";
        age = 30;
        height = 185;
        counter++;
    }    

    // overloaded constructors look at the parameter lists
    // this change in signature allows more than one constructor to be defined
    // this is known as overloading
    // provides the programmer a few options to instantiate a Person object
    public Person(String _firstName, String _lastName)
    {
        firstName   = _firstName;
        lastName    = _lastName;        
    }    
  
    public Person(int _age, String _firstName, String _lastName, double _height)
    {
        firstName   = _firstName;
        lastName    = _lastName;
        age         = _age;
        height      = _height;
    }
    
    public Person(String _firstName, String _lastName, int _age, double _height)
    {
        firstName   = _firstName;
        lastName    = _lastName;
        age         = _age;
        height      = _height;

        // every time we create a Person object, increase the counter
        counter++;
    }

    /**
     * Mutator method for the counter.
     *
     * @param _counter Set the counter to this value.
     */
    public void setCounter(int _counter)
    {
        counter = _counter;
    }

    /**
     * Accessor method for the counter
     *
     * @return The counter representing the number of Person objects created.
     */
    public int getCounter()
    {
        return counter;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void printAge()
    {
        int b = 10;
        
        age++;  // 31
        age++;  // 32
        age++;  // 33
        age++;  // 34
        
     
        age--;  // 33

        // age increments after the statement
        // b decrements before the statement
        System.out.println(age++ + --b);
    }

    public void printAgeGroup()
    {
        // use a switch statement to test the variable age against the different cases
        switch(age)
        {
            // if age is 30, execute the following
            case 30:
                //
                System.out.println("Thirty!");
                // break means to break out of the switch
                // if break isn't here, it would test to see if age is 40
                break;
            case 40:
                System.out.println("Forty!");
                break;            
            default:
                System.out.println("Not found!");           
        }
    }

    public double getHeight()
    {
        return height;
    }
    
    public void setFirstName(String _firstName)
    {
        firstName = _firstName;
    }

    public void setLastName(String _lastName)
    {
        lastName = _lastName;
    }
    
    public void setAge(int _age)
    {
        if(_age > 0)
        {
            age = _age;            
        }
    }
    
    public void setHeight(double _height)
    {
        height = _height;
    }
    
    public String getNameTag()
    {
        return "Hello, my name is " + firstName + " " + lastName;
    }
    
    public void printNameTag()
    {
        // some examples of string concatenation
        System.out.println(30 + 30);
        System.out.println("30" + 30);
        System.out.println(30 + "30" + 30);
        System.out.println(30 + 30 + "30" + 30); 

        // 30 will be added to age because both 30 and age integers; arithmetic is performed
        // then it will be concatenated with the following string
        // at the end we are in a String and integer situation, so String concatenation takes place over arithmetic
        System.out.println(30 + age + "Hello, my name is " + firstName + " " + lastName + ". And my age is " + 30 + age  );
    }

    public boolean qualifiesForDiscount()
    {
        boolean qualifies = false;
        
        if(age < 19)
        {
           qualifies = true;
        }
        // both age >= 19 AND age <= 65 have to be true in order for the code below to run
        // try || and !=
        // || means EITHER side can be true, not both
        else if(age >= 19 && age <= 65)
        {
            qualifies = false;
        }
        
        return qualifies;
    }
    
    /**
     * @return The number of times a Person object was instantiated.
     */
    public String getNumberOfTimesCreated()
    {
        String howMany = "too many times!";
        
        switch(counter)
        {
            case 0:
                howMany = "none";
                break;
            case 1:
                howMany = "once";
                break;
            case 2:
                howMany = "twice";
                break;
        }
        
        return howMany;
    }
}















