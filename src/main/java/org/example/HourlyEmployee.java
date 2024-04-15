package org.example;

public class HourlyEmployee extends Employee {

    @Override
    public Long colculateSalary() {
        int salary=35*40;
        System.out.println("HourlyEmployee's salary:"+salary);
        return null;
    }
}
