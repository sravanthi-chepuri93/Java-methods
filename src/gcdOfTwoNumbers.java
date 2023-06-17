public class gcdOfTwoNumbers {
    static int gcd(int m, int n){
        while(m!=n){
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(gcd(25,15));

    }
}
/*
The gcd method takes two integer parameters, m and n, representing the two numbers for which we want to find the GCD.
The code enters a while loop that continues until m and n are equal.
Inside the loop, it checks if m is greater than n. If so, it subtracts n from m (m = m - n). This step reduces the value of m by n.
If m is not greater than n, it means n is greater. In that case, it subtracts m from n (n = n - m). This step reduces the value of n by m.
The loop continues until m and n become equal, at which point the loop exits.
Finally, the method returns the value of m, which is the GCD of the original m and n.
 */
