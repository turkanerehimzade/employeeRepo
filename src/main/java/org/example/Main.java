package org.example;

public class Main {
    public static void main(String[] args) {

        Employee employee=new SalariedEmployee();
        Employee employee1=new CommissionedEmployee();
        Employee employee2=new HourlyEmployee();
        printEmployee(employee);
        printEmployee(employee1);
        printEmployee(employee2);
        }
        public static Long printEmployee(Employee employee){
            Long salaries=employee.colculateSalary();
            return salaries;
        }

    }