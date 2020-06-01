package org.dev.fhhf.consume_endpoint.model;

public class BioObject {

    private Object person;

    public BioObject() {
    }

    public Object getPerson() {
        return person;
    }

    public void setPerson(Object person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "BioObject{" +
                "person=" + person +
                '}';
    }
}
