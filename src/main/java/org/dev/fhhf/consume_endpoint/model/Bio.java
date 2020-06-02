package org.dev.fhhf.consume_endpoint.model;

import java.util.List;

public class Bio {

    private Person person;
    private List<Strength> strengths;

    public Bio() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Strength> getStrengths() {
        return strengths;
    }

    public void setStrengths(List<Strength> strengths) {
        this.strengths = strengths;
    }

    @Override
    public String toString() {
        return "" + person;
    }
}
