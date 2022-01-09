/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fee.report;

/**
 *
 * @author Prakriti dubey
 */
class User1 {
    private int Roll_No, Fee, Paid, Due;
    private String Contact_No;
    private String Name, Email, Course, Address, City, State, Country;
    public User1(int Roll_No, int Fee, int paid, int Due, String Contact_No, String Name, String Email, String Course, String Address, String City, String State, String Country )
    {
      
        this.Roll_No=Roll_No;
        this.Fee=Fee;
        this.Paid = Paid;
        this.Due=Due;
        this.Contact_No=Contact_No;
        this.Name=Name;
        this.Email=Email;
        this.Course=Course;
        this.Address=Address;
        this.City=City;
        this.State=State;
        this.Country=Country;
    }
    
    public int getRoll_No()
    {
        return Roll_No;
    }
    public int getFee()
    {
        return Fee;
    }
    public int getPaid()
    {
        return Paid;
    }
    public int getDue()
    {
        return Due;
    }
    public String getContact_No()
    {
        return Contact_No;
    }
    public String getName()
    {
        return Name;
    }
     public String getEmail()
    {
        return Email;
    }
      public String getCourse()
    {
        return Course;
    }
       public String getAddress()
    {
        return Address;
    }
        public String getCity()
    {
        return City;
    }
         public String getState()
    {
        return State;
    }
          public String getCountry()
    {
        return Country;
    }
        
}
