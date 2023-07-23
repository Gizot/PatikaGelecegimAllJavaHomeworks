public class Main {
    public static void main(String[] args) {
            Employee employee = new Employee("Gizem", 28000.0, 40, 2016);
            System.out.println(employee.name + "\n"
           +"Adı :" + employee.name + "\n"
            +"Maaşı :"+ employee.salary + "\n"
            +"Çalışma Saati : "+ employee.workHours + "\n"
            +"Başlangıç Yılı :"+ employee.hireYear + "\n"
            +"Vergi :" + (employee.salary-employee.tax() )+ "\n"
            +"Maaş Artışı :"+ employee.raiseSalary() + "\n"
            + "Vergi ve Bonuslar ile birlikte maaş : " + (employee.salary) + "\n"
            + "Toplam maaş:" + (employee.salary+employee.raiseSalary()));
        }
    }
