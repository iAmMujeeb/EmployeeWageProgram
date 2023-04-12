import java.util.Scanner;

public class EmployeeWage {
    static int totalWage = 0;

    static int condition() {
        int cond = (int) (Math.random() * 10) % 3;
        return cond;
    }

    static int wageCalculation() {
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
        totalWage = wageCalculation();
        System.out.println("Monthly wage => " + totalWage);
    }
}