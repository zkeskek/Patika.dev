
public class Main {

    public static void main(String[] args) {
        Employe employe1=new Employe("Ali", 750, 45, 2020);
        Employe employe2=new Employe("Veli", 650, 42, 2010);
        Employe employe3=new Employe("Selami", 750, 43, 2000);

        employe1.employeeInfo();
        System.out.println(".................");
        employe2.employeeInfo();
        System.out.println(".................");
        employe3.employeeInfo();
        System.out.println(".................");
    }
}