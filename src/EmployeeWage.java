public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    public static void main(String[] args) {
        int totalWage = 0;
        int dailyWage = 0;
        int totalHour=0;
        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;
        System.out.println("Welcome to employeewage");
        for (int i = 1; i<=20; i++){
            int empCheck = (int) (Math.random() * 10) % 3;
            switch (empCheck){
                case 2:
                    dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                    System.out.println("Employee is Full time!");
                    temp1 = FULL_TIME_HOUR;
                    break;
                case 1:
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    System.out.println("Employee is Part time!");
                    temp1 = PART_TIME_HOUR;
                    break;
                default:
                    System.out.println("Employee is Absent!");
            }
            System.out.println("Daily wage => " + dailyWage);
            if(empCheck!=0) {
                temp = temp+dailyWage;
                totalWage=temp;
                temp2=temp2+temp1;
                totalHour=temp2;
            }
            if(totalHour>=100) {
                System.out.println("100 hours completed");
                break;
            }
        }
        System.out.println("Monthly wage => " + totalWage);

    }
}