package EmployeeWageProblem;


public class EmployeeWageBuilder {
    CompanyEmpWage[] companyTotalWage = new CompanyEmpWage[5];

    public static void main(String[] args) {
        int count = 1;
        EmployeeWageBuilder employeeWageMain = new EmployeeWageBuilder();

        CompanyEmpWage companyEmpWage = new CompanyEmpWage();
        companyEmpWage.calculateWage();
        employeeWageMain.companyTotalWage[0] = companyEmpWage;

        CompanyEmpWage companyEmpWage2 = new CompanyEmpWage();
        companyEmpWage2.calculateWage();
        employeeWageMain.companyTotalWage[1] = companyEmpWage2;

        CompanyEmpWage companyEmpWage3 = new CompanyEmpWage();
        companyEmpWage3.calculateWage();
        employeeWageMain.companyTotalWage[2] = companyEmpWage3;

        for (int i = 0; i < employeeWageMain.companyTotalWage.length; i++) {
            if (employeeWageMain.companyTotalWage[i] != null) {
                System.out.println("Total Wage for Company " + count + " = " + employeeWageMain.companyTotalWage[i]);
            }
            count++;
        }
    }
}