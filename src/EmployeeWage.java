public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    public static void main(String[] args) {
        int dailyWage = 0;
        System.out.println("Welcome to Employee Wage Computation Program");
        int empCheck = (int) (Math.random() * 10) % 3;
        if (empCheck == 2) {
            dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
            System.out.println("Employee is Full time!");
        } else if(empCheck == 1) {
            dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Employee is Part time!");
        }else {
            System.out.println("Employee is Absent!");
        }
        System.out.println("Daily wage => " + dailyWage);
    }
}
