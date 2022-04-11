package ro.fasttrackit.curs22.project;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BudgetCalculator {
    private static final Scanner keyboard = new Scanner(System.in);
    private static final DecimalFormat df = new DecimalFormat("##.#");

    private static double income() {
        double studentLoan, grantsETC, parentsGuardians, job, savings, totalIncome;

        System.out.println("INCOME section");

        System.out.println("Please enter your student loan amount, if any.");
        studentLoan = keyboard.nextDouble();

        System.out.println("Please enter the amount you expect to receive in grants, bursaries or sponsorship");
        grantsETC = keyboard.nextDouble();

        System.out.println("Please enter the amount, if any you expect to receive for parents/guardians");
        parentsGuardians = keyboard.nextDouble();

        System.out.println("Please enter the of income you receive from your job, if you have one");
        job = keyboard.nextDouble();

        System.out.println("Please enter the amount of savings you wish to spend, if any");
        savings = keyboard.nextDouble();

        System.out.println("Please enter any other income you may have");
        double anyOther = keyboard.nextDouble();

        //totalling up the income
        totalIncome = studentLoan + grantsETC + parentsGuardians + job + savings + anyOther;

        return totalIncome;
    }//income

    private static double essentialOutgoing() {
        double totalEssentialOutgoing, rent, travel, insurance, carBills, utilityBills, mobilePhone, tvLicence, food;

        System.out.println("ESSENTIAL COSTS");

        System.out.print(" ");

        System.out.println("Please enter the amount of rent you will pay per week");
        rent = keyboard.nextDouble();

        System.out.println("Please enter the amount of travel costs per week");
        travel = keyboard.nextDouble();

        System.out.println("If you have insurance, please enter the total cost per week");
        insurance = keyboard.nextDouble();

        System.out.println("If a car, please enter the total expected cost for fuel, repairs etc, per week");
        carBills = keyboard.nextDouble();

        System.out.println("Please enter the amount you expect to spend on utility bills per week. This would include " +
                "gas, electric, oil, etc. Per week");
        utilityBills = keyboard.nextDouble();

        System.out.println("Please enter the amount you expect to spend on you mobile phone per week");
        mobilePhone = keyboard.nextDouble();

        System.out.println("If you have a TV licence, please enter the total amount per week");
        tvLicence = keyboard.nextDouble();

        System.out.println("Please enter how much you expect to spend on groceries per week");
        food = keyboard.nextDouble();

        //calculation
        totalEssentialOutgoing = rent + travel + food +
                utilityBills + mobilePhone + tvLicence + insurance
                + carBills;

        return totalEssentialOutgoing;
    }//essentialOutgoing()

    private static double otherCosts() {
        double totalOtherCosts, courseMaterial, clothing, socialActivities;

        System.out.println("OTHER COSTS");

        System.out.print(" ");

        System.out.println("Please enter how much your would like to spend on course material per week");
        courseMaterial = keyboard.nextDouble();

        System.out.println("Please enter how much you would like to spend on clothing per week");
        clothing = keyboard.nextDouble();

        System.out.println("Please enter how much you would like to spend on social activities per week");
        socialActivities = keyboard.nextDouble();

        totalOtherCosts = socialActivities + courseMaterial + clothing;

        return totalOtherCosts;
    }//otherCosts()


    public static void main(String[] args) {
        double theTotalIncome, theTotalEssentialOutgoing, theTotalOtherCosts, budget1, budget2, totalEachWeek;

        System.out.println("Welcome to the Student budget calculator!");
        System.out.println("If any of the questions you do not receive anything, please enter 0");

        System.out.println("Please enter the amount of weeks you expect to attend university");
        System.out.println("For example, the average university the autumn and spring semesters run for 36 weeks " +
                "including holidays");
        double weeksInAttendance = keyboard.nextDouble();

        //calling income method
        theTotalIncome = income();

        System.out.println("Your income for the year is £" + df.format(theTotalIncome));
        totalEachWeek = theTotalIncome / weeksInAttendance;

        System.out.println("You have £" + df.format(totalEachWeek) + " to spend");

        //calling ess outgoing method
        theTotalEssentialOutgoing = essentialOutgoing();

        //calculation
        budget1 = totalEachWeek - theTotalEssentialOutgoing;
        System.out.println("You have spent £" + df.format(theTotalEssentialOutgoing));
        System.out.println("The amount left after the essentials £" + df.format(budget1));

        //calling other costs method
        theTotalOtherCosts = otherCosts();

        budget2 = budget1 - theTotalOtherCosts;

        System.out.println("You have spent £" + df.format(theTotalOtherCosts) + " for other costs");

        System.out.println("You have £" + df.format(budget2) + " at the end of the week");

    }//main
}//class
