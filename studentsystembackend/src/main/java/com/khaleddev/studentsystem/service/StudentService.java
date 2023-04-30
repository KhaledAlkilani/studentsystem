//This line declares the package name that this interface belongs to.
package com.khaleddev.studentsystem.service;

//This line imports the Student class from the package com.khaleddev.studentsystem.model. It is required because the Student class is used in the interface.
import com.khaleddev.studentsystem.model.Student;

// This line imports the List interface from the java.util package. It is required because the List interface is used in the interface.
import java.util.List;

//This line declares the interface StudentService as public. An interface is a collection of abstract methods that are used to define a set of related behaviors.
public interface StudentService {

    //This line declares a method named saveStudent that returns a Student object and takes a Student object as an argument. This method is used to save a student object.
    public Student saveStudent (Student student);

    //This line declares a method named getAllStudents that returns a list of Student objects. This method is used to retrieve a list of all students.
    public List<Student> getAllStudents();

}
