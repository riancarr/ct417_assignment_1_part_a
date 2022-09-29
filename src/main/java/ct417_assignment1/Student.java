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
public class Student {
    private String name;
    private int age;
    private DateTime dateOfBirth;
    private int id;
    private String userName;
    private Course course;
    private ArrayList<Module> modules;
    

    //Constructor
    public Student(String name, int age, DateTime dateOfBirth, int id, Course course) 
    {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.userName = getUserName(name, age);
        this.course = course;
        this.modules = new ArrayList<Module>();
    }

    //Getters and Setters
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

    public Course getCourse() 
    {
        return course;
    }
    public void setCourse(Course course) 
    {
        this.course = course;
    }

    public ArrayList getModules() 
    {
        return modules;
    }
    
}
