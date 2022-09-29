/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ct417_assignment1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.joda.time.DateTime;


/**
 *
 * @author Rian
 */
public class MainTest {
    
    public MainTest() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        
        //Create courses
        Course c1 = new Course("CS", new DateTime(2022,9,29,12,0), new DateTime(2023,5,20,12,0));
        assertTrue(c1.getStartDate().isBefore(c1.getEndDate()));
        
        //Create students
        Student s1 = new Student("Jimmy Steve", 110, new DateTime(1912,4,30,12,0), 6534, c1);
        String expectedUserName = "Jimmy Steve110";
        assertEquals(expectedUserName, s1.returnUserName());
        
        //Create lecturers
        Lecturer l1 = new Lecturer("Teachy MacGuffin", 52, new DateTime(1970,5,23,12,0), 3468);
        String expectedLecturerName = "Teachy MacGuffin52";
        assertEquals(expectedLecturerName, l1.returnUserName());
        
        //Create Modules
        Module m1 = new Module("Computers", "CS329", l1);
        
        //Add modules to course
        c1.getCourseModules().add(m1);
                
        //Add students to course    
        c1.getEnrolledStudents().add(s1);
             
        //Add course to Students
        s1.setCourse(c1);

        //Add modules to Students
        s1.getModules().add(m1);
                
        //Add modules to Lecturers
        l1.getModulesTeaching().add(m1);
                
        //Add students to modules
        m1.getStudents().add(s1);
                
        //Add courses to modules
        m1.getAssociatedCourses().add(c1);
        System.out.println("Hi, my name is " + s1.getName() + ". I'm a student of " + m1.getName() + " which is taught by " + m1.getLecturer().getName() + ", who is " + l1.getAge() + " years young.");
               
        
    }
    
}
