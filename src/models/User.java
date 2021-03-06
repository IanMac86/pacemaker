package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import com.google.common.base.Objects;

//import java.util.Map;
//import java.util.HashMap;

 
   
public class User {

	public String firstName;
	public String lastName;
	public String email;
	public String password;
	
	@Override
	 public String toString()
	  {
	    return toStringHelper(this).addValue(firstName)
	                               .addValue(lastName)
	                               .addValue(password)
	                               .addValue(email)                               
	                               .toString();
	  }
	  
	public User()
	{
}

	public User(String firstName,String lastName, String email, String password)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;  
		this.password = password;       
	}
	  @Override  
	  public int hashCode()  
	  {  
	     return Objects.hashCode(this.lastName, this.firstName, this.email, this.password);  
	  }
	}