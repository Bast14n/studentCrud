package pl.surowka.studentcrudapp.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepositoryMongo extends MongoRepository<Student,Integer>{
}
