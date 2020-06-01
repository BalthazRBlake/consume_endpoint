package org.dev.fhhf.consume_endpoint.model;

import java.util.List;

public class People {

    private List<User> results;
    private String total;

    public People() {
    }

    public List<User> getResults() {
        return results;
    }

    public void setResults(List<User> results) {
        this.results = results;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "People{" +
                "results=" + results +
                ", total='" + total + '\'' +
                '}';
    }
}
