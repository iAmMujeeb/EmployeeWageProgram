package EmployeeWageProblem;

import java.util.ArrayList;

public class CompanyEmpWage {

    ArrayList<Integer> companyTotalWage = new ArrayList<>();
    ArrayList<Integer> companyDailyWage = new ArrayList<>();

    int totalWage;
    final int WAGE_PER_HOUR = 20;
    final int FULL_TIME_HOUR = 8;
    final int PART_TIME_HOUR = 4;

    int condition() {
        int cond = (int) (Math.random() * 10) % 3;
        return cond;
    }

    public void calculateWage() {
        int dailyWage = 0;
        int temp = 0;
        for (int i = 1; i <= 20; i++) {
            int empCheck = condition();
            switch (empCheck) {
                case 2:
                    dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                    System.out.println("Employee is Full time!");
                    break;
                case 1:
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    System.out.println("Employee is Part time!");
                    break;
                default:
                    System.out.println("Employee is Absent!");
            }
            System.out.println("Daily wage => " + dailyWage);
            companyDailyWage.add(dailyWage);
            if (empCheck != 0) {
                temp = temp + dailyWage;
                totalWage = temp;
            }
        }
        companyTotalWage.add(totalWage);
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "companyTotalWage=" + companyTotalWage +
                ", companyDailyWage=" + companyDailyWage +
                '}';
    }
}
