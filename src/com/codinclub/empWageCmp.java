package com.codinclub;

public class empWageCmp
{
    public static void checkAttendance()
    {
        int isFullTime = 1;

        int empCheck = (int) (Math.random() * 100) % 2;

        if (empCheck == isFullTime) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
