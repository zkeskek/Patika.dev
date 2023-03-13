public class Main5 {
    public static void main(String[] args) {
      String[] a={"102", "Java","Patika", "Dev"};
      Integer[] b={1,2,3,4};
      Character[] c={'J','A','V','A'};
Generic1 printx=new Generic1();
printx.printArr(a);
printx.printArr(b);
printx.printArr(c);

printx.printArr2(a,b,c);
printx.printArr2(b,c,a);
printx.printArr2(c,a,b);
    }
}
