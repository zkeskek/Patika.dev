
public class Employe {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int thisYear=2021;
    int weekHours=40;

    Employe(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        
    }
    
        

    
    public double tax() {
        double x;
        x=salary+salary*raiseSalary()+bonus();
        if(x>1000){
            return x*0.03;
        }
        return 0.0;
    }

    public double bonus() {
        double x=0;
        if(workHours-weekHours>0){
            x=30*(workHours-weekHours)*4;
           
        }
        return x;
    }

    public double raiseSalary() {
        double x=0;
        if(thisYear-hireYear<10) x=0.05;
        if(9<thisYear-hireYear&&thisYear-hireYear<20) x=0.10;
        if(thisYear-hireYear>19) x=0.15;
        
        return x;
    }

    public void employeeInfo(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Hire Year: "+hireYear);
        System.out.println("Raise Salary per: "+raiseSalary());
        System.out.println("Raise Salary: "+salary*raiseSalary());
        System.out.println("Work Hours : "+workHours);
        System.out.println("Uper Works: "+(workHours-weekHours)*4);
        System.out.println("Bonus: "+bonus());
        System.out.println("Tax: "+tax());
        double totalsalary=salary+salary*raiseSalary()+bonus()-tax();
        System.out.println("Total Salary: "+totalsalary);
        
        

    }
}