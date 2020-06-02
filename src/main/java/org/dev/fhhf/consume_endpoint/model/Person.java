package org.dev.fhhf.consume_endpoint.model;

public class Person {

    private String professionalHeadline;
    private String picture;
    private String name;

    public Person() {
    }

    public String getProfessionalHeadline() {
        return professionalHeadline;
    }

    public void setProfessionalHeadline(String professionalHeadline) {
        this.professionalHeadline = professionalHeadline;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "professionalHeadline='" + professionalHeadline + '\'' +
                ", picture='" + picture + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
