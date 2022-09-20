package com.codinclub;

public class empWageCmp
{
    int isFullTime = 1;
    int isPartTime = 2;
    int empRatePerHrs = 20;
    int workingHours = 0;
    int wage = 0;
    public void dailyWage()
    {
        int empCheck = (int) (Math.floor (Math.random() * 10) % 2);
        switch (empCheck){
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
        }
        wage = workingHours * empRatePerHrs;
        System.out.println("Employee Daily Wage is : " + wage);
    }
}
