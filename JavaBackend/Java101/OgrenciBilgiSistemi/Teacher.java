

public class Teacher {
String name;
String mobilNo;
String branch;
Teacher(String name, String mobilNo, String branch){
    this.name=name;
    this.mobilNo=mobilNo;
    this.branch=branch;

}
    void print(){
        System.out.println("Adı : "+this.name);
        System.out.println("Telefonu : "+this.mobilNo);
        System.out.println("Bölümü : "+this.branch);
    }
}