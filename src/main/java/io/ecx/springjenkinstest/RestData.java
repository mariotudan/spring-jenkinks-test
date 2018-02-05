package io.ecx.springjenkinstest;

/**
 * @author Mario Tudan (mario.tudan@ecx.io)
 */
public class RestData {
    private String name;

    public RestData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
