package pl.surowka.studentcrudapp.mongodb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @org.springframework.data.annotation.Id
    private Integer Id;
    private String firstName;
    private String lastName;
    private String yearOfStudy;


}
