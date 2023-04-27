package EmployeeWageProblem;

import java.util.ArrayList;

public class InterfaceEmpWageBuilder implements EmployeeWageBuilder {
    CompanyEmpWage[] companyTotalWage = new CompanyEmpWage[5];
    public static void main(String[] args) {
        InterfaceEmpWageBuilder compTotalWage = new InterfaceEmpWageBuilder();
        compTotalWage.totalCompWage();
    }
    public void totalCompWage(){
        ArrayList<CompanyEmpWage> companyList = new ArrayList<>();
        CompanyEmpWage tcs = new CompanyEmpWage();
        tcs.calculateWage();
        companyList.add(tcs);
        CompanyEmpWage jio = new CompanyEmpWage();
        jio.calculateWage();
        companyList.add(jio);
        CompanyEmpWage infosys = new CompanyEmpWage();
        infosys.calculateWage();
        companyList.add(infosys);
        System.out.println(companyList);
    }
}
