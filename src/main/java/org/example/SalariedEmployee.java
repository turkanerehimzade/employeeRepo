package org.example;

public class SalariedEmployee extends Employee {
    @Override
    public Long colculateSalary() {
        int salary=35*30;
        System.out.println("SalariedEmployee's salary:"+salary);
        return null;
    }
}
