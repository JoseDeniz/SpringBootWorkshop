package workshop.actions;

import org.springframework.stereotype.Component;
import workshop.model.Person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class PersonFilterer {
    public List<Person> filter(List<Person> all, Predicate<Person> predicate) {
        return all.stream().filter(predicate).collect(Collectors.toList());
    }
}
