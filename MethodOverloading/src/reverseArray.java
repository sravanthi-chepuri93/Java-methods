public class reverseArray {
    static void revArr(int A[]){
        for(int i=A.length-1; i>=0;i--){
            System.out.print(A[i]+",");
        }
    }
    public static void main(String[] args){
        int A[] = { 3,4,5,6,7};
        revArr(A);

    }
}
/*
he code you provided is written in Java and it defines a static method called revArr. This method takes an integer array A as input and prints the elements of the array in reverse order, separated by commas.

Here's a breakdown of what the code does:

The method revArr is defined with a single parameter A, which represents the integer array.
Inside the method, there is a for loop that iterates over the elements of the array in reverse order. The loop starts from the last index (A.length - 1) and decrements i until it reaches 0.
Inside the loop, each element A[i] is printed using System.out.print, followed by a comma.
After the loop finishes, the main method is called.
In the main method, an integer array A is declared and initialized with the values {3, 4, 5, 6, 7}.
The revArr method is called, passing the array A as an argument.
When you run this code, the output will be: "7,6,5,4,3,".
 */