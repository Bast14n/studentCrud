package pl.surowka.studentcrudapp.mongodb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = StudentRepositoryMongo.class)
public class MongoDBConfig {
}
