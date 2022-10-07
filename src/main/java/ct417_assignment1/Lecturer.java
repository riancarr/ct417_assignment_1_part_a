/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417_assignment1;

import org.joda.time.DateTime;
import java.util.ArrayList;

/**
 *
 * @author Rian
 */
public class Lecturer {
    private String name;
    private int age;
    private DateTime dateOfBirth;
    private int id;
    private String userName;
    private ArrayList<CourseModule> modulesTeaching;
    
    //Constructor

    public Lecturer(String name, int age, DateTime dateOfBirth, int id) 
    {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.userName = getUserName(name, age);
        this.modulesTeaching = new ArrayList<CourseModule>();
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public DateTime getDateOfBirth() 
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) 
    {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getUserName(String name, int age) 
    {
        return name + age;
    }

    public void setUserName(String userName) 
    {
        this.userName = userName;
    }
    public String returnUserName()
    {
        return userName;
    }

    public ArrayList getModulesTeaching() 
    {
        return modulesTeaching;
    }
 
}
