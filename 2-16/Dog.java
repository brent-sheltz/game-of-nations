
public class Dog
{
    private String name;
    private int age;

    public Dog( )
    {
        this.name = "";
        this.age = 0;
    }

    public Dog( String daName, int theAge )
    {
        name = daName;
        age = theAge;
    }

    /*
    public Dog( String name, int age )
    {
        this.name = name;
        this.age = age;
    }
     */

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        return getName() + " " + getAge();
    }
        
    public String bark()
    {
        return "arf arf";
    }
}
