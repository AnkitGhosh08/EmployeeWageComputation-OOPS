package com.codinclub;

public class empWageCmpClassMethod {
    int isFullTime = 1;
    int isPartTime = 2;
    int empRatePerHrs = 20;
    int numberOfWorkingDays = 20;
    int maxHrsInMonth = 100;

    public int computeEmpWage() {
        //variable
        int workingHours = 0;
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        while(totalEmpHrs < maxHrsInMonth && totalWorkingDays < numberOfWorkingDays){
            totalWorkingDays++;

        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
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
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Day : " + totalWorkingDays + "empHrs : " + empHrs);
        }
        int totalEmpWage = workingHours * empRatePerHrs;
        System.out.println("total emp wage :" + totalEmpWage);
        return totalEmpWage;
    }
}