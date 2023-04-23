package EmployeeWageProblem;

public class InterfaceEmpWageBuilder implements EmployeeWageBuilder {
    CompanyEmpWage[] companyTotalWage = new CompanyEmpWage[5];
    public static void main(String[] args) {
        InterfaceEmpWageBuilder compTotalWage = new InterfaceEmpWageBuilder();
        compTotalWage.totalCompWage();
    }
    public void totalCompWage(){
        CompanyEmpWage[] companyTotalWage = new CompanyEmpWage[5];
        int count = 1;
        InterfaceEmpWageBuilder employeeWageMain = new InterfaceEmpWageBuilder();

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
