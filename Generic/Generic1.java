public class Generic1 {
    
    public <T> void printArr(T[] value){
        for (T i : value) {
            System.out.print(i+" ");
            
        }
        System.out.println();
    }

    public <T1, T2, T3> void printArr2(T1[] v1,T2[] v2, T3[] v3){
        for (T1 i : v1) {
            System.out.print(i+" ");
           
        }
        System.out.println();

        for (T2 i : v2) {
            System.out.print(i+" ");
           
        }
        System.out.println();
        
        for (T3 i : v3) {
            System.out.print(i+" ");
           
        }
        System.out.println();
    }
}
