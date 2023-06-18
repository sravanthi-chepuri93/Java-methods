public class ReverseNumber {
    static int reverse(int n){
        int rev=0;
        while(n>0){
            int r = n%10;
            rev = ( rev*10)+r;
            n = n/10;
        }
        return rev;

    }
    public static void main(String[] args){
        int RevNumber = reverse(456);
        System.out.println(RevNumber);

    }
}
