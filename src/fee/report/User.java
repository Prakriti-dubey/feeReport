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
class User {
private String Name, Password, Email;
private String Contact_no;
public User(String Name, String Password, String Email, String Contact_no)
{
  this.Name=Name;
  this.Password=Password;
  this.Email=Email;
  this.Contact_no=Contact_no;
}
public String getName()
{
return Name;
}
public String getPassword()
{
return Password;    
}
public String Email()
{
    return Email;
}
public String Contact_no()
{
    return Contact_no;
}
}
