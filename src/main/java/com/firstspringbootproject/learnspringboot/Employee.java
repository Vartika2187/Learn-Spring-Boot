package com.firstspringbootproject.learnspringboot;

public class Employee {

    private String id;
    private String position;
    private String manager;
    private String feedback;

    public Employee(String id, String position, String manager, String feedback) {
        super();
        this.id=id;
        this.position=position;
        this.manager=manager;
        this.feedback=feedback;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString(){
        return "Employee [id=" + id + ", position=" + position + ", manager=" + manager +", feedback=" + feedback +"]";
    }
}
