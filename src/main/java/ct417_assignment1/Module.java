/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417_assignment1;
import java.util.ArrayList;


/**
 *
 * @author Rian
 */
public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> associatedCourses;
    private Lecturer lecturer;

    //Constructor
    public Module(String name, String id, Lecturer lecturer) {
        this.name = name;
        this.id = id;
        this.students = new ArrayList<Student>();
        this.associatedCourses = new ArrayList<Course>();
        this.lecturer = lecturer;
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

    public String getId() 
    {
        return id;
    }
    public void setId(String id) 
    {
        this.id = id;
    }

    public ArrayList getStudents() 
    {
        return students;
    }
   

    public ArrayList getAssociatedCourses() 
    {
        return associatedCourses;
    }
    

    public Lecturer getLecturer() 
    {
        return lecturer;
    }
    public void setLecturer(Lecturer lecturer) 
    {
        this.lecturer = lecturer;
    }
    
    
    
}
