package com.abc.salary;

public interface SalariedIndividual {
    int getDayWorkedInMonth();

    int getCommercialsPerDay();

    //non-abstract methods --> default methods
    default double calculate(){
        int noOfDaysWorked = this.getDayWorkedInMonth();
        int costPerDay = this.getCommercialsPerDay();

        int totalCost = noOfDaysWorked * costPerDay;
        int totalCostAfterPt = totalCost - 200;
        double tds = 0.1 * totalCostAfterPt;

        return totalCostAfterPt - tds;
    }
}
