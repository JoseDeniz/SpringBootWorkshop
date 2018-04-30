package workshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import workshop.actions.GetAllPeople;
import workshop.model.Person;

import java.util.List;

@RestController
public class PersonController {

    private GetAllPeople getAllPeople;

    @Autowired
    public PersonController(GetAllPeople getAllPeople) {
        this.getAllPeople = getAllPeople;
    }

    @GetMapping("/api/people")
    public List<Person> findAll() {
        return getAllPeople.execute();
    }
}
