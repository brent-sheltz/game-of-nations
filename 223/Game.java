import java.util.Scanner;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;

/**
 * Write a description of class game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    public static void main( )
    { 

        
        
        Country[] allNations = new Country[ 3 ];
         GUI_project txt = new GUI_project();
        Country usa = new Country("usa",10,10,10,10,10 ,true,5,5,5,5,5,5,5,5) ;
        Country USSR = new Country("USSR",10,10,10,10,10 ,true,5,5,5,5,5,5,5,5) ;
        Country iran = new Country("iran",10,10,10,10,10,false,5,5,5,0,0,0,0,0) ;
        allNations[0] = usa ;
        allNations[1] = USSR;
        allNations[2] = iran;

        System.out.println( usa );
        txt.setF();
        //Scanner kb = new Scanner(System.in);
        String response = "";
        
        // Country daNation;
        // for ( Country c : allNations )
        // {
        // if ( response.equals( c.getName() ) )
        // {
        // daNation = c;
        // }
        // }
        // makes string a country
        int round = 0;
        while(round < 6)
        {
            for (Country c : allNations)
            {
                boolean done = false ;
                response = txt.in();
                while(! response.equals("done"))
                {
                    String a = "";
                    
                    if (response.equals("battle"))
                    {
                        Country attNat = null;
                        do 
                        {
                            txt.settxt("who is attacking");
                            String att_input = txt.gettxt(); 
                            String att_input_up = att_input.toUpperCase();
                            // Country attNat = new Country(att_nat,0 ,0,0,0,0,false,att_army,0) ; 

                            for ( Country i : allNations )
                            {
                                if ( att_input.equals( c.getName() ) || att_input_up
                                .equals( c.getName() ) )
                                {
                                    attNat = i;
                                }
                            }
                        } while ( attNat == null );
                        System.out.println(" how many armys does attacker have ");
                        //int att_tank= kb.nextInt();
                        System.out.println(" how many tanks does attacker have ");
                        //int att_army= kb.nextInt();

                        Country defNat = null;
                        do 
                        {
                            System.out.println("who is defending");
                            //String def_input = kb.nextLine();
                            //String def_input_up = def_input.toUpperCase();
                            // Country attNat = new Country(att_nat,0 ,0,0,0,0,false,att_army,0) ; 

                            for ( Country i : allNations )
                            {
                                //if ( def_input.equals( c.getName() ) || def_input_up
                                //.equals( c.getName() ) )
                                {
                                    defNat = i;
                                }
                            }
                        } while ( defNat == null );

                        System.out.println(" how many armys does defender have");
                       // int def_army= kb.nextInt();
                        System.out.println(" how many tanks does defender have");
                        //int def_tank= kb.nextInt();
                       
                        //Country defNat = null;
                        //Country defNat =  new Country(def_nat,0,0,0,0,0,false,def_army,0) ;
                        /*for ( Country c : allNations )
                        {
                        if ( def_nat.equals( c.getName() ) )
                        {
                        defNat = c;
                        }
                        }
                         */
                        //attNat.battle(attNat,defNat,att_army,def_army,att_tank ,def_tank,0,0,0,0)  ;

                        attNat.printAll();
                        defNat.printAll();

                    }

                    if ( response.equals("build"))
                    {

                    }
                    if ( response.equals("show"))
                    {
                        for ( Country g : allNations )
                        {

                            g.printAll();

                        }
                    }
                    response = ""; 
                    //response = kb.nextLine(); 
                }

            }

            round++;
        }
    }

    public static void battle()
    {

        
        
    }
    



}

