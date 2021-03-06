
/**
 * Write a description of class country here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Country
{
    private String name;
    private int population;
    private int agriculture;
    private int patriotism;
    private int industry; 
    private int income;
    private int arsenal_pt;
    private Boolean arsenal_nat;
    private int army;
    private int navy;

    private int bomber;
    private int commando;
    private int tank;
    private int carrier;
    private int atom_bomb;
    private int A_bomber;

    /**
     * Constructor for objects of class country
     */
    public Country(String name , int population, int agriculture, int patriotism ,
    int industry ,int income , Boolean is_arsernal_nation, int army , int navy, int bomber, 
    int commando, int tank, int carrier, int atom_bomb, int A_bomber )
    {
        this.name = name;
        this.population = population;
        this.agriculture=agriculture;
        this.patriotism = patriotism;
        this.industry = industry;
        this.income = income;
        this.army = army;
        this.navy = navy;
        this.bomber=bomber;
        this.commando = commando;
        this.tank = tank;
        this.carrier = carrier;
        this.atom_bomb = atom_bomb;
        this.A_bomber= A_bomber;

        if(is_arsernal_nation == true)
        {
            this.arsenal_pt = 5 ; 
            this.arsenal_nat = true;
        }

    }

    public  String InttoString(int a )
    {

        return ""+ a;
    }

    public void add(String country, String resource, int ammount )
    {
        resource =  resource;
        if ( resource.equals("army"))
        {
            this.army = army + ammount;

        }
        if ( resource.equals("navy"))
        {
            this.navy = navy + ammount;

        }

    }

    public void build_army()
    {
        if (population >= 1)
        {

        }
    }

    public void loss(String obj , int subtract)
    {
        if ( obj.equals("army"))
        {
            this.army = army - subtract;

        }

    }

    public String getName()
    {

        return name;   

    }

    public int getPat()
    {

        return patriotism;   

    }

    public int getPop()
    {

        return population;   

    }

    public int getAgr()
    {

        return agriculture;   

    }

    public int getInd()
    {

        return industry;   

    }

    public int getInc()
    {
        return income;
    }

    public Boolean getAr()
    {

        return arsenal_nat;
    }

    public int getArm()
    {
        return army;
    }

    public int getBomber()
    {
        return bomber;
    }

    public int getCom()
    {
        return commando;
    }

    public int getTank()
    {
        return tank;
    }

    public int getCarr()
    {
        return carrier;
    }

    public int getAbomb()
    {
        return atom_bomb;
    }

    public int getAbomber()
    {
        return A_bomber;
    }

    public void battle(Country attack  , Country defend  ,int army_attac, int army_defend,
    int tank_attac, int tank_defend)
    {
        int[] remain = new int[2];
        remain = battle_army(attack,  defend , army_attac, army_defend);
        
         
    }
    public int[] battle_army( Country attack  , Country defend  ,int army_attac, int army_defend)
    {
        int att_arm_remain = army_attac ;
        int def_arm_remain = army_defend ;
        int[] roll_num_arm = new int[army_attac];

        if ( army_attac > 0)
        {
            for (int i = 0 ; i<army_attac; i++)
            {
                int roll = roll();
                roll_num_arm[i] += roll;
                System.out.print(roll+" ");

            }
            for (int i = 0 ; i<roll_num_arm.length; i++)
            {
                if( roll_num_arm[i] == 1 || roll_num_arm[i] == 2 )
                {

                    attack.loss("army", 1);
                    army_attac-- ;
                }
                if( roll_num_arm[i] == 3 || roll_num_arm[i] == 4|| roll_num_arm[i] == 5)
                {
                    attack.loss("army", 1);
                    defend.loss("army", 1);
                    army_attac-- ;
                     army_defend-- ;
                }
                if(  roll_num_arm[i] == 6)
                {
                    defend.loss("army", 1);
                    army_defend-- ;
                }
            }
        }
        int[] left = new int[2];
        left[0] = army_attac;
        left[1] = army_defend; 
        return(left);
        }
        // standard unit battle 

    

    public  void battle_tank ( Country attack  , Country defend  ,int tank_attack, int tank_defend)
    {
        int att_arm_remain = tank_attack ;
        int def_arm_remain = tank_defend ;
        int[] roll_num_arm = new int[tank_attack];

        if ( tank_attack > 0)
        {
            for (int i = 0 ; i<tank_attack; i++)
            {
                int roll = roll();
                roll_num_arm[i] += roll;
                System.out.print(roll+" ");

            }
            for (int i = 0 ; i<roll_num_arm[i]; i++)
            {
                if( roll_num_arm[i] == 1 || roll_num_arm[i] == 2 )
                {

                    attack.loss("army", 1);

                }
                if( roll_num_arm[i] == 3 || roll_num_arm[i] == 4|| roll_num_arm[i] == 5)
                {
                    attack.loss("army", 1);
                    defend.loss("army", 1);


                }
                if(  roll_num_arm[i] == 6)
                {
                    defend.loss("army", 1);

                }
            }

        }
        // standard unit battle 

    }

    public static int roll()
    {
        int a;
        a = (int)(Math.random()*6+1);   
        return a;

    }

    public void printAll()
    {
        System.out.println(getName()+" "+getPop()+" "+getAgr()+" "+
            getPat()+" "+getInd()+" "+getInc()+" "+getAr()+" " + getArm()+ " " +getBomber() 
            + " " + getCom() + " " +getTank()+ " " +getCarr()+ " "+ getAbomb()
            + " "+ getAbomber()
        );

    }
}
