package workshop.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import workshop.model.Person;
import workshop.repositories.DatabasePersonRepository;

import java.util.List;

@Service
public class GetAllPeople {
    private DatabasePersonRepository personRepository;
    private PersonFilterer personFilterer;

    @Autowired
    public GetAllPeople(DatabasePersonRepository personRepository, PersonFilterer personFilterer) {
        this.personRepository = personRepository;
        this.personFilterer = personFilterer;
    }

    public List<Person> execute() {
        final List<Person> all = personRepository.findAll();
        return personFilterer.filter(all, person -> true);
    }
}
