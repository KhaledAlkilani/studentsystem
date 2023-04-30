// This line declares the package name that this class belongs to.
package com.khaleddev.studentsystem.repository;
//This line imports the Student class from the package com.khaleddev.studentsystem.model. It is required because the Student class is used in the interface.
import com.khaleddev.studentsystem.model.Student;
//This line imports the JpaRepository interface from the org.springframework.data.jpa.repository package. JpaRepository is a Spring Data interface for implementing a standard set of CRUD methods.
import org.springframework.data.jpa.repository.JpaRepository;
//This line imports the Repository annotation from the org.springframework.stereotype package. It indicates that this interface is a repository component that should be automatically detected and registered by Spring.
import org.springframework.stereotype.Repository;

//This line annotates the interface with the Repository annotation, indicating that this is a repository component.
@Repository
//This line declares the StudentRepository interface and extends the JpaRepository interface with the type parameters Student and Integer. This means that the StudentRepository interface provides methods for working with Student entities, and the Integer type parameter specifies the type of the primary key of the Student entity.
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
