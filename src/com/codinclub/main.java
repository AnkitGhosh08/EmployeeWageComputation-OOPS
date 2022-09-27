package com.codinclub;

public class main {
    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage("flipkart", 450, 32, 250);
        EmployeeWage employeeWage2 = new EmployeeWage("ajio", 500, 45, 150);
        EmployeeWage employeeWage3 = new EmployeeWage("amazon", 800, 24, 180);

        employeeWage.calculateTotalWage();
        employeeWage.display();

        employeeWage2.calculateTotalWage();
        employeeWage2.display();

        employeeWage3.calculateTotalWage();
        employeeWage3.display();
    }
}

