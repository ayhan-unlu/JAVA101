package ebebekPracticum.Homework.SalaryCalculator;

public class z_Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    double bonusPayment;
    double salaryIncrease;

    z_Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //method for run

    void run() {
        printInfo();
        taxAndBonus();
        salaryIncrease();
        salary();
    }

    //method for printing info of the employee

    void printInfo() {
        System.out.println("Name \t\t: " + this.name + "\nSalary \t\t: " + this.salary + "\nWorking Hours \t: " + this.workHours + "\nHire Year \t: " + this.hireYear);
    }

    //method for tax and bonus
    void taxAndBonus() {
        this.tax = (60.0 / 2000) * this.salary;
        System.out.println("Tax \t\t: " + this.tax);
        this.bonusPayment = (150.0 / 2000) * this.salary;
        System.out.println("Bonus \t\t: " + this.bonusPayment);
    }

    //method for calculation of salaryIncrease
    void salaryIncrease() {
        this.salaryIncrease = (300.0 / 2000) * this.salary;
        System.out.println("Salary Increase : " + this.salaryIncrease);
    }

    //method for salary calculation
    void salary() {
        System.out.println("Salary (Bonus \nIncluded,Tax \nExcluded) \t: " + (this.salary + this.bonusPayment - this.tax));
        this.salary += this.salaryIncrease;
        System.out.println("Total Salary \t: " + this.salary);
    }
}