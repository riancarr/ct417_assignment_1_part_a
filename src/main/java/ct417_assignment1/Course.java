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
public class Course {
    private String courseName;
    private ArrayList<Module> courseModules;
    private ArrayList<Student> enrolledStudents;
    private DateTime startDate;
    private DateTime endDate;
    
    //Constructor
    public Course(String courseName, DateTime startDate, DateTime endDate) 
    {
        this.courseName = courseName;
        this.courseModules = new ArrayList<Module>();
        this.enrolledStudents = new ArrayList<Student>();
        this.startDate = startDate;
        this.endDate = endDate;
    }

    
    //Getters and Setters
    public String getCourseName() 
    {
        return courseName;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public ArrayList getCourseModules() 
    {
        return courseModules;
    }


    public ArrayList getEnrolledStudents() 
    {
        return enrolledStudents;
    }


    public DateTime getStartDate() 
    {
        return startDate;
    }
    public void setStartDate(DateTime startDate) 
    {
        this.startDate = startDate;
    }

    public DateTime getEndDate() 
    {
        return endDate;
    }
    public void setEndDate(DateTime endDate) 
    {
        this.endDate = endDate;
    }
    
}
