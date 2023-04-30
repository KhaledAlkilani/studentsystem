//This line declares the package name that this class belongs to.
package com.khaleddev.studentsystem.service;
// This line imports the Student class from the package com.khaleddev.studentsystem.model. It is required because the Student class is used in the class.
import com.khaleddev.studentsystem.model.Student;
//This line imports the StudentRepository interface from the package com.khaleddev.studentsystem.repository. It is required because the StudentRepository interface is used in the class.
import com.khaleddev.studentsystem.repository.StudentRepository;
//This line imports the Autowired annotation from the org.springframework.beans.factory.annotation package. The Autowired annotation is used for automatic dependency injection.
import org.springframework.beans.factory.annotation.Autowired;
//This line imports the Service annotation from the org.springframework.stereotype package. The Service annotation is used to mark a class as a service component in Spring.
import org.springframework.stereotype.Service;
//This line imports the List interface from the java.util package. It is required because the List interface is used in the class.
import java.util.List;

//This line annotates the class with the Service annotation. It marks the class as a Spring service component.
@Service
//This line declares the class StudentServiceImpl as public and implements the StudentService interface.
public class StudentServiceImpl implements StudentService {

    //This line annotates the studentRepository field with the Autowired annotation. It enables automatic dependency injection for the studentRepository field.
    @Autowired
    //This line declares a private field named studentRepository of type StudentRepository. It is used to interact with the data source.
    private StudentRepository studentRepository;
    // This line annotates the saveStudent method with the Override annotation. It indicates that the saveStudent method overrides a method from the StudentService interface.
    @Override
    //This line declares a public method named saveStudent that returns a Student object and takes a Student object as an argument. It saves a student object using the studentRepository object.
    public Student saveStudent(Student student) {
        //This line returns a Student object after saving it to the data source using the studentRepository object.
        return studentRepository.save(student);
    }

    //This line annotates the getAllStudents method with the Override annotation. It indicates that the getAllStudents method overrides a method from the StudentService interface.
    @Override
    //This line declares a public method named getAllStudents that returns a list of Student objects. It retrieves a list of all students from the data source using the studentRepository object.
    public List<Student> getAllStudents() {
        //This line declares a public method named getAllStudents that returns a list of Student objects. It retrieves a list of all students from the data source using the studentRepository object.
        return studentRepository.findAll();
    }
}
