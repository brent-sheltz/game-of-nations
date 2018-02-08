
/**
 * Write a description of class country here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class country
{
    private String name;
    private int population;
    private int agriculture;
    private int patriotism;
    private int industry; 
    private int income;
    private int arsenal_pt;
    
    private int army;
    private int navy;
    
    
    /**
     * Constructor for objects of class country
     */
    public country(String name , int population, int agriculture, int patriotism ,
    int industry ,int income , Boolean is_arsernal_nation, int army , int navy)
    {
           this.name = name;
           this.population = population;
           this.agriculture=agriculture;
           this.patriotism = patriotism;
           this.industry = industry;
           this.income = income;
           this.army = army;
           this.navy = navy;
           if(is_arsernal_nation == true)
           {
               this.arsenal_pt = 5 ; 
    
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
    
    
    
    
    
    
    
    
    
    
    
    
}
