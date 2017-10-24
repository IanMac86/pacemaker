package controllers;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.User;

public class Main
{
  public static void main(String[] args) throws IOException
  {    
    PacemakerAPI pacemakerAPI = new PacemakerAPI();
   

    pacemakerAPI.createUser("Bart",  "Simpson", "bart@simpson.com",  "secret");
    pacemakerAPI.createUser("Homer", "Simpson", "homer@simpson.com", "secret");
    pacemakerAPI.createUser("Lisa",  "Simpson", "lisa@simpson.com",  "secret");

    Map<String,User> users = (Map<String, User>) pacemakerAPI.getUsers(); //   List<User> users = pacemakerAPI.getUsers();
    System.out.println(users);
    Collection<User> users1 = pacemakerAPI.getUsers();
    
    Map<String, User> users11 = new HashMap<>();
    
  }
}