package org.example;

public abstract class Employee {
    private String name;
    private Long salary;


    public abstract Long colculateSalary();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;

    }
}
