import java.util.*;

public class DoggieRunner
{
    public static void main( String[] args )
    {
        Dog rover = new Dog();
        System.out.println( rover.toString() );
        
        Dog oldYeller = new Dog( "Old Yeller", 145 );
        System.out.println( oldYeller );   // automatically calls toString()
        
        Dog lassie = new Collie ( "Laaaaaassie", 2, 4.5 );
        System.out.println( lassie.toString() );
        
        
        System.out.println();
        
        List<Dog> doggieList = new ArrayList<Dog> ();
        doggieList.add( rover );
        doggieList.add( oldYeller );
        doggieList.add( lassie );
        for ( int i = 0; i < doggieList.size(); i++ )
        {
            System.out.print( doggieList.get( i ) );
        }
    }
}
