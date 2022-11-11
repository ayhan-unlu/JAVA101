public class Salary_Calculator_Employee_Practicum_Ebebek_First_Case_221025 {

    String name;
    int salary;
    int workHours;
    int hireYear;
    
    double tax;
    double bonusPayment;
    double raiseSalary;
    int currentYear=2021;

    Salary_Calculator_Employee_Practicum_Ebebek_First_Case_221025(String name, int salary, int workHours, int hireYear) {
    
    this.name = name;
    this.salary = salary;
    this.workHours = workHours;
    this.hireYear = hireYear;
    this.tax = tax;
    }
    
    void run() {
    toString(1);
    tax();
    bonus();
        raiseSalary();
    }

    void toString(int a) {
        System.out.println("Adı \t\t\t: " + this.name + "\nMaaşı \t\t\t: " + this.salary + "\nÇalışma Saati \t\t: " + this.workHours + "\nBaşlangıç Yılı \t\t: " + this.hireYear);
    }
    
    void tax() {
        if (this.salary<1000){
            this.tax = 0 ;
        } else {this.tax = 0.03 * this.salary;
        }
        System.out.println("Vergi \t\t\t: " + this.tax);
    }
    
    void bonus() {
        if (workHours>40){
        this.bonusPayment = (30 * (this.workHours-40));
        } else {
            this.bonusPayment = 0;
        }
        System.out.println("Bonus \t\t\t: " + this.bonusPayment);
    }
    
    void raiseSalary() {
        int yearOfXP=currentYear-this.hireYear;
        if ((yearOfXP<10)&&(yearOfXP>0)){
            this.raiseSalary = 0.05 * this.salary;
        } else if ((yearOfXP>=10)&&(yearOfXP<20)){
            this.raiseSalary = 0.10 * this.salary;
        } else if (yearOfXP>=20){
            this.raiseSalary = 0.15 * this.salary;
        } else {
            this.raiseSalary = 0;
        }
        System.out.println("Maaş Artışı \t\t: " + this.raiseSalary);
        System.out.println("Vergiler ve Bonuslar ile birlikte Maaş : " + (this.salary + this.bonusPayment - this.tax));
        System.out.println("Toplam Maaş \t\t: " + (this.salary+this.raiseSalary+this.bonusPayment-this.tax));
    }

}