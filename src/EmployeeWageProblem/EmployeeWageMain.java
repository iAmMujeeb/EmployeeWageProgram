package EmployeeWageProblem;

import java.util.Scanner;

public class EmployeeWageMain {
    int totalWage;
    int dailyWage;

    static int condition() {
        int cond = (int) (Math.random() * 10) % 3;
        return cond;
    }

    int empWageBuilder() {
        int dailyWage = 0;
        int temp = 0;
        int temp1 = 0;
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
            if (empCheck != 0) {
                temp = temp + dailyWage;
                temp1 = temp;
            }
        }
        return temp1;
    }

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of companies you wanna calculate wage for = ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            switch (i){
                case 1:
                    EmployeeWageMain company1 = new EmployeeWageMain();
                    company1.totalWage = company1.empWageBuilder();
                    System.out.println("Monthly wage for company "+i+" => " + company1.totalWage);
                    break;
                case 2:
                    EmployeeWageMain company2 = new EmployeeWageMain();
                    company2.totalWage = company2.empWageBuilder();
                    System.out.println("Monthly wage for company "+i+" => " + company2.totalWage);
                    break;
                case 3:
                    EmployeeWageMain company3 = new EmployeeWageMain();
                    company3.totalWage = company3.empWageBuilder();
                    System.out.println("Monthly wage for company "+i+" => " + company3.totalWage);
                    break;
                case 4:
                    EmployeeWageMain company4 = new EmployeeWageMain();
                    company4.totalWage = company4.empWageBuilder();
                    System.out.println("Monthly wage for company "+i+" => " + company4.totalWage);
                    break;
                default:
                    System.out.println("Value Exceeded");

            }
        }
    }
}
