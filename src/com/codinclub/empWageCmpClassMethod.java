package com.codinclub;

public class empWageCmpClassMethod {
//    constant
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;

    public int computeEmpWage(String companyName,int empRatePerHrs, int numberOfWorkingDays, int maxHrsInMonth) {
        // variable
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while(totalEmpHrs < maxHrsInMonth && totalWorkingDays < numberOfWorkingDays){
            totalWorkingDays++;

        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case isFullTime:
                    System.out.println("Employee is present");
                    empHrs = 8;
                    break;
                case isPartTime:
                    System.out.println("Employee is present");
                    empCheck = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
                    empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Day : " + totalWorkingDays + "empHrs : " + empHrs);
        }
        int totalEmpWage = empHrs * empRatePerHrs;
        System.out.println("total emp wage :" + totalEmpWage);
        return totalEmpWage;
    }
}