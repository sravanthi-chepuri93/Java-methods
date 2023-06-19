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
        int RevNumber = reverse(456);d
        System.out.println(RevNumber);

    }
}
/*
Initialize a variable rev to 0. This variable will store the reversed number.
Enter a while loop that continues as long as n is greater than 0.
Inside the loop:
Calculate the remainder of n when divided by 10 using the modulo operator % and store it in a variable r. This gives the rightmost digit of n.
Update rev by multiplying it by 10 and adding the value of r. This effectively shifts the existing digits in rev one place to the left and adds the new digit r as the rightmost digit.
Divide n by 10 to remove the rightmost digit.
Once the loop finishes, return the value of rev.
In the main function, call the reverse function with the argument 456 and store the returned value in the variable RevNumber.
Print the value of RevNumber, which is the reversed form of the input number.
In this case, when the reverse function is called with 456 as the input, it will return 654. Therefore, the program will output 654.
re
 */