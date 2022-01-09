
package fee.report;

/**
 *
 * @author Prakriti dubey
 */
class User2 {
      private int Roll_No,due;
    private String Name;
    public User2(int Roll_No, String Name, int due)
    {
      
        this.Roll_No=Roll_No;
        this.Name=Name;
        this.due=due; 
    }
    
    public int getRoll_No()
    {
        return Roll_No;
    }
   public String getName()
    {
        return Name;
    }
    public int getdue()
    {
        return due;
    }
   
}
