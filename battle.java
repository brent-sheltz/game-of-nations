
/**
 * Write a description of class battle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class battle
{

    private int army_attac;
    private int army_defend;

    public static void battle(String attack , String defend  ,int army_attac, int army_defend)
    {
        int[] att_num = new int[army_attac] ; 
        int[] def_num = new int[army_defend] ;
        if ( army_attac > 0)
        {
            for (int i = 0 ; i<army_attac; i++)
            {
                int roll = roll();
                att_num[i] = roll;
                System.out.print(roll+" ");

            
            
            }
        }
        
    }
   
    
    
    public static int roll()
    {
        int a;
        a = (int)(Math.random()*6+1);   
        return a;

    }

    
    
    
    
    
    
    
}
