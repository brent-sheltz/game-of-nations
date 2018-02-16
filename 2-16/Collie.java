
public class Collie extends Dog
{
    private double furLength;
    
    public Collie()
    {
        super();
        furLength = 0;
    }

    public Collie( String myName, int myAge, double myFurLength )
    {
        super( myName, myAge );
        furLength = myFurLength;
    }
    
    @Override
    public String bark( )
    {
        return "howwwwwl";
    }
    
    @Override
    public String toString( )
    {
        return getName() + " " + getAge() + " " + furLength;
    }
}
