package pl.surowka.studentcrudapp.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @javax.persistence.Id
    private int Id;
    private String firstName;
    private String lastName;
    private String yearOfStudy;


}
