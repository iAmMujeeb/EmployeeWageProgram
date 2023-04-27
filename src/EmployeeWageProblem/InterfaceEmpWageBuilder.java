package EmployeeWageProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceEmpWageBuilder implements EmployeeWageBuilder {
    CompanyEmpWage[] companyTotalWage = new CompanyEmpWage[5];
    public static void main(String[] args) {
        InterfaceEmpWageBuilder compTotalWage = new InterfaceEmpWageBuilder();
        compTotalWage.totalCompWage();
    }
    public void getTotalwage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the company you wanna get total wage of");
        String name = scanner.next();
        switch (name){
            case "tcs":
                CompanyEmpWage tcs = new CompanyEmpWage();
                tcs.calculateWage();
                System.out.println(tcs.totalWage);
                break;
            case "jio":
                CompanyEmpWage jio = new CompanyEmpWage();
                jio.calculateWage();
                System.out.println(jio.totalWage);
                break;
            case "infosys":
                CompanyEmpWage infosys = new CompanyEmpWage();
                infosys.calculateWage();
                System.out.println(infosys.totalWage);
                break;
            default:
                System.out.println("No Data");
        }
    }
    public void totalCompWage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Choice");
        System.out.println("1.Calculate Company Wage");
        System.out.println("2.Access Company Wage");
        int choice = scanner.nextInt();
        if (choice==1) {
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
        }else{
            InterfaceEmpWageBuilder accessWage = new InterfaceEmpWageBuilder();
            accessWage.getTotalwage();
        }
    }
}
