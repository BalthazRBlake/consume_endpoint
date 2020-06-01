package org.dev.fhhf.consume_endpoint.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Strengths {

    private String name;

    public Strengths() {
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
