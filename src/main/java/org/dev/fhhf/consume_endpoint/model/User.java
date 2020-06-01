package org.dev.fhhf.consume_endpoint.model;

public class User {

    private String username;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "username='" + username;
    }
}
