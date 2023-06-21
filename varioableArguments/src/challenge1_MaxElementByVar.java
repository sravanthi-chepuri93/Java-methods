public class challenge1_MaxElementByVar {
    static int max(int ...A) {
        if(A.length ==0) return Integer.MIN_VALUE;
        int maxNumber = A[0];
        for( int i=1;i<A.length;i++){
            if(A[i]>maxNumber)
                maxNumber = A[i];
        }
        return maxNumber;

    }
    public static void main(String[] args){
        int m = max();
        System.out.println(m);

    }
}
