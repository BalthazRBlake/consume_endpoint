package org.dev.fhhf.consume_endpoint.model;

public class Strength {

    private String name;

    public Strength() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Strengths{" +
                "name='" + name + '\'' +
                '}';
    }
}
