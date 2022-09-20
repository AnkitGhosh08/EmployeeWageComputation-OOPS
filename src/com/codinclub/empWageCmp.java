package com.codinclub;

public class empWageCmp
{
    int isFullTime = 1;
    int empRatePerHrs = 20;
    int empHrs = 8;
    int empWage=0;

    public void dailyWage()
    {

        int empCheck = (int) (Math.floor (Math.random() * 10) % 2);

        if (empCheck == isFullTime) {
            System.out.println("Employee is present");
            empHrs = 8;
        } else
        {
            System.out.println("Employee is absent");
            empHrs = 0;
        }
        empWage = (empHrs * empRatePerHrs);
        System.out.println("employee daily wage is :" + empWage);
    }
}
