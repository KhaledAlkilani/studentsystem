// This line declares the package name that this class belongs to.
package com.khaleddev.studentsystem.controller;
//This line imports the Student class from the package com.khaleddev.studentsystem.model. It is required because the Student class is used in the class.
import com.khaleddev.studentsystem.model.Student;
//This line imports the StudentService interface from the package com.khaleddev.studentsystem.service. It is required because the StudentService interface is used in the class.
import com.khaleddev.studentsystem.service.StudentService;
//This line imports the Autowired annotation from the org.springframework.beans.factory.annotation package. The Autowired annotation is used for automatic dependency injection.
import org.springframework.beans.factory.annotation.Autowired;
//This line imports the annotations for Spring Web MVC that will be used in this class.
import org.springframework.web.bind.annotation.*;
//This line imports the List interface from the java.util package. It is required because the List interface is used in the class.
import java.util.List;

// This line annotates the class with the RestController annotation, which indicates that the class will handle web requests and return the response in a format that is suitable for RESTful web services.
@RestController
//This line specifies the base URL path for this controller.
@RequestMapping("/student")
@CrossOrigin
// This line declares the StudentController class.
public class StudentController {
//This line annotates the studentService field with the Autowired annotation. It enables automatic dependency injection for the studentService field.
    @Autowired
//This line declares a private field named studentService of type StudentService. It is used to interact with the StudentService interface.
    private StudentService studentService;

    //This line specifies the URL path for the add method and sets it to handle HTTP POST requests.
    @PostMapping("/add")
    //This line declares a public method named add that takes a Student object as an argument using the @RequestBody annotation, which means that the student parameter will be populated with the request body.
    public String add(@RequestBody Student student) {
        //This line invokes the saveStudent method on the studentService object to save the student object to the data source.
        studentService.saveStudent(student);
//This line returns a string indicating that the student was successfully added.
        return "New student is added";
    }

    //This line specifies the URL path for the getAllStudents method and sets it to handle HTTP GET requests.
    @GetMapping("/getAll")
    //his line declares a public method named getAllStudents that returns a list of Student objects.
    public List<Student> getAllStudents() {
        //This line returns a list of Student objects retrieved from the data source using the studentService object.
        return studentService.getAllStudents();
    }
}