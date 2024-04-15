package org.example;

public class CommissionedEmployee extends Employee{

    @Override
    public Long colculateSalary() {
     int salary=35*20;
        System.out.println("CommissionedEmployee's salary:"+salary);
        return null;
    }
}
