package workshop.repositories;

import org.springframework.stereotype.Repository;
import workshop.model.Person;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

@Repository
public class PersonRepository {

    public List<Person> getAll() {
        return asList(new Person(1, "Jose"), new Person(2, "Yonay"));
    }
}
