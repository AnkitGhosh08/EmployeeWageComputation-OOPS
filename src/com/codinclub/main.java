package com.codinclub;

public class main
{
    public static void main(String[] args)
    {
        System.out.println(" --  Welcome to Employee wage Computation problem  -- ");

        empWageCmpClassMethod empWageCmp = new empWageCmpClassMethod();
        empWageCmp.computeEmpWage("flipkart",400,20,30);
        empWageCmp.computeEmpWage("ajio",1000,12,32);
    }
}
