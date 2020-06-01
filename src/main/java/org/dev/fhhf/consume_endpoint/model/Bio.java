package org.dev.fhhf.consume_endpoint.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bio {

    private Person person;
    private Strengths[] strengths;

    public Bio() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Strengths[] getStrengths() {
        return strengths;
    }

    public void setStrengths(Strengths[] strengths) {
        this.strengths = strengths;
    }

    @Override
    public String toString() {
        return "" + person;
    }
}
