import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    int now = 2021;

    public Employee (String name, double salary, int workHours,int hireYear) {
        this.name = name;
        this.salary = salary;
        //haftalık çalışma saati
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax(){
        if(salary < 1000){
            this.salary = salary;
            System.out.println(name + "adlı çalışanın maaşı" + salary);
            return salary;

        } else {
            this.salary = (salary - salary*(0.03));
            System.out.println(name + "adlı çalışanın maaşı" + (salary - salary*(0.03)));
            return salary;
        }

    }

    public double bonus(){
        if (workHours > 40) {
            double salaryWithBonus = salary + ((workHours-40)*30);
            return salaryWithBonus;
        } else {
            return 0;
        }
    }
    public double raiseSalary(){
        double raisePercentage;
       if((now - hireYear) < 10)  {
           raisePercentage = 0.05;

        } else if (10 <= (now - hireYear) && (now - hireYear) < 20) {
           raisePercentage = 0.10;
       } else {
           raisePercentage = 0.15;
       }
       return (salary * raisePercentage);

    }



}
