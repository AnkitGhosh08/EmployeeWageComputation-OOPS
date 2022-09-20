package com.codinclub;

public class empWageCmp {
    int isFullTime = 1;
    int isPartTime = 2;
    int empRatePerHrs = 20;
    int numberOfWorkingDays = 2;
    int workingHours = 0;
    int wage = 0;
    int totalEmpWage = 0;

    public void monthlyWage() {
        for (int day = 0; day < numberOfWorkingDays; day++) {
            int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
            switch (empCheck) {
                case 1:
                    System.out.println("Employee is present");
                    workingHours = 8;
                    break;
                case 2:
                    System.out.println("Employee is present");
                    workingHours = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
                    workingHours = 0;
            }
            wage = workingHours * empRatePerHrs;
            totalEmpWage = totalEmpWage + wage;
            System.out.println("Employee Daily Wage is : " + wage);
        }
        System.out.println("total Emp Wage :"+ totalEmpWage);
    }
}