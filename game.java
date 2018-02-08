import java.util.Scanner;
/**
 * Write a description of class game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class game
{

    public static void main()
    {   
        country usa = new country("usa",10,10,10,10,10 ,true,5,5) ;
        country USSR = new country("USSR",10,10,10,10,10,true,5,5) ;
        country iran = new country("iran",10,10,10,10,10,false,5,5) ;

        Scanner kb = new Scanner(System.in);
        String response = kb.nextLine();

        while(! response.equals("done"))
        {

            if (response.equals("battle"))
            {
                System.out.println("who is attacking");
                String att_nat = kb.nextLine(); 
                System.out.println("who is defending");
                String def_nat = kb.nextLine();
                System.out.println(" how many armys does attacker have ");
                int att_army= kb.nextInt();

                System.out.println(" how many armys does defender have");
                int def_army= kb.nextInt();
                battle.battle(att_nat,def_nat,att_army,def_army)  ;

            }
            if ( response.equals("build"))
            {

            }
            
            response = ""; 
            response = kb.nextLine(); 
        }
    }

}
